package Prob02;

class Circle {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle(" + this.x + "," + this.y + ")������" + this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Circle c = (Circle) obj;

		if (this.x == c.x)
			return true;
		else
			return false;
	}
}

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);

		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);

		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}

}
