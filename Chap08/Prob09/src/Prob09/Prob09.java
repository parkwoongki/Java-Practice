package Prob09;

import java.io.File;

public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\temp");
		File[] subfiles = f.listFiles();
		int count = 0;

		System.out.println(f.getPath() + "디렉터리의 .txt 파일을 모두 삭제합니다....");
		for (int i = 0; i < subfiles.length; i++) {
			String tmpPath = subfiles[i].getName();
			File tmpFile = subfiles[i];
			if (tmpPath.lastIndexOf(".txt") != -1) {
				System.out.println(tmpPath + " 삭제");
				tmpFile.delete();
				count++;
			}
		}
		System.out.println("총 " + count + "개의 .txt 파일을 삭제하였습니다.");
	}

}
