package ch09.introduction;

public class TestSimpleCircle {

	public static void main(String[] args) {
		/*
		 * The proggram constructs three circle objects with radius 1, 25, and 125 and
		 * displays the radius and area of each of the three circles. It then changes
		 * the radius of the second object to 100 and displays its new radius and area
		 */
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
	}
}
