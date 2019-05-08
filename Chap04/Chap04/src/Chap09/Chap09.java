package Chap09;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		// �迭 a b�� ������ ���ο� �迭 ����
		int c_len = a.length + b.length;
		int[] c = new int[c_len];

		for (int i = 0; i < c.length; i++) {
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[i - a.length]; // i���� �����ϸ� �ȵ� i�� �̹� a.length��ŭ ī������ ��
										// ���¶� �׸�ŭ ����ߵ�
		}

		return c;
	}

	public static void print(int[] a) {
		// �迭 a ���
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.print("]");
	}
}

public class Chap09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}