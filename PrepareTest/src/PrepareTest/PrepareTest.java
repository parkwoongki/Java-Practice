package PrepareTest;

//class Super{
//	public void paint(){
//		draw();
//	}
//	public void draw(){
//		draw();
//		System.out.println("Super");
//	}
//}
//
//abstract class Sub extends Super{
//	@Override
//	public void paint(){
//		super.draw();
//	}
//	
//	@Override
//	public void draw(){
//		System.out.println("Sub");
//	}
//}
//
//public class PrepareTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Sub b;
//	}
//	
//	
//}

//class A {
//	private int a;
//
//	public  A(int i) {
//		a = i;
//	}
//}
//
//class B extends A {
//	private int b;
//
//	protected B() {
//		super(5);
//		b = 0;
//	}
//}
//
//
//public class PrepareTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		B b = new B();
//	}
//
//}a

class Shape {
	public void paint() {
		
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("Circle");
	}
}

public class PrepareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		s.paint();
	}

}
