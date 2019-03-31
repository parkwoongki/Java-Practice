package Chap02_5;

import java.util.Scanner;

public class Chap02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int[] length = new int[3];

		System.out.print("정수 3개를 입력하시오>>");
		for (int i = 0; i < 3; i++) {
			length[i] = a.nextInt();
		}

		if ((length[0] >= length[1]) && (length[0] >= length[2])
				&& (length[0] < length[1] + length[2]))
			System.out.println("삼각형이 됩니다.");
		else if (length[1] >= length[2] && length[1] >= length[0]
				&& (length[1] < length[0] + length[2]))
			System.out.println("삼각형이 됩니다.");
		else if (length[2] >= length[1] && length[2] >= length[0]
				&& (length[2] < length[1] + length[0]))
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 안됩니다.");

		a.close();
	}

}
