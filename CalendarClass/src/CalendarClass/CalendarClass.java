package CalendarClass;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar date = Calendar.getInstance();
		
		date.clear();
		date.set(Calendar.YEAR, 2020);
		date.set(Calendar.MONTH, 11);
		date.set(Calendar.DAY_OF_MONTH,25);
		System.out.println("��� ��¥�� " + date.get(Calendar.YEAR)+"�� " +
		(date.get(Calendar.MONTH)+1) + "�� "+date.get(Calendar.DAY_OF_MONTH)+"��");
	}

}
