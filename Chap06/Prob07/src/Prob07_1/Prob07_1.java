package Prob07_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String str = scanner.nextLine();

			StringTokenizer st = new StringTokenizer(str, " ");

			if (str.equals("�׸�"))
				break;
			else
				System.out.println("���� ������ " + st.countTokens());
		}

		System.out.println("�����մϴ�...");

		scanner.close();
	}
}