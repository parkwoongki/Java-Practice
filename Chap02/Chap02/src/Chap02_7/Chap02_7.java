package Chap02_7;

import java.util.Scanner;

public class Chap02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.print("x���� �Է��ϼ��� : ");
		int x = a.nextInt();

		System.out.print("y���� �Է��ϼ��� : ");
		int y = a.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			System.out.println("���簢�� �ȿ� �����մϴ�.");
		else
			System.out.println("���簢�� �ۿ� �����մϴ�.");
		
		a.close();
	}

}
