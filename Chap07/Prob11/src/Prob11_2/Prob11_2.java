package Prob11_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

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
	HashMap<String, String> nationMap = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	public GameofNation() {
		// TODO Auto-generated constructor stub
		nationMap.put("����", "������");
		nationMap.put("�߽���", "�߽��ڽ�Ƽ");
		nationMap.put("��Ż����", "�θ�");
		nationMap.put("����", "����");
		nationMap.put("�߱�", "����¡");
		nationMap.put("����", "���");
		nationMap.put("ĳ����", "��Ÿ��");
		nationMap.put("�±�", "����");
		nationMap.put("�׸���", "���׳�");
	}

	/* ���� ���� �߰� */
	private void insert() {
		System.out.println("���� " + nationMap.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");

		while (true) {
			System.out.print("����� ���� �Է�" + (nationMap.size() + 1) + ">> ");
			String country = scanner.next();
			if (country.equals("�׸�"))
				break;
			String capital = scanner.next();

			if (nationMap.containsKey(country)) {
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}

			nationMap.put(country, capital);
		}
	}

	/* ���� */
	private void quiz() {
		while (true) {
			Set<String> keys = nationMap.keySet();
			Iterator<String> it = keys.iterator();

			while (true) {
				try {
					String key = it.next();
					System.out.println(key + "�� ������? ");
					String capital = scanner.next();
					if (capital.equals("�׸�"))
						break;

					if (capital.equals(nationMap.get(key)))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
				} catch (NoSuchElementException e) {
					it = keys.iterator();
					continue;
				}
			}
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

public class Prob11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameofNation gm = new GameofNation();

		gm.run();
	}
}