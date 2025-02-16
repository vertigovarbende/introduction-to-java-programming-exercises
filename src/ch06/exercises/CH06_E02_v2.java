package ch06.exercises;

import java.util.Scanner;

public class CH06_E02_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();
		
		System.out.print("The sum of the digits in an integer are " + sumDigits(number));
	}
	
	public static int sumDigits(long n) {
		
		int addition = 0;
		while(true) {
			addition += n % 10;
			n /= 10;
			if (n == 0)
				break;
		}
		return addition;
		
		
//		int addition = 0;
//		do {
//			addition += n % 10;
//			n /= 10;
//			if (n == 0)
//				break;
//		} while (true);
//		return addition;
	}
}
