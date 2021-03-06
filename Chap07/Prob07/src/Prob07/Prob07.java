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
		System.out.println("미래장학금관리시스템입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = scanner.next();
			double grade = scanner.nextDouble();
			h.put(name, grade);
		}

		System.out.print("장학생 선발 학점 기준 입력>> ");
		double ref = scanner.nextDouble();

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();

		System.out.print("장학생 명단 : ");
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
