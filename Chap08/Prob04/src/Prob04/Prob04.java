package Prob04;

import java.io.FileReader;
import java.io.IOException;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		String path = "c:\\windows\\system.ini";
		int c = 0;
		int line_count = 1;
		String tmp = "";

		try {
			fin = new FileReader(path);

			System.out.println(path + " ������ �о� ����մϴ�.");

			while ((c = fin.read()) != -1) {
				tmp += (char) c;
				if ((char) c == '\n') {
					System.out.printf("%4d: %s", line_count++, tmp);
					tmp = "";
				}
			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}