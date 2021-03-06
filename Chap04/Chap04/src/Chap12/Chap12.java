package Chap12;

import java.util.Scanner;

class Seat {
	String[] seat = { "---", "---", "---", "---", "---", "---", "---", "---",
			"---", "---" }; // 일단 빈칸이다.

	public void setSeat(String name, int num) {
		seat[num - 1] = name; // 몇번이냐고 하면 n-1번째 것에 세팅해야됨
	}

	public String getSeat(int i) {
		return seat[i]; // 해당 순번의 이름을 가져오는 메서드, 반복문이랑 같이 사용
	}

	public void show() { // 해당 좌석 클래스의 좌석 현황을 보여주는 show()
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println("");
	}
}

class ReservationSystem {
	Scanner scanner;
	Seat[] seat = new Seat[3]; // 0:S, 1:A, 2:B

	public ReservationSystem() {
		scanner = new Scanner(System.in);
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
		}
	}

	/* 좌석의 클래스를 선택하는 메서드 */
	public int selectClass() {
		int seatClass;

		do {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			seatClass = scanner.nextInt();
			if ((seatClass < 1) || (seatClass > 3))
				System.out.println("해당하는 좌석 클래스가 없습니다. 다시 입력하십시오.");
		} while ((seatClass < 1) || (seatClass > 3));

		return seatClass;
	}

	/* 좌석을 선택하는 메서드 */
	public int selectSeatNum() {
		int num;

		do {
			System.out.print("번호>>");
			num = scanner.nextInt();
			if ((num < 1) || (num > 10))
				System.out.println("해당하는 좌석 없습니다. 다시 입력하십시오.");
		} while ((num < 1) || (num > 10));
		/* 없는 좌석을 고르면 반복해서 다시 좌석을 고르게 함 */

		return num;
	}

	/* 각 좌석이 어떤 클래스의 좌석인지를 보여주는 메서드 */
	public String classApl(int i) {
		if (i == 0)
			return "S>> ";
		else if (i == 1)
			return "A>> ";
		else
			return "B>> ";
	}

	/* 예약하는 메서드 */
	public void resv() {
		int seatClass = selectClass();

		System.out.print("이름>>");
		String name = scanner.next();

		/* 이미 예약되어 있는 좌석을 선택하면 다시 선택하게 함 */
		int num;
		do {
			num = selectSeatNum();
			if (seat[seatClass - 1].seat[num - 1].equals("---"))
				break;
			System.out.println("이미 예약이 존재합니다.");
		} while (true);
		seat[seatClass - 1].setSeat(name, num);
	}

	/* 현 좌석 상황을 조회하는 메서드 */
	public void curSeatView() {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(classApl(i));
			seat[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	public void cancel() {
		int seatClass = selectClass();

		boolean isTrue = false;

		System.out.print(classApl(seatClass - 1));
		seat[seatClass - 1].show();

		System.out.print("이름>> ");
		/* 예약을 취소하려고 하는 데 해당하는 예약자가 없을 경우 다시 입력받게함 */
		do {
			String name = scanner.next();
			isTrue = false;

			for (int i = 0; i < seat[seatClass - 1].seat.length; i++) {
				if (seat[seatClass - 1].getSeat(i).equals(name)) {
					seat[seatClass - 1].setSeat("---", i + 1);
					break;
				} else if (i == seat[seatClass - 1].seat.length - 1) {
					System.out.print("다시 입력하세요.(취소를 원할 시, --- 를 입력하세요.)>> ");
					isTrue = true;
				}
			}
		} while (isTrue);
	}

	public boolean finish() {
		return false;
	}

	public void run() {
		boolean isNotFin = true;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while (isNotFin) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int mode = scanner.nextInt();

			switch (mode) {
			case 1:
				resv();
				break;
			case 2:
				curSeatView();
				break;
			case 3:
				cancel();
				break;
			case 4:
				isNotFin = finish();
				break;
			default:
				System.out.println("해당하는 메뉴가 존재하지 않습니다.");
				break;
			}
		}
	}
}

public class Chap12 {
	public static void main(String[] args) {
		ReservationSystem resv = new ReservationSystem();
		resv.run();
	}
}
