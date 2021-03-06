package Chap04;

class Rectangle {
	private int x, y;
	private int width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return (this.width) * (this.height);
	}

	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")에서 크기가 "
				+ this.width + "x" + this.height + "인 사각형");
	}

	public boolean contains(Rectangle r) {
		return (this.x < r.x && (this.width + this.x) > (r.width + r.x))
				&& (this.y < r.y && (this.width + this.y) > (r.width + r.y));
	}
}

public class Chap04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s을 포함합니다.");
	}

}
