package TestExam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 3�� ����
//class MyClass<T> {
//	private T n;
//
//	public void set(T n) {
//		this.n = n;
//	}
//
//	public T get() {
//		return this.n;
//	}
//}

public class TestExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��� ����Ʈ

		// 2�� ����
		// ArrayList<Double> a = new ArrayList<Double>();
		//
		// for (int i = 0; i < 10; i++) {
		// double d = Math.random() * 100;
		// a.add(d);
		// }
		//
		// Iterator<Double> it = a.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }

		// 3�� ����
		// MyClass<String> s = new MyClass<String>();
		// s.set("Hello");
		// System.out.println(s.get());
		//
		// MyClass<Integer> n = new MyClass<Integer>();
		// n.set(20);
		// System.out.println(n.get());

		// 4�� ����
		// FileReader in = null;
		// FileWriter out = null;
		//
		// try {
		// in = new FileReader("c:\\windows\\system.ini");
		// out = new FileWriter("c:\\Temp\\copy.txt");
		//
		// // in ���� out ���� �����ϱ�
		// int c = 0;
		// while ((c = in.read()) != -1)
		// out.write((char) c);
		//
		// in.close();
		// out.close();
		// } catch (FileNotFoundException e) {
		// System.out.println("���� ��θ� ã�� �� �����ϴ�.");
		// } catch (IOException e) {
		// System.out.println("����� ����");
		// }

		// 5�� ����
		File f = new File("c:\\windows");

		// �Է� ���͸��� ���ϸ� ����Ʈ ���
		String[] filenames = f.list(); // ���� �����͸� f.listFiles();
		for (int i = 0; i < filenames.length; i++) {
			// File sf = new File(f.getPath() + filenames[i]);
			System.out.print(f.getPath() + "\\" + filenames[i]);
			System.out.println();
		}
		// ���� ũ�� ���
		// System.out.println("\t���� ũ��: " + sf.length());
	}
}
