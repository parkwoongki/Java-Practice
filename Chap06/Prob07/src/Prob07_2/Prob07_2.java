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

			if (str.equals("그만"))
				break;
			else
				System.out.println("어절 개수는 " + s.length);
		}

		System.out.println("종료합니다...");

		scanner.close();
	}

}
