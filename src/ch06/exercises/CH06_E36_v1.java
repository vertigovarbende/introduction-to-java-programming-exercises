package ch06.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH06_E36_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int n = scan.nextInt();
		System.out.print("Enter the side: ");
		double side = scan.nextDouble();
		System.out.println("The area of the polygon is: " + area(n, side));
	}

	public static double area(int n, double side) {
		return (n * pow(side, 2)) / (4 * tan(PI / n));
	}
}