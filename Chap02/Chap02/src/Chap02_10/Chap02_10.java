package Chap02_10;

import java.util.Scanner;

public class Chap02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double[] p1 = new double[3];
		double[] p2 = new double[3];

		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		for (int i = 0; i < p1.length; i++) {
			p1[i] = scanner.nextInt();
		}

		System.out.print("두번째 원의 중심과 반지름 입력>>");
		for (int i = 0; i < p2.length; i++) {
			p2[i] = scanner.nextInt();
		}

		if (Math.abs(Math.sqrt((p2[0] * p2[0]) + (p2[1] * p2[1])) - Math.sqrt((p1[0] * p1[0]) + (p1[1] * p1[1])))<= p1[2]
				+ p2[2])
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");

		scanner.close();
	}
}
