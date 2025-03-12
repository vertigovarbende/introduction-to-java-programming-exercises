package ch07.exercises;

import java.util.Random;

public class CH07_E07_v2 {

	static final Random RAND = new Random();

	public static void main(String[] args) {
		int[][] cNumbers = new int[9][1];

		int number = 0;

		for (int i = 1; i <= 100; ++i) {
			number = RAND.nextInt(0, 10);
			countNumber(cNumbers, number);
			System.out.print(number + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		displayCounts(cNumbers);
	}

	public static void displayCounts(int[][] counts) {
		System.out.println();
		for (int i = 0; i < counts.length; ++i)
			System.out.println("counts of " + i + " is: " + counts[i][0]);
	}

	public static void countNumber(int[][] cNumbers, int number) {
		for (int i = 0; i < cNumbers.length; ++i)
			if (i == number)
				cNumbers[i][0] = cNumbers[i][0] + 1;
	}
}