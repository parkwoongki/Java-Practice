package Chap02_12_2;

import java.util.Scanner;

public class Chap02_12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] s = new String[3];
		int result = 0;

		System.out.print("연산>>");
		for (int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}

		switch (s[1]) {
		case "+":
			result = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
			break;
		case "-":
			result = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
			break;
		case "*":
			result = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
			break;
		case "/":
			result = Integer.parseInt(s[0]) / Integer.parseInt(s[2]);
			break;
		}
		
		System.out.println(s[0] + s[1] + s[2] + "의 계산 결과는 " + result);

		scanner.close();
	}

}
