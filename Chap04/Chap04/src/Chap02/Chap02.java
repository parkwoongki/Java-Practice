package Chap02;

import java.util.Scanner;

class Grade{
	private int average;
	
	public Grade(int math, int science, int english){
		this.average = (math+science+english)/3;
	}
	
	public int average(){
		return this.average;
	}
}

public class Chap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}

}
