package GameProcess;

import java.util.Calendar;
import java.util.Scanner;

public class GameOf10 {
	Scanner scanner = new Scanner(System.in);

	public GameOf10() {
		// TODO Auto-generated constructor stub
		System.out.println("1초에 가까운 사람이 이기는 게임입니다.");
	}

	public int[] SecondnMinute() {
		int[] timeInfo = new int[2];
		Calendar cal = Calendar.getInstance();

		timeInfo[0] = cal.get(Calendar.MINUTE);
		timeInfo[1] = cal.get(Calendar.SECOND);

		return timeInfo;
	}

	public int turn(int n) {
		int[] first = new int[2]; // [0]은 분 정보, [1]은 초 정보
		int[] after = new int[2];

		System.out.print("Player" + n + " 시작 <Enter>키>>");
		scanner.nextLine();
		first = SecondnMinute();
		System.out.println("현재 초 시간 = " + first[1]);

		System.out.print("10초 예상 후 <Enter>키>>");
		scanner.nextLine();
		after = SecondnMinute();

		System.out.println("현재 초 시간 = " + after[1]);

		if (after[1] >= first[1])
			return Math.abs(after[1] - first[1]);
		else
			return Math.abs((after[1] + 60 * (after[0] - first[0])) - first[1]);
		// 몇 분 지나고 눌러도 차이 정확하게 하려고 60 * (after[0] - first[0] 이 식을 넣음
	}

	public void run() {
		int[] result = new int[2];

		result[0] = turn(0 + 1); // 굳이 Player 다음에 숫자 붙힌 이유는 나중에 플레이어 수가 동적일 때 코드
									// 호환성을 고려해서 그냥 이렇게 함
		result[1] = turn(1 + 1);

		System.out.print("Player" + 1 + "의 결과 " + result[0] + ", " + "Player"
				+ 2 + "의 결과 " + result[1] + ", ");
		// 굳이 Player 다음에 숫자 붙힌 이유는 나중에 플레이어 수가 동적일 때 코드 호환성을 고려해서 그냥 이렇게 함

		if (Math.abs(10 - result[0]) < Math.abs(10 - result[1]))
			System.out.println("Player" + 1 + "의 승리");
		else if (Math.abs(10 - result[0]) > Math.abs(10 - result[1]))
			System.out.println("Player" + 2 + "의 승리");
		else
			System.out.println("동점입니다.");
	}
}