package Prob01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c = 0;

		try {
			fout = new FileWriter("c:\\Temp\\phone.txt");

			System.out.println("전화번호 입력 프로그램입니다.");

			while (true) {
				System.out.print("이름 전화번호 >> ");
				String name = scanner.next();
				if (name.equals("그만"))
					break;
				String phone = scanner.next();

				fout.write(name + " " + phone, 0,
						(name.length() + phone.length() + 1));
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 실패");
		}

		scanner.close();
	}
}
