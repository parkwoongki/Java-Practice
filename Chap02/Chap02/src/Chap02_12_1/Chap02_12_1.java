package Chap02_12_1;

import java.util.Scanner;

public class Chap02_12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] s = new String[3];
		int result = 0;
		
		System.out.print("연산>>");
		for (int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}

		if (s[1].equals("+"))
			result = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
		if (s[1].equals("-"))
			result = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
		if (s[1].equals("*"))
			result = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
		if (s[1].equals("/"))
			result = Integer.parseInt(s[0]) / Integer.parseInt(s[2]);

		System.out.println(s[0] + s[1] + s[2] + "의 계산 결과는 " + result);

		scanner.close();
	}

}
