package Prob09;

import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StringStack implements Stack {
	private int length, count;
	private String[] stack;

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return this.length;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return stack[--count];
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		stack[count++] = val;
		return true;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		this.length = scanner.nextInt();
		stack = new String[this.length];

		String str;
		count = 0;

		for (;;) {
			System.out.print("문자열 입력 >> ");
			str = scanner.next();
			if (str.equals("그만"))
				break;
			else if (count < this.length)
				push(str);
			else
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}

		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int i = 0; i < this.length; i++) {
			System.out.print(pop() + " ");
		}

		scanner.close();
	}
}

public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack ss = new StringStack();

		ss.run();
	}

}
