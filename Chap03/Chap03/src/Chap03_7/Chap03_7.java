package Chap03_7;

public class Chap03_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[10];
		double sum = 0.0;

		System.out.print("������ ������ : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10 + 1);
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}

		System.out.println("\n����� " + sum / 10);
	}

}
