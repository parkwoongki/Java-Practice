package Chap03_14;

import java.util.Scanner;

public class Chap03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] course = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int[] score = { 95, 88, 76, 62, 55 };
		int i = 0;

		System.out.print("���� �̸�>>");
		String subject = scanner.next();

		for (i = 0; i < course.length; i++) {
			if (subject.equals(course[i]))
				break;
		}

		try {
			System.out.println(course[i] + "�� ������ " + score[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �����Դϴ�.");
		}

		scanner.close();
	}
}