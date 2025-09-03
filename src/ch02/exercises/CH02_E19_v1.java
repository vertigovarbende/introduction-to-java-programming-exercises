package ch02.exercises;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class CH02_E19_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("x1:");
		double x1 = INPUT.nextDouble();
		System.out.print("y1:");
		double y1 = INPUT.nextDouble();
		System.out.print("x2:");
		double x2 = INPUT.nextDouble();
		System.out.print("y2:");
		double y2 = INPUT.nextDouble();
		System.out.print("x3:");
		double x3 = INPUT.nextDouble();
		System.out.print("y3:");
		double y3 = INPUT.nextDouble();

		double side1 = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)); // (x1,y1) - (x2,y2)
		double side2 = sqrt(pow(x3 - x1, 2) + pow(y3 - y1, 2)); // (x1,y1) - (x3,y3)
		double side3 = sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2)); // (x2,y2) - (x3,y3)

		double s = (side1 + side2 + side3) / 2;

		double check = s * (s - side1) * (s - side2) * (s - side3);
		if (check < 0)
			System.out.println("The three points are on the same line");
		else
			System.out.format("The area of the triangle is %.2f", sqrt(check));

	}
}
