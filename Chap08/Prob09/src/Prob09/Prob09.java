package Prob09;

import java.io.File;

public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\temp");
		File[] subfiles = f.listFiles();
		int count = 0;

		System.out.println(f.getPath() + "���͸��� .txt ������ ��� �����մϴ�....");
		for (int i = 0; i < subfiles.length; i++) {
			String tmpPath = subfiles[i].getName();
			File tmpFile = subfiles[i];
			if (tmpPath.lastIndexOf(".txt") != -1) {
				System.out.println(tmpPath + " ����");
				tmpFile.delete();
				count++;
			}
		}
		System.out.println("�� " + count + "���� .txt ������ �����Ͽ����ϴ�.");
	}

}