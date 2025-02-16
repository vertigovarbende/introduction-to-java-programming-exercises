package ch05.exercises;

import java.util.Scanner;

public class CH05_E21_v1 {

	public static void main(String[] args) {
		//		(loan * ((double)(5) / 1200)) / (1 - 1 / Math.pow(1 + ((double)(5) / 1200), year * 12));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loan = scan.nextDouble();
		
		System.out.print("Number of Years: ");
		int year = scan.nextInt();
		System.out.println();
		calRate(loan, year);
		
	

	}

	public static void calRate(double loan, int year) {
		
		double monthlyInterestRate = 0.0;
		double monthlyPayment = 0.0;
		System.out.println("Interest Rate   Monthly Payment   Total Payment");
		for (double annualInterestRate = 5.0;annualInterestRate <= 8.0; annualInterestRate += 0.125) {
			monthlyInterestRate = annualInterestRate / 1200;
			monthlyPayment = (loan * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
			System.out.format("%.3f", annualInterestRate);
			System.out.print("% 	        ");
			System.out.format("%.2f 	          %.2f\n", monthlyPayment, monthlyPayment * 60);
		}
	}
}
