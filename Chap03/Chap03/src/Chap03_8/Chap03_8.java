package Chap03_8;

import java.util.Scanner;

public class Chap03_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �?");
		int n = scanner.nextInt();

		int intArray[] = new int[n];

		for (int i = 0; i < n; i++) {
			int num = (int) (Math.random() * 100 + 1);
			for (int j = 0; j <= i; j++) {
				if (intArray[j] != num) {
					if (j == i)
						intArray[i] = num;
				} else if (intArray[j] == num) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%-3d", intArray[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}

		scanner.close();

		/* 2���� �迭�� Ǯ���� �ߴµ� ��Ǯ�� �� ��Ǯ����? */
		
		// Scanner scanner = new Scanner(System.in);
		// int row = 0;
		// int column = 0;
		// boolean overlap = false;
		//
		// System.out.println("���� �?");
		// int n = scanner.nextInt();
		//
		// // ���� ��� 24�̸� 10 10 4 �̷������� 3���� �����Ƿ� �Ʒ�ó�� ���� ������ ������ ���� ������ �������ִ� �۾�
		// row = n / 10 + 1;
		// column = n % 10; // ���� �������� ���� ����
		// int intArray[][] = new int[row][];
		//
		// // ������ ���� �°� �࿭�� �������ִ� �۾�
		// for (int i = 0; i < row; i++) {
		// intArray[i] = new int[10];
		// }
		// intArray[row - 1] = new int[column];
		//
		// for (int i = 0; i < intArray.length; i++) {
		// // ���ǹ� ���� : ���� ������ ���� �� ���� ������ column���� ó��
		// for (int j = 0; j < intArray[i].length; j++) {
		// intArray[i][j] = (int) (Math.random() * 100 + 1);
		// for (int k = 0; k < i + 1; k++)
		// for (int l = 0; l < j; l++)
		// if (intArray[k][l] == intArray[i][j])
		// if (i == k && j == k - 1)
		// overlap = true;
		//
		// if (overlap) {
		// j--;
		// overlap = false;
		// continue;
		// }
		// System.out.print(intArray[i][j] + "\t");
		// }
		// System.out.println();
		// }
	}
}