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
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		this.length = scanner.nextInt();
		stack = new String[this.length];

		String str;
		count = 0;

		for (;;) {
			System.out.print("���ڿ� �Է� >> ");
			str = scanner.next();
			if (str.equals("�׸�"))
				break;
			else if (count < this.length)
				push(str);
			else
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}

		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
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
