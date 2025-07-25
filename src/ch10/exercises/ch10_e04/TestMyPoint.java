package ch10.exercises.ch10_e04;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint myPoint1 = new MyPoint();
		MyPoint myPoint2 = new MyPoint(10, 30.5);
		
		System.out.println("distance(anotherPoint)");
		System.out.println(myPoint1.distance(myPoint2));
		System.out.println(myPoint2.distance(myPoint1));
		System.out.println();
		
		System.out.println("distance(double, double)");
		System.out.println(myPoint1.distance(10, 30.5));
		System.out.println(myPoint2.distance(0, 0));
		System.out.println();
	}
}
