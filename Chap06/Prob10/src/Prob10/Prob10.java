package Prob10;

import java.util.Scanner;

import GameProcess.Gambling;
import PersonInfo.Person;

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Person[] person = new Person[2];
		String name;

		for (int i = 0; i < person.length; i++) {
			System.out.print(i + 1 + "번째 선수 이름>>");
			name = scanner.next();
			person[i] = new Person(name);
		}

		Gambling game = new Gambling(person);
		game.run();

		scanner.close();
	}

}
