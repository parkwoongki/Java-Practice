package Prob04;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int rain = scanner.nextInt();
			if (rain == 0)
				break;

			v.add(rain);
			sum += rain;

			Iterator<Integer> it = v.iterator();
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}

			System.out.println("\n���� ��� " + sum / v.size());
		}

		scanner.close();
	}
}