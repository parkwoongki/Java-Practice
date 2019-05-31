package Prob14;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prob14 {
	public static void listDirectory(File dir) {
		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			String res = "";
			if (f.isFile())
				res = "file";
			else
				res = "dir";
			System.out.print(res);
			System.out.print("\t\t" + f.length() + "바이트");
			System.out.println("\t\t" + f.getName());
			// System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File f1 = new File("c:\\");

		System.out.println("***** 파일 탐색기입니다. *****");
		System.out.println("[" + f1.getPath() + "]");

		listDirectory(f1);

		String path = f1.getPath();
		File f2 = null;

		while (true) {
			System.out.print(">>");
			String tmp = scanner.next();

			// 끝내기
			if (tmp.equals("그만"))
				break;

			// 디렉토리 생성
			if (tmp.equals("mkdir")) {
				tmp = scanner.next();
				File newDir = new File(path + tmp);
				if (!newDir.exists())
					newDir.mkdir();
				else
					System.out.println("이미 존재하는 폴더입니다.");
			}

			// 수정하기
			if (tmp.equals("rename")) {
				tmp = scanner.next();
				File newName = new File(path + tmp);
				tmp = scanner.nextLine();
				newName.renameTo(new File(path + tmp));
				if (tmp.isEmpty())
					System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
			} else if (tmp.equals("..")) { // 뒤로가기
				path = f2.getParent();
				System.out.println(path);
			} else
				// 들어가기
				path += tmp + "\\";

			f2 = new File(path);
			System.out.println("[" + f2.getPath() + "]");

			listDirectory(f2);

		}

		scanner.close();
	}
}
