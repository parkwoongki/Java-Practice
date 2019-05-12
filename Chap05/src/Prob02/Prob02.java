package Prob02;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return this.color;
	}

	public void printProperty() {
		System.out.println(this.getSize() + "��ġ " + this.color + "Į��");
	}
}

class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public String getIP() {
		return this.address;
	}

	public void printProperty() {
		System.out.println("���� IPTV�� " + this.address + " �ּ��� " + this.getSize() + "��ġ " + this.getColor() + "Į��");
	}
}

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
