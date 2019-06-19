package TestExam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 5번 문제
//class MyPoint {
//	private int x, y;
//
//	public MyPoint(int x, int y) {
//		// TODO Auto-generated constructor stub
//		this.x = x;
//		this.y = y;
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Point(" + this.x + "," + this.y + ")";
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		MyPoint mp = (MyPoint) obj;
//		if (this.x == mp.x && this.y == mp.y)
//			return true;
//		else
//			return false;
//	}
//}

// 7번 문제
//class JGeneric<T> {
//	private T first, second;
//
//	public JGeneric(T first, T second) {
//		this.first = first;
//		this.second = second;
//	}
//
//	public T first() {
//		return this.first;
//	}
//
//	public T second() {
//		return this.second;
//	}
//
//	public boolean equals() {
//		if (this.first.equals(this.second))
//			return true;
//		else
//			return false;
//	}
//}

public class TestExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 남수꺼 칼라프린트

		// 3번 문제
		// String s = "It was nice talking to you.";
		// int numberOfWhiteSPace = 0;
		//
		// for (int i = 0; i < s.length(); i++) {
		// if (s.charAt(i) == ' ')
		// numberOfWhiteSPace++;
		// }
		//
		// System.out.println("공백문자는 " + numberOfWhiteSPace + "개 입니다.");

		// 4번 문제
		// StringBuffer sb = new StringBuffer("This is a pencil.");
		// sb.insert(8, "not ");
		// System.out.println(sb);

		// 5번 문제
		// MyPoint p = new MyPoint(3, 40);
		// MyPoint q = new MyPoint(4, 50);
		// System.out.println(p);
		// if (p.equals(q))
		// System.out.println("같은 점");
		// else
		// System.out.println("다른 점");

		// 6번 문제
		// HashMap<String, String> h = new HashMap<String, String>();
		// h.put("범죄", "112");
		// h.put("화재", "119");
		// h.put("전화번호", "114");
		// Vector<String> v = TestExam1.hashToVector(h);
		// for (int i = 0; i < v.size(); i++) {
		// System.out.println(v.get(i));
		// }

		// 7번 문제
		// JGeneric<String> js = new JGeneric<String>("Hello", "Hellu");
		// System.out.println(js.first());
		// System.out.println(js.second());
		// System.out.println(js.equals());

		// 8번 문제
		// FileInputStream fin = null;
		//
		// try {
		// fin = new FileInputStream("C:\\windows\\system.ini");
		// int c;
		// while (true) {
		// c = fin.read();
		// if (c == -1)
		// break;
		// System.out.print((char) c);
		// }
		// fin.close();
		// } catch (FileNotFoundException e) {
		// System.out.println("파일을 찾을 수 없습니다.");
		// } catch (IOException e) {
		// System.out.println("입출력 오류가 발생했습니다.");
		// }
	}
	// 6번 문제
	// public static Vector<String> hashToVector(HashMap<String, String> h) {
	// Vector<String> v = new Vector<String>();
	// Set<String> s = h.keySet();
	//
	// Iterator<String> it = s.iterator();
	// while (it.hasNext()) {
	// v.add(h.get(it.next()));
	// }
	//
	// return v;
	// }
}
