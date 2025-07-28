package ch10.exercises.ch10_e05;

import java.util.Scanner;

public class TestFindSmallestFactors {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		int value;
		do {
			System.out.print("Please enter a positive integer value: ");
			value = INPUT.nextInt();
			displaySmallestFactors(findSmallestFactors(value));
		} while (value > 0);

	}

	public static StackOfIntegers findSmallestFactors(int value) {
		StackOfIntegers stack = new StackOfIntegers();
		int division = 2;

		while (value > 1) {
			if (value % division == 0) {
				stack.push(division);
				value /= division;
			} else
				++division;
		}
		return stack;
	}

	public static void displaySmallestFactors(StackOfIntegers stack) {
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}
