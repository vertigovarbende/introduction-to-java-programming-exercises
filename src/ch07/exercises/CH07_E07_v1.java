package ch07.exercises;

import java.util.Random;

public class CH07_E07_v1 {

	static final Random RAND = new Random();

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] counts = new int[10];

		int number = 0;
		for (int i = 1; i <= 100; ++i) {
			number = RAND.nextInt(0, 10);
			countNumber(numbers, counts, number);
			System.out.print(number + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		displayCounts(counts);
	}

	public static void displayCounts(int[] counts) {
		System.out.println();
		for (int i = 0; i < counts.length; ++i)
			System.out.println("counts of " + i + " is: " + counts[i]);
	}

	public static void countNumber(int[] numbers, int[] counts, int number) {
		for (int i = 0; i < numbers.length; ++i)
			if (numbers[i] == number)
				counts[i] = counts[i] + 1;
	}
}