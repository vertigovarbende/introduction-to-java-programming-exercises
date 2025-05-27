package ch09.exercises.ch09_e01;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle0 = new Rectangle();
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// rectangle0
		System.out.println("rectangle0");
		System.out.println("The height of the rectangle0 is " + rectangle0.height);
		System.out.println("The width of the rectangle0 is " + rectangle0.width);
		System.out.println("The area of the rectangle0 is " + rectangle0.getArea());
		System.out.println("The perimeter of the rectangle0 is " + rectangle0.getPerimeter());

		// rectangle1
		System.out.println("rectangle1");
		System.out.println("The height of the rectangle1 is " + rectangle1.height);
		System.out.println("The width of the rectangle1 is " + rectangle1.width);
		System.out.println("The area of the rectangle1 is " + rectangle1.getArea());
		System.out.println("The perimeter of the rectangle1 is " + rectangle1.getPerimeter());

		// rectangle2
		System.out.println("rectangle2");
		System.out.println("The height of the rectangle2 is " + rectangle2.height);
		System.out.println("The width of the rectangle2 is " + rectangle2.width);
		System.out.println("The area of the rectangle2 is " + rectangle2.getArea());
		System.out.println("The perimeter of the rectangle2 is " + rectangle2.getPerimeter());
	}
}
