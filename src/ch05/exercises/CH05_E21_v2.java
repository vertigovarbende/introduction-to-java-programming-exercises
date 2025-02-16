package ch05.exercises;

import java.util.Scanner;

public class CH05_E21_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loan = scan.nextDouble();

		System.out.print("Number of Years: ");
		int year = scan.nextInt();
		
		displayTable(loan, year);

	}

	public static double calMonthlyPayment(double annualInterestRate, double loan, int year) {
		double monthlyInterestRate = annualInterestRate / 1200;
		return (loan * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
	}

	public static void displayTable(double loan, int year) {
		System.out.println("Interest Rate   Monthly Payment   Total Payment\n");
		for (double i = 5.0; i <= 8.0; i += 0.125) {
			System.out.format("%.3f", i);
			System.out.print("% 	        ");
			System.out.format("%.2f 	          %.2f\n", calMonthlyPayment(i, loan, year), (calMonthlyPayment(i, loan, year) * 60));
		}
	}

}
