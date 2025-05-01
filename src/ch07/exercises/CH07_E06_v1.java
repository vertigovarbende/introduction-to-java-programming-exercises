package ch07.exercises;

import static java.lang.Math.*;

public class CH07_E06_v1 {

	static final int NUMBER_OF_PRIMES = 50;
	static final int NUMBER_OF_PRIMES_PER_LINE = 10;

	public static void main(String[] args) {

		int count = 0;
		int number = 2;
		int[] primeNumbers = new int[NUMBER_OF_PRIMES];

		System.out.println("The first 50 prime numbers are\n");

		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;

			for (int divisor = 2; divisor <= sqrt(number); ++divisor) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers[count] = number;
				++count;
				++number;
			}
		}
		displayArray(primeNumbers);

	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}