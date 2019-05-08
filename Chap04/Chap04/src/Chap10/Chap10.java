package Chap10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		int i = 0;
		for (i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				break;
		}
		return eng[i];
	}
}

class DicApp {
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String kor = scanner.next();
			if (kor.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(kor);
			System.out.println(kor + "�� " + eng);
		}
	}
}

public class Chap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicApp dic = new DicApp();
		dic.run();
	}
}