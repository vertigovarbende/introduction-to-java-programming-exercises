package ch06.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH06_E35_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = scan.nextDouble();
		System.out.println("The area of the pentagon is: " + area(side));
	}

	public static double area(double side) {
		return (5 * pow(side, 2)) / (4 * tan(PI / 5));
	}
}