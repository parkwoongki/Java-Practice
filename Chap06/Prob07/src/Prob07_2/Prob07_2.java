package Prob07_2;

import java.util.Scanner;

public class Prob07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String str = scanner.nextLine();
			String[] s = str.split(" ");

			if (str.equals("�׸�"))
				break;
			else
				System.out.println("���� ������ " + s.length);
		}

		System.out.println("�����մϴ�...");

		scanner.close();
	}

}
