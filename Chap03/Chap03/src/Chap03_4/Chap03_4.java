package Chap03_4;

import java.util.Scanner;

public class Chap03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();

		char c = s.charAt(0);

		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print((char) (c - j + 1));
			}
			System.out.println();
		}

		scanner.close();
	}

}