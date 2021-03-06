package Chap10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
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
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.print("한글 단어?");
			String kor = scanner.next();
			if (kor.equals("그만"))
				break;
			String eng = Dictionary.kor2Eng(kor);
			System.out.println(kor + "은 " + eng);
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
