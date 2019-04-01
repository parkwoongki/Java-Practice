package Chap03_16;

import java.util.Scanner;

public class Chap03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String vs[] = { "보", "가위", "바위" };
		String user;

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		do {
			/* 컴퓨터가 가위바위보 정하는 구간 */
			int n = (int) (Math.random() * 3);
			String computer = null;
			for (int i = 0; i < 3; i++) {
				if (str[n].equals(str[i])) {
					computer = str[i];
					break;
				}
			}

			/* 사용자가 가위바위보 정하는 구간 */
			System.out.print("가위 바위 보!>>");
			user = scanner.next();

			/* 둘이 비교 하는 구간 */
			if (user.equals("그만"))
				break;

			/* 비겼을 땐 바로 처리하고 else문을 처리하지 않는다. */
			if (user.equals(computer))
				System.out.println("computer : " + computer + ", user : "
						+ user + ", 비겼습니다.");
			else {
				// 비겼을 때는 앞 전의 이프문으로 하여금 else 문으로 진입하지 못하므로, 이길 때와 질 때만 판단하면 된다.
				for (int i = 0; i < str.length; i++) {
					if (user.equals(str[i]))
						/*
						 * 위를 보면 가위바위보 배열을 하나 더 생성했는데, 자세히 보면 상하관계 순서를 바꿔서 생성했기
						 * 때문에, 같은 위치의 인덱스로 하여금 비교하였을 때, 이겼는지 아닌지 판단이 가능하다.
						 */
						if (computer.equals(vs[i]))
							System.out.println("computer : " + computer
									+ ", user : " + user + ", 이겼습니다.");
						else
							System.out.println("computer : " + computer
									+ ", user : " + user + ", 졌습니다.");
				}
			}
		} while (true);

		System.out.println("게임을 종료합니다...");
		
		scanner.close();
	}
}
