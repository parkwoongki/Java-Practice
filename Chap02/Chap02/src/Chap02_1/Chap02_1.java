package Chap02_1;

import java.util.Scanner;

public class Chap02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double won, dollar;
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		won = scanner.nextDouble();
		dollar = won/1100;
		
		System.out.println("$" + dollar + "�Դϴ�.");
		
		scanner.close();
	}

}