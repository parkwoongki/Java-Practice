package Chap03_5;

import java.util.Scanner;

public class Chap03_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[10];

		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 3 == 0)
				System.out.println(intArray[i]);
		}

		scanner.close();
	}

}
