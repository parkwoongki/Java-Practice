package Prob12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		FileReader fin;
		int c;

		System.out.print("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다."
				+ "\n대상 파일명 입력>>");
		String path = scanner.next();

		try {
			fin = new FileReader(path);
			String tmp = "";
			while ((c = fin.read()) != -1) {
				tmp += (char) c;
				if (c == '\n') {
					v.add(tmp);
					tmp = "";
				}
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

		while (true) {
			System.out.print("검색할 단어나 문장>> ");
			String str = scanner.nextLine();
			if (str.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			Iterator<String> it = v.iterator();

			for (int i = 0; it.hasNext(); i++) {
				String tmp = it.next();
				if (tmp.indexOf(str) != -1)
					System.out.printf("%d: %s", i + 1, v.get(i));
			}
		}

		scanner.close();

	}
}
