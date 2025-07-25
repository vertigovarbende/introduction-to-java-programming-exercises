package ch10.exercises.ch10_e13;

public class TestMyRectangle2D {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		
		System.out.println(r1 + "\n"); // invoke r1.toString()
		
		System.out.println("getArea()");
		System.out.println(r1.getArea());
		System.out.println("getPerimeter()");
		System.out.println(r1.getPerimeter());
		System.out.println();
		
		MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
		MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);
		
		System.out.println("contains(double, double)");
		System.out.println("(3, 3) : " + r1.contains(3, 3));
		System.out.println("contains(MyRectangle2D)");
		System.out.println(r2 + " : " + r1.contains(r2));
		System.out.println("overlaps(MyRectangle2D)");
		System.out.println(r3 + " : " + r1.overlaps(r3));
		
	}
}
