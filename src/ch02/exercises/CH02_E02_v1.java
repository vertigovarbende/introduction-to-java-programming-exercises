package ch02.exercises;

import java.util.Scanner;

public class CH02_E02_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = scan.nextDouble();
		
		double meters = calculateFeetToMeters(feet);
		System.out.println(feet + " feet is " + meters + " meters");
	}
	
	public static double calculateFeetToMeters(double feet) {
		return (0.305 * feet);
	}
}
