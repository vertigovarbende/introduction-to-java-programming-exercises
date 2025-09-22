package ch12.introduction.quotient;

import java.util.Scanner;

public class QuotientWithMethod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		int result = quotient(number1, number2);
		System.out.println(number1 + " / " + number2 + " is " + result);

	}

	/*
	 * If number2 is 0, it cannot return a value, so the program is terminated in
	 * line 7. This is clearly a problem. You should not let the method terminate
	 * the program—the caller should decide whether to termi nate the program.
	 */
	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
			System.out.println("Divisior cannot be zero");
			System.exit(1);
		}
		return number1 / number2;
	}
}
