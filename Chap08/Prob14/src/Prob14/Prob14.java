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
			System.out.print("\t\t" + f.length() + "����Ʈ");
			System.out.println("\t\t" + f.getName());
			// System.out.printf("\t������ �ð� : %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		File f1 = new File("c:\\");

		System.out.println("***** ���� Ž�����Դϴ�. *****");
		System.out.println("[" + f1.getPath() + "]");

		listDirectory(f1);

		String path = f1.getPath();
		File f2 = null;

		while (true) {
			System.out.print(">>");
			String tmp = scanner.next();

			// ������
			if (tmp.equals("�׸�"))
				break;

			// ���丮 ����
			if (tmp.equals("mkdir")) {
				tmp = scanner.next();
				File newDir = new File(path + tmp);
				if (!newDir.exists())
					newDir.mkdir();
				else
					System.out.println("�̹� �����ϴ� �����Դϴ�.");
			}

			// �����ϱ�
			if (tmp.equals("rename")) {
				tmp = scanner.next();
				File newName = new File(path + tmp);
				tmp = scanner.nextLine();
				newName.renameTo(new File(path + tmp));
				if (tmp.isEmpty())
					System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�.!");
			} else if (tmp.equals("..")) { // �ڷΰ���
				path = f2.getParent();
				System.out.println(path);
			} else
				// ����
				path += tmp + "\\";

			f2 = new File(path);
			System.out.println("[" + f2.getPath() + "]");

			listDirectory(f2);

		}

		scanner.close();
	}
}