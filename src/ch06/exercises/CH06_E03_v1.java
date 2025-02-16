package ch06.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH06_E03_v1 {
	public static void main(String[] args) {

		// Test of the methods isPalindrome() and reverse()

		// Test reverse()
//		System.out.println(reverse(456)); // 654
//		System.out.println(reverse(123)); // 321
//		System.out.println(reverse(1024)); // 4201
//		System.out.println(reverse(15023)); // 32051

		// Test isPalindrome()
//		System.out.println(isPalindrome(1) == true);
//		System.out.println(isPalindrome(4) == true);
//		System.out.println(isPalindrome(101) == true);
//		System.out.println(isPalindrome(363) == true);
//		System.out.println(isPalindrome(4004) == true);
//		System.out.println(isPalindrome(456) == false);
//		System.out.println(isPalindrome(123) == false);
//		System.out.println(isPalindrome(1024) == false);
//		System.out.println(isPalindrome(15023) == false);

		// Solution of the question

		// get an integer number from user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();

		// check whether the number is palindrome number or not
		System.out.println("Is the number palindrome? " + isPalindrome(number));

	}

	public static int reverse(int number) {
		int counter = 0;
		int numberCopy = number;
		int reverseNumber = 0;
		while (number > 0) {
			++counter;
			number /= 10;
		}
		int[] numbers = new int[counter];
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = numberCopy % 10;
			numberCopy /= 10;
		}
		for (int i = 0; i < numbers.length; ++i) {
			reverseNumber += numbers[i] * (int) pow(10, counter - 1);
			--counter;
		}
		return reverseNumber;
	}

	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

}
