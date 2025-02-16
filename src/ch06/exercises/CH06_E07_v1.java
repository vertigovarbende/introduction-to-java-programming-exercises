package ch06.exercises;

import static java.lang.Math.pow;
import java.util.Scanner;

public class CH06_E07_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Test of futureInvestmentValue() method

//		System.out.println(futureInvestmentValue(10_000, 5, 5));
//		System.out.println(futureInvestmentValue(10_000, 5, 5) == 12_833.59); // return false because of the double value! but it works
		
		System.out.print("The amount invested: ");
		double amount = scan.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = scan.nextDouble();
		System.out.println();

		System.out.println("Years\tFuture Value");
		for (int i = 1; i <= 30; ++i) {
//			System.out.println(i + "\t" + futureInvestmentValue(amount, (annualInterestRate / 1200), i));
			System.out.format("%d\t%.2f\n", i, futureInvestmentValue(amount, (annualInterestRate / 1200), i));
		}
		
	}
	

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * pow((1 + monthlyInterestRate), years * 12);
	}

	// mine
//	public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years) {
//		double monthlyInterestRate = annualInterestRate / 1200;
//		return investmentAmount * pow((1 + monthlyInterestRate), years * 12);
//	}

}

// test

// double monthlyInterestRate = annualInterestRate / 1200;
// futureInvestmentValue = investmentAmount * pow((1 + monthlyInterestRate), numberOfYears * 12)