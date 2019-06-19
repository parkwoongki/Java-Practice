package TestExam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 3번 문제
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

		// 흑백 프린트

		// 2번 문제
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

		// 3번 문제
		// MyClass<String> s = new MyClass<String>();
		// s.set("Hello");
		// System.out.println(s.get());
		//
		// MyClass<Integer> n = new MyClass<Integer>();
		// n.set(20);
		// System.out.println(n.get());

		// 4번 문제
		// FileReader in = null;
		// FileWriter out = null;
		//
		// try {
		// in = new FileReader("c:\\windows\\system.ini");
		// out = new FileWriter("c:\\Temp\\copy.txt");
		//
		// // in 에서 out 으로 복사하기
		// int c = 0;
		// while ((c = in.read()) != -1)
		// out.write((char) c);
		//
		// in.close();
		// out.close();
		// } catch (FileNotFoundException e) {
		// System.out.println("파일 경로를 찾을 수 없습니다.");
		// } catch (IOException e) {
		// System.out.println("입출력 오류");
		// }

		// 5번 문제
		File f = new File("c:\\windows");

		// 입력 디렉터리의 파일명 리스트 얻기
		String[] filenames = f.list(); // 파일 포인터면 f.listFiles();
		for (int i = 0; i < filenames.length; i++) {
			// File sf = new File(f.getPath() + filenames[i]);
			System.out.print(f.getPath() + "\\" + filenames[i]);
			System.out.println();
		}
		// 파일 크기 출력
		// System.out.println("\t파일 크기: " + sf.length());
	}
}
