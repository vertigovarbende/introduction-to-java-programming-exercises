package ch12.introduction.quotient;

import java.io.IOException;
import java.util.Scanner;

public class QuotientWithException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try {
			int result = quotitent(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
		} catch(ArithmeticException ex) {
			System.out.println("Exception: an integer cannot be divided by zero");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Execution continues");
	}
	
	public static int quotitent(int number1, int number2) {
		if (number2 == 0)
			throw new ArithmeticException("Divisor cannot be zero");
		return number1 / number2;
	}
	
	// unchecked exception
//	public static int quotitent(int number1, int number2) throws ArithmeticException {
//		if (number2 == 0)
//			throw new ArithmeticException("Divisor cannot be zero");
//		return number1 / number2;
////		return number1 / number2;
//	}
}
