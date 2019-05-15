package GameProcess;

import java.util.Calendar;
import java.util.Scanner;

public class GameOf10 {
	Scanner scanner = new Scanner(System.in);

	public GameOf10() {
		// TODO Auto-generated constructor stub
		System.out.println("1�ʿ� ����� ����� �̱�� �����Դϴ�.");
	}

	public int[] SecondnMinute() {
		int[] timeInfo = new int[2];
		Calendar cal = Calendar.getInstance();

		timeInfo[0] = cal.get(Calendar.MINUTE);
		timeInfo[1] = cal.get(Calendar.SECOND);

		return timeInfo;
	}

	public int turn(int n) {
		int[] first = new int[2]; // [0]�� �� ����, [1]�� �� ����
		int[] after = new int[2];

		System.out.print("Player" + n + " ���� <Enter>Ű>>");
		scanner.nextLine();
		first = SecondnMinute();
		System.out.println("���� �� �ð� = " + first[1]);

		System.out.print("10�� ���� �� <Enter>Ű>>");
		scanner.nextLine();
		after = SecondnMinute();

		System.out.println("���� �� �ð� = " + after[1]);

		if (after[1] >= first[1])
			return Math.abs(after[1] - first[1]);
		else
			return Math.abs((after[1] + 60 * (after[0] - first[0])) - first[1]);
		// �� �� ������ ������ ���� ��Ȯ�ϰ� �Ϸ��� 60 * (after[0] - first[0] �� ���� ����
	}

	public void run() {
		int[] result = new int[2];

		result[0] = turn(0 + 1); // ���� Player ������ ���� ���� ������ ���߿� �÷��̾� ���� ������ �� �ڵ�
									// ȣȯ���� �����ؼ� �׳� �̷��� ��
		result[1] = turn(1 + 1);

		System.out.print("Player" + 1 + "�� ��� " + result[0] + ", " + "Player"
				+ 2 + "�� ��� " + result[1] + ", ");
		// ���� Player ������ ���� ���� ������ ���߿� �÷��̾� ���� ������ �� �ڵ� ȣȯ���� �����ؼ� �׳� �̷��� ��

		if (Math.abs(10 - result[0]) < Math.abs(10 - result[1]))
			System.out.println("Player" + 1 + "�� �¸�");
		else if (Math.abs(10 - result[0]) > Math.abs(10 - result[1]))
			System.out.println("Player" + 2 + "�� �¸�");
		else
			System.out.println("�����Դϴ�.");
	}
}