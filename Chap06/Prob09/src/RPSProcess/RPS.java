package RPSProcess;

import java.util.Scanner;

public class RPS {
	Scanner scanner = new Scanner(System.in);
	private String str[] = { "����", "����", "��" };
	private String vs[] = { "��", "����", "����" };
	private int user;
	private int com;

	/* ��ǻ�Ͱ� �� �� */
	private void com() {
		this.com = (int) (Math.random() * 3);
	}

	/* ������ �� �� */
	private boolean user() {
		this.user = scanner.nextInt();

		if (user == 4)
			return true;
		else
			return false;
	}

	/* ��Ʋ ��� */
	private void battle() {
		if (vs[user - 1].equals(str[com]))
			System.out.println("����(" + vs[user - 1] + ") : ��ǻ��(" + str[com]
					+ ")\n�����ϴ�.");
		else {
			for (int i = 0; i < str.length; i++) {
				if (vs[user - 1].equals(str[i]))
					if (str[com].equals(vs[i]))
						System.out.println("����(" + vs[user - 1] + ") : ��ǻ��("
								+ str[com] + ")\n���Ⱑ �̰���ϴ�.");
					else
						System.out.println("����(" + vs[user - 1] + ") : ��ǻ��("
								+ str[com] + ")\n��ǻ�Ͱ� �̰���ϴ�.");
			}
		}
	}

	/* ���� �Լ� */
	public void run() {
		while (true) {
			System.out.print("����[����(1), ����(2), ��(3), ������(4)]>>");
			if (user())
				break;
			com();

			battle();
		}
	}
}