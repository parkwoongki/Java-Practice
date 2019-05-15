package Prob12;

import java.util.Scanner;
import GameProcess.Gambling;
import PersonInfo.Person;

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		int n = scanner.nextInt();
		Person[] person = new Person[n];
		String name;

		for (int i = 0; i < person.length; i++) {
			System.out.print(i + 1 + "��° ���� �̸�>>");
			name = scanner.next();
			person[i] = new Person(name);
		}

		Gambling game = new Gambling(person);
		game.run();

		scanner.close();
	}

}
