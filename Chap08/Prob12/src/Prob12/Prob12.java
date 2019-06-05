package Prob12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		FileReader fin;
		int c;

		System.out.print("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�."
				+ "\n��� ���ϸ� �Է�>>");
		String path = scanner.next();

		try {
			fin = new FileReader(path);
			String tmp = "";
			while ((c = fin.read()) != -1) {
				tmp += (char) c;
				if (c == '\n') {
					v.add(tmp);
					tmp = "";
				}
			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}

		while (true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String str = scanner.nextLine();
			if (str.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			Iterator<String> it = v.iterator();

			for (int i = 0; it.hasNext(); i++) {
				String tmp = it.next();
				if (tmp.indexOf(str) != -1)
					System.out.printf("%d: %s", i + 1, v.get(i));
			}
		}

		scanner.close();

	}
}