package Chap02_6;

import java.util.Scanner;

public class Chap02_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameNum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시오>>");
		gameNum = scanner.nextInt();

		switch (gameNum / 10) {
		case 0:
			// 1의 자리 수 일 때
			if ((gameNum % 3 == 0) && (gameNum != 0))
				System.out.println("박수짝");
			break;
		default:
			// 2의 자리 수 중, 2의 자리가 3의 배수 일 때
			if ((gameNum / 10) % 3 == 0) {
				// 그 중 1의 자리도 3의 배수 일 때
				if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
					System.out.println("박수짝짝");
				// 그 외
				else
					System.out.println("박수짝");
				// 2의 자리 수 중, 1의 자리만 3의 배수 일때, 0 제외
			} else if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
				System.out.println("박수짝");
		}

		scanner.close();
	}

}
