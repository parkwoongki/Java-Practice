package Chap03_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap03_15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean isOK = true;
		int n = 0, m = 0;

		while (true) {
			try {
				isOK = true;
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scanner.nextInt();
				m = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
				isOK = false;
			} finally {
				if (isOK)
					break;
			}
		}

		System.out.print(n + "x" + m + "=" + n * m);
		
		scanner.close();
	}

}