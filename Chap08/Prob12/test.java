package Prob10;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, count=0;
		String tmp = "";
		Scanner scanner = new Scanner(System.in);
		Map<String, String> phoneMap = new HashMap<String, String>();

		try {
			FileReader fin = new FileReader("c:\\Temp\\phone.txt");

			while ((c = fin.read()) != -1) {
				tmp += (char) c;
				if ((char) c == '\n') {
					StringTokenizer st = new StringTokenizer(tmp, " ");
					phoneMap.put(st.nextToken(), st.nextToken());
					tmp = "";
					count++;
				}
			}

			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	System.out.println("총 " + count +"개의 전화번호를 읽었습니다.");
		while (true) {
			System.out.print("이름>> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			System.out.print(phoneMap.get(name));
		}

		scanner.close();
	}
}
