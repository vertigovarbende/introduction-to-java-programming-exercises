package ch02.exercises;

import java.util.Scanner;

public class CH02_E06_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter v0: ");
		double v0 = scan.nextDouble();
		
		System.out.print("Enter v1: ");
		double v1 = scan.nextDouble();
		
		System.out.print("Enter t: ");
		double t = scan.nextDouble();
		
		double averageAcceleration = calculateAverageAcceleration(v0, v1, t);
		System.out.println("The average acceleration is " + averageAcceleration);
	}
	
	public static double calculateAverageAcceleration(double v0, double v1, double t) {
		return (v1 - v0) / t;
	}

}
