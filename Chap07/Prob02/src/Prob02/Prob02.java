package Prob02;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		double avg = 0.0;

		for (int i = 'F'; i >= 'A'; i--) {
			a.add((char) i);
		}

		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 6; i++) {
			String c = scanner.next();
			if (c.charAt(0) != 'F')
				avg += a.indexOf(c.charAt(0)) - 1;
		}
		avg = avg / 6.0;

		System.out.println(avg);

		scanner.close();
	}
}
