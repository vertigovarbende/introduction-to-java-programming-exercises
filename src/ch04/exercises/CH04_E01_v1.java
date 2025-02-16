package ch04.exercises;

import static java.lang.Math.*;
import java.util.Scanner;

public class CH04_E01_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double r = scan.nextDouble();
		System.out.format("The area of the pentagon is %.2f ", calArea(r));

	}

	public static double calArea(double r) {
		double derRadyan = toRadians(180 / 5);
		return (5 * pow(calS(r), 2)) / (4 * tan(derRadyan));
	}

	public static double calS(double r) {
		return 2 * r * sin(toRadians(180 / 5));
	}

}
