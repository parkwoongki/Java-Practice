package Chap02_4;

import java.util.Scanner;

public class Chap02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("중간 값은 ");
		
		if(arr[0] > arr[1]){
			if(arr[0] > arr[2]){
				if(arr[1]>arr[2])
					System.out.println(arr[1]);
				else
					System.out.println(arr[2]);
			}
			else
				System.out.println(arr[0]);
		}else if(arr[1] > arr[0]){
			if(arr[1] > arr[2]){
				if(arr[0]>arr[2])
					System.out.println(arr[0]);
				else System.out.println(arr[2]);
			}
			else
				System.out.println(arr[1]);
		}
			
		scanner.close();
	}
}
