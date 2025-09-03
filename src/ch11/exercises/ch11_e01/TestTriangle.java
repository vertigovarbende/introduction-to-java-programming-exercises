package ch11.exercises.ch11_e01;

import java.util.Scanner;

public class TestTriangle {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter side1: ");
		double side1 = INPUT.nextDouble();
		System.out.print("Enter side2: ");
		double side2 = INPUT.nextDouble();
		System.out.print("Enter side2: ");
		double side3 = INPUT.nextDouble();

		System.out.print("Enter color: ");
		String color = INPUT.next();

		System.out.print("filled (true or false): ");
		boolean filled = INPUT.nextBoolean();

		Triangle obj = new Triangle(side1, side2, side3);
		obj.setColor(color);
		obj.setFilled(filled);

		// or
		Triangle obj2 = new Triangle(color, filled, side1, side2, side3);

		System.out.println(obj); // invoke obj.toString()
		System.out.println("area: " + obj.getArea()); // getArea()
		System.out.println("perimeter: " + obj.getPerimeter()); // getPerimeter()

	}
}
