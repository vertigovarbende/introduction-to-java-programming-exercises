package ch06.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH06_E19_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double side1, side2, side3;
		
		System.out.print("side1: ");
		side1 = scan.nextDouble();
		
		System.out.print("side2: ");
		side2 = scan.nextDouble();
		
		System.out.print("side3: ");
		side3 = scan.nextDouble();
		
		if(isValid(side1, side2, side3))
			System.out.println("The area of the triangle: " + area(side1, side2, side3));
		else
			System.out.println("invalid");


	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1)
			return true;
		else
			return false;
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
