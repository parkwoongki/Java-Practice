package Prob01;

import java.util.Scanner;
import java.util.Vector;

public class Prob01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int max = 0;

		System.out.print("����(-1�� �Էµ� ������)>> ");
		while (true) {
			int num = 0;
			num = scanner.nextInt();
			if (num == -1)
				break;
			v.add(num);
		}

		max = v.get(0);
		if (v.size() == 0)
			System.out.println("Vector�� ����ֽ��ϴ�");
		else {
			for (int i = 1; i < v.size(); i++) {
				if (max < v.get(i))
					max = v.get(i);
			}
			System.out.println("���� ū ���� " + max);
		}
		
		scanner.close();
	}
}