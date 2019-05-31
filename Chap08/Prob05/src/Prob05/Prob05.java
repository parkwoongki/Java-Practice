package Prob05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		int c1 = 0, c2 = 0;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		s1 = scanner.next();

		System.out.print("두번째 파일 이름을 입력하세요>>");
		s2 = scanner.next();
		
		System.out.println(s1 + "와 " + s2 + "를 비교합니다.");
		try {
			FileInputStream fin1 = new FileInputStream(s1);
			FileInputStream fin2 = new FileInputStream(s2);

			while (true) {
				c1 = fin1.read();
				c2 = fin2.read();
				if (c1 == -1 || c2 == -1) {
					if (c1 == -1 && c2 == -1) {
						System.out.println("파일이 같습니다.");
						break;
					} else {
						// 앞부분만 같고 나머지 뒤가 다를 때, byte 데이터를 비교하는 것과 별개로 int 데이터로도
						// 비교
						System.out.println("파일이 다릅니다.");
						break;
					}
				}

				if ((byte) c1 != (byte) c2) {
					System.out.println("파일이 다릅니다.");
					break;
				}
			}

			fin1.close();
			fin2.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

		scanner.close();
	}
}
