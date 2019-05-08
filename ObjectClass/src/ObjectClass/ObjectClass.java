package ObjectClass;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x + ", " + y;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p = (Point) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class ObjectClass {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2, 3);

		print(p);
		
		Point a = new Point(2,3);
		Point b = new Point(4,6);
		Point c = new Point(2,3);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
