package StaticCurrencyConverterExample;

import java.util.Scanner;

public class StaticCurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("환율(1달러)>> ");
		double rate = scanner.nextDouble();

		StaticCurrencyConverter.setRate(rate);

		System.out.println("백만원은 $" + StaticCurrencyConverter.toDollar(1000000)
				+ "입니다.");
		System.out.println("$100는 " + StaticCurrencyConverter.toKWR(100)
				+ "원입니다.");

		scanner.close();
	}

}
