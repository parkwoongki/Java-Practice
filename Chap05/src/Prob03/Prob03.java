package Prob03;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run(){
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���.>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	public Won2Dollar(int ratio) {
		// TODO Auto-generated constructor stub
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return 24000/this.ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	
}

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
