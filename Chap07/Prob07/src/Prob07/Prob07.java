package Prob07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Prob07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> h = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̷����бݰ����ý����Դϴ�.");

		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��� ����>> ");
			String name = scanner.next();
			double grade = scanner.nextDouble();
			h.put(name, grade);
		}

		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double ref = scanner.nextDouble();

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();

		System.out.print("���л� ���� : ");
		String list = "";
		while (it.hasNext()) {
			String key = it.next();
			if (ref <= h.get(key))
				list = list + key + " ";
		}
		System.out.println(list);

		scanner.close();
	}

}