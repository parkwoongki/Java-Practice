package Chap02_8;

import java.util.Scanner;

public class Chap02_8 {

	public static boolean inRect(int p[]){
		if (((p[0] >= 100 && p[0] <= 200) && (p[1] >= 100 && p[1] <= 200)) // (x1,y1)��  ���簢�� �ȿ� ���� ��
				|| ((p[2] >= 100 && p[2] <= 200) && (p[3] >= 100 && p[3] <= 200)) // (x2,y2)��  ���簢�� �ȿ� ���� ��
				|| ((p[0] >= 200 && p[1] >= 200) && (p[2] <= 100 && p[3] <= 100)) // ���簢���� ���� ���簢���� ���� ��1
				|| ((p[2] >= 200 && p[3] >= 200) && (p[0] <= 100 && p[1] <= 100)))  // ���簢���� ���� ���簢���� ���� ��2
			 // ��Ÿ ���� ���� ��ǥ�� ���簢���� ���� ���簢�� �ȿ� ���Ե� ����
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int[] p = new int[4];

		System.out.print("x1, y1, x2, y2�� ���� ���ʴ�� �Է��ϼ��� : ");
		for (int i = 0; i < 4; i++)
			p[i] = a.nextInt();

		if (inRect(p))		
			System.out.println("�� ���簢���� �浹�մϴ�."); // ��Ÿ ���� ���� ��ǥ�� ���簢���� ���� ���簢�� �ȿ� ���Ե� ����
		else
			System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		
		a.close();
	}

}