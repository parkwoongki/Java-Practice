package Chap02_2;

import java.util.Scanner;

public class Chap02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("2�ڸ� ���� �Է� (10~99)>>");
		int n = scanner.nextInt();

		if ((n % 10) == (n / 10))
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�!");
		else
			System.out.println("No.. 10�� �ڸ��� 1�� �ڸ��� �ٸ��׿�..");

		scanner.close();
	}
}