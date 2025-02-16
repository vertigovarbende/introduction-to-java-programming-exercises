package ch02.exercises;

import java.util.Scanner;

public class CH02_E05_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = scan.nextInt();
		
		int sumOfDigits = addTheDigitsOfTheNumber(number);
		System.out.println("The sum of the digits is " + sumOfDigits);
	}
	
	public static int addTheDigitsOfTheNumber(int number) {
		return (number % 10) + ((number % 100) / 10) + (number / 100);
	}
	
}
