package Prob03;

import java.util.HashMap;
import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>(10);
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		for (int i = 0; i < 10; i++) {
			System.out.print("���� �̸�, �α� >> ");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;

			int count = scanner.nextInt();

			nations.put(name, count);
		}

		while (true) {
			System.out.print("�α� �˻� >> ");
			String name = scanner.next();

			if (name.equals("�׸�"))
				break;

			if (nations.containsKey(name))
				System.out.println(name + "�� �α��� " + nations.get(name));
			else
				System.out.println(name + " ����� �����ϴ�.");
		}

		scanner.close();
	}

}