package Prob01;

class MyPoint {
	private int x;
	private int y;

	public MyPoint(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point("+this.x+","+this.y+")";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		MyPoint q = (MyPoint) obj;

		if (this.x == q.x && this.y == q.y)
			return true;
		else
			return false;
	}
}

public class Prob01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p.toString());

		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
