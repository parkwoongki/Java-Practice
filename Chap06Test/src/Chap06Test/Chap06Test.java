package Chap06Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Chap06Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4번 문제
		java.util.StringTokenizer st = new java.util.StringTokenizer(
				"a=3,b=5,c=6", ",=");

		int sum = 0;
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken();

			System.out.println(tmp);
			try {
				sum += Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				// do not anything
			}
		}
		System.out.println("합은 " + sum);

		// 6번문제 2번
		// String s = new String("35.9");
		// double d = Double.parseDouble(s);
		// System.out.println(d);

		// 6번에 3번
		// String s = new String("true");
		// boolean b = Boolean.parseBoolean(s);
		// System.out.println(b);

		// 6번에 4번
		// String s2 = Integer.toBinaryString(30);
		// System.out.println(s2);

		// 6번에 5번
		// String c = Character.toString('c');
		// System.out.println(c);

		// 7번
		// String a = "가나다라";
		// System.out.println(a == "가나다라");
		// String b = new String(a);
		// System.out.println(a == b);

		// 8번
		// String a = new String("      Oh, Happy    ");
		// String b = a.trim();
		// String c = b.concat(" Day");
		// System.out.println(c);

		// 9번
		// Calendar date = Calendar.getInstance();
		// date.clear();
		// date.set(Calendar.YEAR, 2020);
		// date.set(Calendar.MONTH, 11);
		// date.set(Calendar.DAY_OF_MONTH, 25);
		// System.out.println("약속 날짜는 "
		// + date.get(Calendar.YEAR) + "년 "
		// + (date.get(Calendar.MONTH) + 1) + "월 "
		// + date.get(Calendar.DAY_OF_MONTH) + "일");

		// 기타 연습
		// double d1 = Double.parseDouble("35.9");
		// System.out.println(d1);
		// boolean b = Boolean.parseBoolean("true");
		// System.out.println(b);
		// String s2 = Integer.toBinaryString(30);
		// System.out.println(s2);
		// String s3 = Character.toString('c');
		// System.out.println(s3);
		// for (int i = 0; i < 10; i++) {
		// int n = (int) (Math.random() * 156 + 100);
		// System.out.println(n + " ");
		// }
		// Random rd = new Random();
		// int n = rd.nextInt(156) + 100;

		// ArrayList<String> a = new ArrayList<String>(10);
		// String s = new String("bye");
		// a.add("Hello");
		// a.add(s);
		// a.add("asdasd");
		// a.remove(s);
		//
		// Iterator it = a.iterator();
		// while(it.hasNext()){
		// System.out.println(it.next());
		// }

		HashMap<String, String> h = new HashMap<String, String>();
		h.put("a1", "as");
		h.put("a2", "as");
		h.put("a3", "as");
		h.put("a4", "ar");

		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			System.out.println(h.get(it.next()));
		}
	}
}
