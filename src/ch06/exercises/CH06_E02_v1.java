package ch06.exercises;

import java.util.Scanner;

public class CH06_E02_v1 {

	public static void main(String[] args) {
		// get an integer number from user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();

		// Test sumDigits()
		System.out.println("The sum of the digits are " + sumDigits(number));
	}

	// This method computes the sum of the digits in an integer and return
	public static int sumDigits(long n) {
		int addition = 0; 
		while (n > 0) {
			addition += n % 10; // sum the digits
			n /= 10;
		}
		return addition;
	}

}
