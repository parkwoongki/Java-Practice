package Prob11;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Nation {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		// TODO Auto-generated constructor stub
		this.country = country;
		this.capital = capital;
	}

	public String getCapital() {
		return this.capital;
	}

	public String getCountry() {
		return this.country;
	}
}

class GameofNation {
	Vector<Nation> v = new Vector<>();
	Scanner scanner = new Scanner(System.in);

	public GameofNation() {
		// TODO Auto-generated constructor stub
		v.add(new Nation("����", "������"));
		v.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		v.add(new Nation("��Ż����", "�θ�"));
		v.add(new Nation("����", "�θ�"));
		v.add(new Nation("�߱�", "����¡"));
		v.add(new Nation("����", "���"));
		v.add(new Nation("ĳ����", "��Ÿ��"));
		v.add(new Nation("�±�", "����"));
		v.add(new Nation("�׸���", "���׳�"));
	}

	/* ���� ���� �߰� */
	private void insert() {
		System.out.println("���� " + v.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");

		while (true) {
			System.out.print("����� ���� �Է�" + (v.size() + 1) + ">> ");
			String country = scanner.next();
			if (country.equals("�׸�"))
				break;
			String capital = scanner.next();

			Iterator<Nation> it = v.iterator();
			boolean isSame = false;

			while (it.hasNext()) {
				if (country.equals(it.next().getCountry())) {
					System.out.println(country + "�� �̹� �ֽ��ϴ�!");
					isSame = true;
					break;
				}
			}

			if (!isSame)
				v.add(new Nation(country, capital));
		}
	}

	/* ���� */
	private void quiz() {
		while (true) {
			int randIndex = (int) (Math.random() * v.size());
			Nation prob = v.get(randIndex);

			System.out.print(prob.getCountry() + "�� ������? ");

			String capital = scanner.next();
			if (capital.equals("�׸�"))
				break;
			if (capital.equals(prob.getCapital()))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");
		}
	}

	/* �� */
	private boolean finish() {
		return true;
	}

	/* ���� */
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int n = scanner.nextInt();
			boolean isFinish = false;

			switch (n) {
			case 1:
				insert();
				break;
			case 2:
				quiz();
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

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameofNation gm = new GameofNation();

		gm.run();
	}
}