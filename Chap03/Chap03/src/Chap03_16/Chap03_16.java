package Chap03_16;

import java.util.Scanner;

public class Chap03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		String vs[] = { "��", "����", "����" };
		String user;

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

		do {
			/* ��ǻ�Ͱ� ���������� ���ϴ� ���� */
			int n = (int) (Math.random() * 3);
			String computer = null;
			for (int i = 0; i < 3; i++) {
				if (str[n].equals(str[i])) {
					computer = str[i];
					break;
				}
			}

			/* ����ڰ� ���������� ���ϴ� ���� */
			System.out.print("���� ���� ��!>>");
			user = scanner.next();

			/* ���� �� �ϴ� ���� */
			if (user.equals("�׸�"))
				break;

			/* ����� �� �ٷ� ó���ϰ� else���� ó������ �ʴ´�. */
			if (user.equals(computer))
				System.out.println("computer : " + computer + ", user : "
						+ user + ", �����ϴ�.");
			else {
				// ����� ���� �� ���� ���������� �Ͽ��� else ������ �������� ���ϹǷ�, �̱� ���� �� ���� �Ǵ��ϸ� �ȴ�.
				for (int i = 0; i < str.length; i++) {
					if (user.equals(str[i]))
						/*
						 * ���� ���� ���������� �迭�� �ϳ� �� �����ߴµ�, �ڼ��� ���� ���ϰ��� ������ �ٲ㼭 �����߱�
						 * ������, ���� ��ġ�� �ε����� �Ͽ��� ���Ͽ��� ��, �̰���� �ƴ��� �Ǵ��� �����ϴ�.
						 */
						if (computer.equals(vs[i]))
							System.out.println("computer : " + computer
									+ ", user : " + user + ", �̰���ϴ�.");
						else
							System.out.println("computer : " + computer
									+ ", user : " + user + ", �����ϴ�.");
				}
			}
		} while (true);

		System.out.println("������ �����մϴ�...");
		
		scanner.close();
	}
}
