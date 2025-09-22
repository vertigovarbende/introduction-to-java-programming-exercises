package ch12.introduction.quotient;

import java.util.Scanner;

public class Quotient {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		// If you entered 0 for the second number, a runtime error would occur
		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
	}

}
