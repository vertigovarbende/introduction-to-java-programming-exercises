package ch02.exercises;

import java.util.Scanner;

public class CH02_E04_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the subtotal: ");
		double subtotal = scan.nextDouble();

		System.out.print("Enter a gratuity rate: ");
		double gratuityRate = scan.nextDouble();
		
		double gratuity = calculateGratuity(subtotal, gratuityRate);
		double total = calculateTotal(subtotal, gratuity);
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
	
	public static double calculateGratuity(double subtotal, double gratuityRate) {
		return (subtotal * (gratuityRate / 100));
	}

	public static double calculateTotal(double subtotal, double gratuity) {
		return gratuity + subtotal;
	}
}
