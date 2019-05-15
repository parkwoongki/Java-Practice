package Prob11;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		String s = scanner.nextLine();

		StringBuffer sb = new StringBuffer(s);

		while (true) {
			System.out.print("명령: ");
			s = scanner.next();

			/* 쪼개기 */
			StringTokenizer st = new StringTokenizer(s, "!");
			String[] str = new String[st.countTokens()];

			for (int i = 0; i < str.length; i++) {
				str[i] = st.nextToken();
			}

			if (str[0].equals("그만"))
				break;
			if (str.length != 2)
				System.out.println("잘못된 명령입니다!");
			else if (sb.indexOf(str[0]) == -1)
				System.out.println("찾을 수 없습니다!");
			else {
				sb.replace(sb.indexOf(str[0]),
						sb.indexOf(str[0]) + str[0].length(), str[1]);
				System.out.println(sb);
			}
		}

		System.out.println("종료합니다.");

		scanner.close();
	}
}
