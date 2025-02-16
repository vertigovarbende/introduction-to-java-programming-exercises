package ch02.exercises;

import java.util.Scanner;

public class CH02_E08_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter speed: ");
		double speed = scan.nextDouble();

		System.out.print("Enter acceleration: ");
		double acceleration = scan.nextDouble();

		double runwayLength = findRunwayLength(speed, acceleration);
		System.out.println("The minimum runway length for this airplane is " + runwayLength);

	}
	
	public static double findRunwayLength(double speed, double acceleration) {
		return Math.pow(speed, 2) / (2 * acceleration);
	}
}
