package Chap02_6;

import java.util.Scanner;

public class Chap02_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameNum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		gameNum = scanner.nextInt();

		switch (gameNum / 10) {
		case 0:
			// 1�� �ڸ� �� �� ��
			if ((gameNum % 3 == 0) && (gameNum != 0))
				System.out.println("�ڼ�¦");
			break;
		default:
			// 2�� �ڸ� �� ��, 2�� �ڸ��� 3�� ��� �� ��
			if ((gameNum / 10) % 3 == 0) {
				// �� �� 1�� �ڸ��� 3�� ��� �� ��
				if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
					System.out.println("�ڼ�¦¦");
				// �� ��
				else
					System.out.println("�ڼ�¦");
				// 2�� �ڸ� �� ��, 1�� �ڸ��� 3�� ��� �϶�, 0 ����
			} else if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
				System.out.println("�ڼ�¦");
		}

		scanner.close();
	}

}
