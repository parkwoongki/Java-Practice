package Chap07Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 11 번
//class JGeneric<W> {
//	private W x, y;
//
//	public JGeneric(W x, W y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	W first() {
//		return x;
//	}
//
//	W second() {
//		return y;
//	}
//
//	boolean equal() {
//		if (x.equals(y))
//			return true;
//		else
//			return false;
//	}
//}

// 12번
// class JClass {
// static String take(String s[], int index) {
// if (index > s.length) {
// System.out.println("인덱스가 범위를 벗어났습니다.");
// return null;
// }
// return s[index];
// }
// }

class JClass {
	static <T> T take(T[] s, int index) {
		if (index > s.length) {
			System.out.println("인덱스가 범위를 벗어났습니다.");
			return null;
		}
		return s[index];
	}
}

public class Chap07Test {

	// 10
	// public static int func(HashMap<String, Integer> h) {
	// return h.size();
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vector<String> v = new Vector<>();
		// System.out.println(v.capacity()); // 기본 10임

		// Vector<Integer> v = new Vector<Integer>(3);
		//
		// for (int i = 0; i < 13; i++)
		// v.add(i);
		// System.out.println(v.capacity());

		// 8번
		// ArrayList<String> a = new ArrayList<>(10);
		// a.add("Java");
		// a.add(0, "C++");
		// System.out.println("현재 삽입된 개수 출력 : " + a.size());
		// a.remove(a.size()-1);

		// 9번
		// Vector<Integer> v = new Vector<>();
		//
		// for (int i = 0; i < 10; i++) {
		// v.add(i);
		// }
		// Iterator<Integer> it = v.iterator();
		// while (it.hasNext())
		// System.out.print(it.next() + " ");

		// 10번
		// HashMap<String, Integer> h = new HashMap<>();
		// h.put("a", 10);
		// h.put("b", 20);
		// h.put("c", 20);
		// h.put("d", 20);
		//
		// System.out.println(func(h));

		// 11번
		// JGeneric<String> j = new JGeneric<String>("Apple", "apple");
		// System.out.println("x : " + j.first() + " y : " + j.second());
		//
		// System.out.println(j.equal());

		// 12번
		// String s[] = { "a", "b", "c", "d", "e" };
		// System.out.println(take(s, 3));
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 50);
		File f = new File("C:\\Temp\\phone.txt");
		FileReader fin;
		try {
			fin = new FileReader(f);
			int c;
			while ((c = fin.read()) != -1) {
				bout.write(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 찾을 수 없음");
		} catch (IOException e) {
			System.out.println("경로를 찾을 수 없음");
		}

	}

	// static <T> T take(T[] s, int index) {
	// if (index > s.length) {
	// System.out.println("인덱스가 범위를 벗어났습니다.");
	// return null;
	// }
	// return s[index];
	// }
	//
	// public static int func(HashMap<String, Integer> h) {
	// return h.size();
	// }

}
