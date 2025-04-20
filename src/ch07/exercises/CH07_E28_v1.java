package ch07.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH07_E28_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {
		int[] numbers = new int[SIZE];
		enterNumbers(numbers);
		displayAllCombinations(numbers);
	}

	public static void displayAllCombinations(int[] numbers) {
		System.out.println("C(10,2) = " + calculateCombination(numbers));
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print(i + ": ");
			for (int j = i + 1; j < numbers.length; ++j)
				System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
			System.out.println();
		}
	}

	public static int calculateFact(int number) {
		if (number < 1)
			return 1;
		else
			return number * calculateFact(number - 1);
	}

	public static int calculateCombination(int[] numbers) {
		return (calculateFact(numbers.length)) / ((calculateFact(2) * (calculateFact(numbers.length - 2))));
	}

	public static void enterNumbers(int[] numbers) {
		System.out.println("Enter ten numbers");
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print("number[" + (i + 1) + "]: ");
			numbers[i] = SCAN.nextInt();
		}
		System.out.println();
	}
}