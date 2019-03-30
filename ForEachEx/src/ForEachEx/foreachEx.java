package ForEachEx;

enum Week {
	월, 화, 수, 목, 금, 토, 일
}

public class foreachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

		int sum = 0;
		// 아래 for-each에서 s는 n[0], n[1] 반복 ..
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}

		// 아래 for-each에서 s는 n[0], n[1] 반복 ..
		for (String s : names)
			System.out.print(s + "");
		System.out.println();

		// 아래 for-each에서 day는 월화수목금토일 값으로 반복 ..
		for (Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println();

	}
}
