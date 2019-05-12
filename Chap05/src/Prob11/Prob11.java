package Prob11;

import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	abstract void setValue(int a, int b);

	abstract int calculate();
}

class Add extends Calc {

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a + b;
	}

}

class Sub extends Calc {

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a - b;
	}

}

class Mul extends Calc {

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a * b;
	}

}

class Div extends Calc {

	@Override
	void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a / b;
	}

}

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String n = scanner.next();

		int result = 0;
		switch (n) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			break;
		}

		System.out.println(result);

		scanner.close();
	}
}
