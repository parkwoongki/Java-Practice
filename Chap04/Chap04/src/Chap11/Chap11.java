package Chap11;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

class Add {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return this.a + this.b;
	}
}

class Sub {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return this.a - this.b;
	}
}

class Mul {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return this.a * this.b;
	}
}

class Div {
	private int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return this.a / this.b;
	}
}

public class Chap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b;
		String mode;

		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		mode = scanner.next();

		switch (mode) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}

		scanner.close();
	}

}