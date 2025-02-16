package ch03.exercises;

import java.util.Scanner;

public class CH03_E01_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;

		System.out.print("Enter a : ");
		a = scan.nextDouble();

		System.out.print("Enter b : ");
		b = scan.nextDouble();

		System.out.print("Enter c : ");
		c = scan.nextDouble();

		calculateRoot(a, b, c);

	}

	public static void calculateRoot(double a, double b, double c) {
		double r1 = 0.0, r2 = 0.0;
		if (calculateDiscriminant(a, b, c) > 0) {
			r1 = ((-b) + Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a);
			r2 = ((-b) - Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a);
			System.out.format("The equation has two roots %.3f and %.3f\n", r1, r2);
		} else if (calculateDiscriminant(a, b, c) == 0) {
			r1 = r2 = ((-b) + Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a);
			System.out.format("The equation has one root %f\n", r1);
		} else
			System.out.println("The equation has no real roots");
	}

	public static double calculateDiscriminant(double a, double b, double c) {
		return Math.pow(b, 2) - (4 * a * c);
	}

}
