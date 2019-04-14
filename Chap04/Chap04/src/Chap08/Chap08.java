package Chap08;

import java.util.Scanner;

class Phone {
	private String name, phone;

	public void setInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void show() {
		System.out.println(this.name + "의 번호는 " + this.phone + "입니다.");
	}
}

class PhoneBook {
	Phone[] info;
	Scanner scanner = new Scanner(System.in);
	
	public PhoneBook(int count) {
		info = new Phone[count];
	}

	public void save() {

		for (int i = 0; i < info.length; i++) {
			info[i] = new Phone();
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String phone = scanner.next();
			info[i].setInfo(name, phone);
		}

		System.out.println("저장되었습니다...");
	}

	public void run() {
		String name;

		do {
			System.out.print("검색할 이름>>");
			name = scanner.next();

			for (int i = 0; i < info.length; i++) {
				if (info[i].getName().equals(name)) {
					info[i].show();
					break;
				} else if ((i == info.length - 1)
						&& !info[i].getName().equals(name)
						&& !name.equals("그만")) {
					System.out.println(name + "이 없습니다.");
				}
			}
		} while (!name.equals("그만"));
	}
}

public class Chap08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원수>>");
		int count = scanner.nextInt();

		PhoneBook book = new PhoneBook(count);

		book.save();
		book.run();

		scanner.close();
	}

}
