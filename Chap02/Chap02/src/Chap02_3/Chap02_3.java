package Chap02_3;

import java.util.Scanner;

public class Chap02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputMoney = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int[] a = new int[8];

		System.out.print("금액을 입력하시오>>");
		int money = inputMoney.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (money >= unit[i]) {
				a[i] = money / unit[i];
				money -= unit[i] * a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				System.out.println(unit[i] + "원 " + a[i] + "개");
		}

		inputMoney.close();
	}

}
