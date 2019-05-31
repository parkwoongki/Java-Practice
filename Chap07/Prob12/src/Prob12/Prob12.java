package Prob12;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

class EnglishWord {
	private String eng;
	private String kor;

	public EnglishWord(String eng, String kor) {
		// TODO Auto-generated constructor stub
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return this.eng;
	}

	public String getKor() {
		return this.kor;
	}
}

class EnglishStudy {
	private Vector<EnglishWord> v = new Vector<>();
	Scanner scanner = new Scanner(System.in);

	public EnglishStudy() {
		// TODO Auto-generated constructor stub
		v.add(new EnglishWord("apple", "���"));
		v.add(new EnglishWord("banana", "�ٳ���"));
		v.add(new EnglishWord("love", "���"));
		v.add(new EnglishWord("baby", "�Ʊ�"));
		v.add(new EnglishWord("human", "�ΰ�"));
		v.add(new EnglishWord("fault", "����"));
		v.add(new EnglishWord("emotion", "����"));
		v.add(new EnglishWord("painting", "�׸�"));
		v.add(new EnglishWord("animal", "����"));
		v.add(new EnglishWord("eye", "��"));
	}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println("���� " + v.size()
				+ "���� �ܾ ��� �ֽ��ϴ�. -1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
		while (true) {
			String[] list = { "", "", "", "" };
			int answer = (int) (Math.random() * 4); // ���⿡ +1 �Ѱ� ����
			int randWord = (int) (Math.random() * v.size());

			System.out.println(v.get(randWord).getEng() + "?");
			list[answer] = v.get(randWord).getKor();
			// System.out.println(list[answer] + " " + (answer+1)); // ����

			for (int i = 0; i < 3; i++) {
				int index;
				int randindex;
				while (true) {
					boolean isTrue = false;
					index = (int) (Math.random() * 4);
					randindex = (int) (Math.random() * v.size());

					if (list[index].equals("")) {
						for (int j = 0; j < list.length; j++) {
							if (list[j].equals(v.get(randindex).getKor())) {
								isTrue = true;
							}
						}
						if (isTrue)
							continue;
						else {
							list[index] = v.get(randindex).getKor();
							break;
						}
					}
				}
			}

			for (int i = 0; i < list.length; i++) {
				System.out.print("(" + (i + 1) + ")" + list[i] + " ");
			}
			System.out.println();

			int yourAnswer = 0;
			try {
				yourAnswer = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!");
				scanner.nextLine(); // ���� ����
				continue;
			}

			if (yourAnswer == -1)
				break;
			if (yourAnswer == answer + 1)
				System.out.println("Excellent !!");
			else
				System.out.println("No. !!");
		}
		System.out.println();
	}

	private void insert() {
		// TODO Auto-generated method stub
		System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
		while (true) {
			System.out.print("���� �ѱ� �Է� >> ");
			String eng = scanner.next();
			if (eng.equals("�׸�"))
				break;
			String kor = scanner.next();

			v.add(new EnglishWord(eng, kor));
		}
		System.out.println();
	}

	private boolean finish() {
		// TODO Auto-generated method stub
		System.out.println("\"��ǰ����\"�� �����մϴ�.");
		return true;
	}

	public void run() {
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");
		boolean isFinish = false;

		while (true) {
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>> ");
			int n = scanner.nextInt();

			switch (n) {
			case 1:
				test();
				break;
			case 2:
				insert();
				break;
			default:
				isFinish = finish();
				break;
			}
			if (isFinish)
				break;
		}
	}
}

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnglishStudy es = new EnglishStudy();

		es.run();
	}
}