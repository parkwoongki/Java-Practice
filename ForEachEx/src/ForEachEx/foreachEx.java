package ForEachEx;

enum Week {
	��, ȭ, ��, ��, ��, ��, ��
}

public class foreachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };

		int sum = 0;
		// �Ʒ� for-each���� s�� n[0], n[1] �ݺ� ..
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}

		// �Ʒ� for-each���� s�� n[0], n[1] �ݺ� ..
		for (String s : names)
			System.out.print(s + "");
		System.out.println();

		// �Ʒ� for-each���� day�� ��ȭ��������� ������ �ݺ� ..
		for (Week day : Week.values())
			System.out.print(day + "���� ");
		System.out.println();

	}
}
