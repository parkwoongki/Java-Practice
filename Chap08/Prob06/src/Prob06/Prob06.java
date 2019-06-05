package Prob06;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		int c1 = 0, c2 = 0;

		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		s1 = scanner.next();

		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		s2 = scanner.next();

		try {
			FileInputStream fin1 = new FileInputStream(s1);
			FileInputStream fin2 = new FileInputStream(s2);

			InputStreamReader in1 = new InputStreamReader(fin1, "MS949");
			InputStreamReader in2 = new InputStreamReader(fin2, "MS949");

			FileWriter fnew = new FileWriter("appended.txt");

			// ���������� read��
			while ((c1 = in1.read()) != -1 || (c2 = in2.read()) != -1) {
				if (c1 != -1 && c2 == 0)
					fnew.write((char) c1);
				else
					fnew.write((char) c2);
			}

			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");

			fin1.close();
			fin2.close();
			in1.close();
			in2.close();
			fnew.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}

		scanner.close();
	}
}