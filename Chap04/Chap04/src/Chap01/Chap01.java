package Chap01;

class TV {
	private String company;
	private int year;
	private int inch;
	
	public TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	public void show(){
		System.out.println(company + "���� ���� " + year + "���� " + inch +"��ġ TV");
	}
}

public class Chap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}