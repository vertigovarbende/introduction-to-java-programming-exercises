package ch05.exercises;

import java.util.*;

public class CH05_E31_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		double amount = scan.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double annualPercentage = scan.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonth = scan.nextInt();
		
		System.out.println();
		calCD(amount, annualPercentage, numberOfMonth);
		

	}
	
	public static void calCD(double amount, double annualPercentage, int numberOfMonth) {
		double valueInAccount = amount;
		
		System.out.println("Month CD Value");
		for (int i = 0; i < numberOfMonth; ++i) {
			valueInAccount = valueInAccount + (valueInAccount * (annualPercentage / 1200));
			System.out.format("%d\t%.2f\n", i + 1, valueInAccount);
		}
	}

}
