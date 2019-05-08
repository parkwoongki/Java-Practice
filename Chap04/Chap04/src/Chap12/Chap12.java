package Chap12;

import java.util.Scanner;

class Seat {
	String[] seat = { "---", "---", "---", "---", "---", "---", "---", "---",
			"---", "---" }; // �ϴ� ��ĭ�̴�.

	public void setSeat(String name, int num) {
		seat[num - 1] = name; // ����̳İ� �ϸ� n-1��° �Ϳ� �����ؾߵ�
	}

	public String getSeat(int i) {
		return seat[i]; // �ش� ������ �̸��� �������� �޼���, �ݺ����̶� ���� ���
	}

	public void show() { // �ش� �¼� Ŭ������ �¼� ��Ȳ�� �����ִ� show()
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println("");
	}
}

class ReservationSystem {
	Scanner scanner;
	Seat[] seat = new Seat[3]; // 0:S, 1:A, 2:B

	public ReservationSystem() {
		scanner = new Scanner(System.in);
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
		}
	}

	/* �¼��� Ŭ������ �����ϴ� �޼��� */
	public int selectClass() {
		int seatClass;

		do {
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			seatClass = scanner.nextInt();
			if ((seatClass < 1) || (seatClass > 3))
				System.out.println("�ش��ϴ� �¼� Ŭ������ �����ϴ�. �ٽ� �Է��Ͻʽÿ�.");
		} while ((seatClass < 1) || (seatClass > 3));

		return seatClass;
	}

	/* �¼��� �����ϴ� �޼��� */
	public int selectSeatNum() {
		int num;

		do {
			System.out.print("��ȣ>>");
			num = scanner.nextInt();
			if ((num < 1) || (num > 10))
				System.out.println("�ش��ϴ� �¼� �����ϴ�. �ٽ� �Է��Ͻʽÿ�.");
		} while ((num < 1) || (num > 10));
		/* ���� �¼��� ������ �ݺ��ؼ� �ٽ� �¼��� ������ �� */

		return num;
	}

	/* �� �¼��� � Ŭ������ �¼������� �����ִ� �޼��� */
	public String classApl(int i) {
		if (i == 0)
			return "S>> ";
		else if (i == 1)
			return "A>> ";
		else
			return "B>> ";
	}

	/* �����ϴ� �޼��� */
	public void resv() {
		int seatClass = selectClass();

		System.out.print("�̸�>>");
		String name = scanner.next();

		/* �̹� ����Ǿ� �ִ� �¼��� �����ϸ� �ٽ� �����ϰ� �� */
		int num;
		do {
			num = selectSeatNum();
			if (seat[seatClass - 1].seat[num - 1].equals("---"))
				break;
			System.out.println("�̹� ������ �����մϴ�.");
		} while (true);
		seat[seatClass - 1].setSeat(name, num);
	}

	/* �� �¼� ��Ȳ�� ��ȸ�ϴ� �޼��� */
	public void curSeatView() {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(classApl(i));
			seat[i].show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}

	public void cancel() {
		int seatClass = selectClass();

		boolean isTrue = false;

		System.out.print(classApl(seatClass - 1));
		seat[seatClass - 1].show();

		System.out.print("�̸�>> ");
		/* ������ ����Ϸ��� �ϴ� �� �ش��ϴ� �����ڰ� ���� ��� �ٽ� �Է¹ް��� */
		do {
			String name = scanner.next();
			isTrue = false;

			for (int i = 0; i < seat[seatClass - 1].seat.length; i++) {
				if (seat[seatClass - 1].getSeat(i).equals(name)) {
					seat[seatClass - 1].setSeat("---", i + 1);
					break;
				} else if (i == seat[seatClass - 1].seat.length - 1) {
					System.out.print("�ٽ� �Է��ϼ���.(��Ҹ� ���� ��, --- �� �Է��ϼ���.)>> ");
					isTrue = true;
				}
			}
		} while (isTrue);
	}

	public boolean finish() {
		return false;
	}

	public void run() {
		boolean isNotFin = true;
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (isNotFin) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int mode = scanner.nextInt();

			switch (mode) {
			case 1:
				resv();
				break;
			case 2:
				curSeatView();
				break;
			case 3:
				cancel();
				break;
			case 4:
				isNotFin = finish();
				break;
			default:
				System.out.println("�ش��ϴ� �޴��� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
}

public class Chap12 {
	public static void main(String[] args) {
		ReservationSystem resv = new ReservationSystem();
		resv.run();
	}
}