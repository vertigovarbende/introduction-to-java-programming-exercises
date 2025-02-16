package ch02.exercises;

import java.util.Scanner;

public class CH02_E03_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pound = scan.nextDouble();
		
		double kilograms = calculatePoundToKilograms(pound);
		System.out.println(pound + " pounds is " + kilograms + " kilograms");
	}
	
	public static double calculatePoundToKilograms(double pound) {
		return 0.454 * pound;
	}
}
