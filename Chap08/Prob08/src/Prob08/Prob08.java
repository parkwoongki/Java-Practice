package Prob08;

import java.io.File;

public class Prob08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\");
		File[] subfiles = f.listFiles();

		File tmp = subfiles[0];
		long big = 0;

		for (int i = 1; i < subfiles.length; i++) {
			if (subfiles[i].isDirectory())
				continue;
			if (subfiles[i].length() > big) {
				big = subfiles[i].length();
				tmp = subfiles[i];
			}
		}
		System.out.println("���� ū ������ " + tmp.getPath() + " " + tmp.length());
	}

}