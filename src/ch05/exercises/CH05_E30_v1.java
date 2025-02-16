package ch05.exercises;

import java.util.*;

public class CH05_E30_v1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		double amount = scan.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double interestRate = scan.nextDouble();

		System.out.print("Enter the number of months: ");
		int month = scan.nextInt();

		System.out.println("The value in the account: " + calValue(amount, interestRate, month));

	}

	public static double calValue(double amount, double interestRate, int month) {
		double monthlyInterestRate = (interestRate / 100) / month;
		double valueInAccount = 0.0;
		for (int i = 1; i <= month; ++i) {
			valueInAccount = (amount + valueInAccount) * (1 + monthlyInterestRate);
			// System.out.println(i + " " + valueInAccount); // test
//			System.out.format("%d %.3f\n", i, valueInAccount); // test 2
		}

		return valueInAccount;
	}

}
