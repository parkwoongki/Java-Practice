package VectorPractice1;

import java.util.Vector;

public class VectorPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();

		v.add(5);
		v.add(4);
		v.add(-1);

		v.add(2, 100);

		System.out.println("���� ���� ��� ��ü �� : " + v.size());
		System.out.println("������ ���� �뷮 : " + v.capacity());

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}

		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}

}
