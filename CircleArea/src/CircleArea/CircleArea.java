package CircleArea;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;

		double radius = 10;
		double circleArea = 0;

		circleArea = radius * radius * PI;

		System.out.print("원의 면적 : ");
		System.out.println(circleArea);

		System.out.println("원의 면적 : " + circleArea);
	}
}
