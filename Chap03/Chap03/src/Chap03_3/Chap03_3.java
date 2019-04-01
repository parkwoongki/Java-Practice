package Chap03_3;

import java.util.Scanner;

public class Chap03_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}
