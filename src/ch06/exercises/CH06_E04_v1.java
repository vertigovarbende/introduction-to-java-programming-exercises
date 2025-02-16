package ch06.exercises;

import java.util.Scanner;

public class CH06_E04_v1 {
	public static void main(String[] args) {

		// Test reverse() with testReverse()
//		System.out.println(testReverse(12) == 21);
//		System.out.println(testReverse(123) == 321);
//		System.out.println(testReverse(423) == 324);
//		System.out.println(testReverse(3456) == 6543);

		// Solution of the question
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();
		reverse(number);

	}

	public static void reverse(int number) {
		String reverseNumberString = "";
		for (int i = Integer.toString(number).length() - 1; i >= 0; --i)
			reverseNumberString += Integer.toString(number).charAt(i);

		int reverseNumberInt = Integer.parseInt(reverseNumberString);
		System.out.println(number + " - " + reverseNumberInt);
//		System.out.println(reverseNumberInt + 2);
	}

//	public static int testReverse(int number) {
//		String reverseNumberString = "";
//		for (int i = Integer.toString(number).length() - 1; i >= 0; --i)
//			reverseNumberString += Integer.toString(number).charAt(i);
//		return Integer.parseInt(reverseNumberString);
//	}
}
