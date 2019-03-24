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
		case "아메리카노":
			price = 3500;
			break;
		case "라뗴":
			price = 4000;
			break;
		case "에스프레소":
			price = 3700;
			break;
		default:
			price = 9999;
		}

		if (price != 9999)
			System.out.println(drink + "의 가격은 " + price + "입니다.");
		else 
			System.out.println("주문하실 제품을 다시 확인해주세요.");
	}

}
