package Chap07;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	private Day[] todo;
	Scanner scanner = new Scanner(System.in);
	
	public MonthSchedule(int day) {
		todo = new Day[day];
		for (int i = 0; i < todo.length; i++) {
			todo[i] = new Day();
		}
	}

	public void input() {
		System.out.print("��¥(1~30)?");
		int day = scanner.nextInt();

		System.out.print("����(��ĭ���� �Է�)?");
		String work = scanner.next();
		todo[day - 1].set(work);
	}

	public void view() {
		System.out.print("��¥(1~30)?");
		int day = scanner.nextInt();

		System.out.print(day + "���� �� ���� ");
		todo[day - 1].show();
	}

	public boolean finish() {
		System.out.println("���α׷��� �����մϴ�.");
		return false;
	}

	public void run() {
		boolean isNotFin = true;

		System.out.println("�̹��� ������ ���� ���α׷�.");
		do {
			System.out.print("����(�Է�:1, ����:2, ������:3)>>");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				isNotFin = finish();
				break;
			default:
				System.out.println("�ش��ϴ� �ɼ��� �������� �ʽ��ϴ�.");
				break;
			}
			System.out.println();
		} while (isNotFin);
	}
}

public class Chap07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}