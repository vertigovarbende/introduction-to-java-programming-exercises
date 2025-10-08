package ch12.exercises.ch12_e02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CH12_E02_v1 {

	public static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isValid = false;
		while (!isValid) {
			try {
				System.out.print("Enter an integer number: ");
				int number1 = INPUT.nextInt();
				System.out.print("Enter an integer number: ");
				int number2 = INPUT.nextInt();
				int sum = calculate(number1, number2);
				System.out.println(number1 + " + " + number2 + " = " + sum);
				isValid = true;
			} catch (InputMismatchException ex) {
				System.out.println(ex);
				System.out.println("Please enter the numbers again");
				INPUT.nextLine();
			}	
		}
	}

	public static int calculate(int a, int b) {
		return a + b;
	}
}
