package Chap02_7;

import java.util.Scanner;

public class Chap02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.print("x값을 입력하세요 : ");
		int x = a.nextInt();

		System.out.print("y값을 입력하세요 : ");
		int y = a.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			System.out.println("직사각형 안에 존재합니다.");
		else
			System.out.println("직사각형 밖에 존재합니다.");
		
		a.close();
	}

}
