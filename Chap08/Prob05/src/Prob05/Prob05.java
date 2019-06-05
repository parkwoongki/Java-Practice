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
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		s1 = scanner.next();

		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		s2 = scanner.next();
		
		System.out.println(s1 + "�� " + s2 + "�� ���մϴ�.");
		try {
			FileInputStream fin1 = new FileInputStream(s1);
			FileInputStream fin2 = new FileInputStream(s2);

			while (true) {
				c1 = fin1.read();
				c2 = fin2.read();
				if (c1 == -1 || c2 == -1) {
					if (c1 == -1 && c2 == -1) {
						System.out.println("������ �����ϴ�.");
						break;
					} else {
						// �պκи� ���� ������ �ڰ� �ٸ� ��, byte �����͸� ���ϴ� �Ͱ� ������ int �����ͷε�
						// ��
						System.out.println("������ �ٸ��ϴ�.");
						break;
					}
				}

				if ((byte) c1 != (byte) c2) {
					System.out.println("������ �ٸ��ϴ�.");
					break;
				}
			}

			fin1.close();
			fin2.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}

		scanner.close();
	}
}