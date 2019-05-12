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

	/* �����ϴ� �޼��� */
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

	/* �����ϴ� �޼��� */
	public boolean delete() {
		System.out.print("������ ������ ��ġ>>");
		int n = scanner.nextInt();
		int i = 1;

		Shape p = start;

		try {
			while (p != null) {
				if (n == 1) { // n�� 1�� ����� ���� ���� �պκ��� ����� ��
					start = start.getNext();
					return true;
				} else if (i++ == n - 1) { // �� ���� �ٸ� ��° �� ��, ������ ������ �ٷ� ����
											// shape��
											// ������. ���� ��� 3�� 2-> 3-> 4���� 2����,
					Shape tmp = p.getNext(); // 3��° �ּҸ� ��������
					p.setNext(tmp.getNext()); // 3��° �ּ��� �װ��� next�� �����ͼ� 2��° p��
												// next��
												// ����. �� 2-> 4����
					return true;
				}
				p = p.getNext();
			}
		} catch (Exception nullPointerException) { // ���� �������� ������ ��, ���������ͼ���ó��
			System.out.println("������ �� �����ϴ�.");
			return false;
		}
		return false;
	}

	/* ��� ����Ʈ�� �����ִ� �޼��� */
	public void viewAll() {
		Shape p = start;

		while (p != null) {
			p.draw();
			p = p.getNext();
		}
	}

	/* ������ �޼��� */
	public boolean finish() {
		System.out.println("beauty�� �����մϴ�.");
		return true;
	}

	public void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		boolean isFin = false;

		do {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
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