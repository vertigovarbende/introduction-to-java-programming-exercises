package ch03.exercises;

import java.util.Scanner;

public class CH03_E25_v1 {

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
		System.out.print("x4:");
		double x4 = INPUT.nextDouble();
		System.out.print("y4:");
		double y4 = INPUT.nextDouble();

		double a = y1 - y2; // (y1 - y2)
		double b = x1 - x2; // (x1 - x2)
		double c = y3 - y4; // (y3 - y4)
		double d = x3 - x4; // (x3 - x4)
		double e = (a * x1) - (b * y1);
		double f = (c * x3) - (d * y3);

		double k = ((a * d) - (b * c));
		if (k == 0)
			System.out.println("The two lines are parallel");
		else {
			double resultX = ((e * d) - (b * f)) / k;
			double resultY = ((a * f) - (e * c)) / k;
			System.out.println("The intersecting points is at (" + resultX + ", " + resultY + ")");
		}
	}
}
