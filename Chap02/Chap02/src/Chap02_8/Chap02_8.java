package Chap02_8;

import java.util.Scanner;

public class Chap02_8 {

	public static boolean inRect(int p[]){
		if (((p[0] >= 100 && p[0] <= 200) && (p[1] >= 100 && p[1] <= 200)) // (x1,y1)이  직사각형 안에 있을 때
				|| ((p[2] >= 100 && p[2] <= 200) && (p[3] >= 100 && p[3] <= 200)) // (x2,y2)이  직사각형 안에 있을 때
				|| ((p[0] >= 200 && p[1] >= 200) && (p[2] <= 100 && p[3] <= 100)) // 직사각형이 기존 직사각형을 덮을 때1
				|| ((p[2] >= 200 && p[3] >= 200) && (p[0] <= 100 && p[1] <= 100)))  // 직사각형이 기존 직사각형을 덮을 때2
			 // 기타 새로 만든 좌표의 직사각형이 기존 직사각형 안에 포함될 때도
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int[] p = new int[4];

		System.out.print("x1, y1, x2, y2의 값을 차례대로 입력하세요 : ");
		for (int i = 0; i < 4; i++)
			p[i] = a.nextInt();

		if (inRect(p))		
			System.out.println("두 직사각형이 충돌합니다."); // 기타 새로 만든 좌표의 직사각형이 기존 직사각형 안에 포함될 때도
		else
			System.out.println("두 직사각형이 충돌하지 않습니다.");
		
		a.close();
	}

}
