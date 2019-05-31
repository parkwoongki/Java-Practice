package Prob13;

import java.io.File;
import java.util.Scanner;

public class Prob13 {
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
			if (tmp.equals("그만"))
				break;
			if (tmp.equals("..")) {
				path = f2.getParent();
				System.out.println(path);
			} else
				path += tmp + "\\";

			f2 = new File(path);
			System.out.println("[" + f2.getPath() + "]");

			listDirectory(f2);
		}

		scanner.close();
	}
}
