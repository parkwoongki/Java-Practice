package Chap02_5;

import java.util.Scanner;

public class Chap02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int[] length = new int[3];

		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		for (int i = 0; i < 3; i++) {
			length[i] = a.nextInt();
		}

		if ((length[0] >= length[1]) && (length[0] >= length[2])
				&& (length[0] < length[1] + length[2]))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if (length[1] >= length[2] && length[1] >= length[0]
				&& (length[1] < length[0] + length[2]))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if (length[2] >= length[1] && length[2] >= length[0]
				&& (length[2] < length[1] + length[0]))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");

		a.close();
	}

}
