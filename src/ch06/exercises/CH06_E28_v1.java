package ch06.exercises;

import static java.lang.Math.*;

public class CH06_E28_v1 {

	public static void main(String[] args) {
		displayTable();
	}

	public static void displayTable() {
		System.out.println("p\t2^p - 1");
		printHypen(15);
		for (int i = 2; i <= 31; ++i) {
			if (isPrime(i) && isPrime((int) pow(2, i) - 1))
				System.out.println(i + "\t  " + ((int) pow(2, i) - 1));
		}
		System.out.println();
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; ++i) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void printHypen(int len) {
		for (int i = 0; i < len; ++i)
			System.out.print("-");
		System.out.println();
	}
}
