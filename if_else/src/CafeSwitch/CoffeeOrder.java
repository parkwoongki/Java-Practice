package CafeSwitch;

import java.util.Scanner;

public class CoffeeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String drink = "";
		int price = 0;
		
		Scanner order = new Scanner(System.in);
		order.nextInt();
		
		switch (drink) {
		case "�Ƹ޸�ī��":
			price = 3500;
			break;
		case "���":
			price = 4000;
			break;
		case "����������":
			price = 3700;
			break;
		default:
			price = 9999;
		}

		if (price != 9999)
			System.out.println(drink + "�� ������ " + price + "�Դϴ�.");
		else 
			System.out.println("�ֹ��Ͻ� ��ǰ�� �ٽ� Ȯ�����ּ���.");
	}

}
