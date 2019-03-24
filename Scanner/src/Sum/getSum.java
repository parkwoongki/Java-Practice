package Sum;

import java.util.Scanner;

public class getSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int result = 0;

		System.out.print("두 수를 입력하세요 : ");
		int num1 = num.nextInt();
		int num2 = num.nextInt();

		result = num1 + num2;
		
		System.out.println("두 수의 합은 : "+ result + "입니다.");

		num.close();
	}
}
