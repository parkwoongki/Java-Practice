package Prob08;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class PositivePoint extends Point {

	public PositivePoint() {
		// TODO Auto-generated constructor stub
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		// TODO Auto-generated constructor stub
		super(0, 0);
		this.move(x, y); // �������̵� �� �Ϳ� move�� �ؾ���
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if (x > 0 && y > 0)
			super.move(x, y);
	}

	public String toString() {
		return ("(" + getX() + "," + getY() + ")�� ��");
	}
}

public class Prob08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}

}
