package Sum;

import java.util.Scanner;

public class getSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int result = 0;

		System.out.print("�� ���� �Է��ϼ��� : ");
		int num1 = num.nextInt();
		int num2 = num.nextInt();

		result = num1 + num2;
		
		System.out.println("�� ���� ���� : "+ result + "�Դϴ�.");

		num.close();
	}
}
