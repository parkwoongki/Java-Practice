package Prob05;

import java.util.Calendar;

public class Prob05 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		System.out.println("���� �ð��� " + date.get(Calendar.HOUR_OF_DAY) + "��  "
				+ date.get(Calendar.MINUTE) + "���Դϴ�.");
		
		if(date.get(Calendar.HOUR_OF_DAY)>=4 && date.get(Calendar.HOUR_OF_DAY)<=12)
			System.out.println("Good Morning");
		else if(date.get(Calendar.HOUR_OF_DAY)>=12 && date.get(Calendar.HOUR_OF_DAY)<=18)
			System.out.println("Good Afternoon");
		else if(date.get(Calendar.HOUR_OF_DAY)>=18 && date.get(Calendar.HOUR_OF_DAY)<=22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}