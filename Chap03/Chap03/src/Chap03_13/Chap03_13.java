package Chap03_13;

public class Chap03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameNum = 0;

		while (gameNum < 100) {
			gameNum++;

			switch (gameNum / 10) {
			case 0:
				// 1�� �ڸ� �� �� ��
				if ((gameNum % 3 == 0) && (gameNum != 0))
					System.out.println(gameNum + " �ڼ�¦");
				break;
			default:
				// 2�� �ڸ� �� ��, 2�� �ڸ��� 3�� ��� �� ��
				if ((gameNum / 10) % 3 == 0) {
					// �� �� 1�� �ڸ��� 3�� ��� �� ��
					if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
						System.out.println(gameNum + " �ڼ�¦¦");
					// �� ��
					else
						System.out.println(gameNum + " �ڼ�¦");
					// 2�� �ڸ� �� ��, 1�� �ڸ��� 3�� ��� �϶�, 0 ����
				} else if (((gameNum % 10) % 3 == 0) && (gameNum % 10 != 0))
					System.out.println(gameNum + " �ڼ�¦");
			}
		}
	}
}