package Prob12;

import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}

}

class Rect extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}

}

class Circle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}

}

class GraphicEditor {
	Scanner scanner = new Scanner(System.in);
	Shape start, last, obj, tmp;
	boolean isFirst = true;

	/* 삽입하는 메서드 */
	public void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}

		if (isFirst) {
			start = obj;
			last = start;
			isFirst = false;
		}

		last.setNext(obj);
		last = obj;
	}

	/* 삭제하는 메서드 */
	public boolean delete() {
		System.out.print("삭제할 도형의 위치>>");
		int n = scanner.nextInt();
		int i = 1;

		Shape p = start;

		try {
			while (p != null) {
				if (n == 1) { // n이 1일 때라는 것은 가장 앞부분을 지우는 것
					start = start.getNext();
					return true;
				} else if (i++ == n - 1) { // 그 외의 다른 번째 일 때, 삭제할 구간의 바로 앞의
											// shape을
											// 가져옴. 예를 들어 3면 2-> 3-> 4에서 2에서,
					Shape tmp = p.getNext(); // 3번째 주소를 가져오고
					p.setNext(tmp.getNext()); // 3번째 주소의 그것의 next를 가져와서 2번째 p의
												// next에
												// 넣음. 즉 2-> 4가됨
					return true;
				}
				p = p.getNext();
			}
		} catch (Exception nullPointerException) { // 없는 구간까지 참조할 때, 널포인터익셉션처리
			System.out.println("삭제할 수 없습니다.");
			return false;
		}
		return false;
	}

	/* 모든 리스트를 보여주는 메서드 */
	public void viewAll() {
		Shape p = start;

		while (p != null) {
			p.draw();
			p = p.getNext();
		}
	}

	/* 끝내는 메서드 */
	public boolean finish() {
		System.out.println("beauty을 종료합니다.");
		return true;
	}

	public void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		boolean isFin = false;

		do {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int n = scanner.nextInt();

			switch (n) {
			case 1:
				insert();
				break;
			case 2:
				if (delete())
					viewAll();
				break;
			case 3:
				viewAll();
				break;
			case 4:
				isFin = finish();
				break;
			}
		} while (!isFin);
	}
}

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor GE = new GraphicEditor();

		GE.run();
	}

}
