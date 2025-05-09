package ch08.introduction;

import java.util.Scanner;

public class GuessBirthdayUsingArray {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		int[][][] dates = { { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 }, { 25, 27, 29, 31 } },
				{ { 2, 3, 6, 7 }, { 10, 11, 14, 15 }, { 18, 19, 22, 23 }, { 26, 27, 30, 31 } },
				{ { 4, 5, 6, 7 }, { 12, 13, 14, 15 }, { 20, 21, 22, 23 }, { 28, 29, 30, 31 } },
				{ { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } },
				{ { 16, 17, 18, 19 }, { 20, 21, 22, 23 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } } };

		guessBirthday(dates);

		System.out.println();

		// (8.8)
		int[][][] array = new int[4][6][5];

		// (8.9)
		// x.length --> 12
		// x[2].length --> 5
		// x[0][0].length --> 2

		int[][][] x = new int[12][5][2];
		System.out.println(x.length); // 12
		System.out.println(x[2].length); // 5
		System.out.println(x[0][0].length); // 2
		System.out.println();
		// (8.10)
		// array[0][0][0] --> 1
		// array[1][1][1] --> 8

		int[][][] array2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		System.out.println(array2[0][0][0]); // 1
		System.out.println(array2[1][1][1]); // 8
		System.out.println();

	}

	public static void guessBirthday(int[][][] dates) {
		int day = 0;
		int answer = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Is your birthday in Set" + (i + 1) + "?");
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++)
					System.out.printf("%4d", dates[i][j][k]);
				System.out.println();
			}

			System.out.print("\nEnter 0 for No and 1 for Yes: ");
			answer = INPUT.nextInt();

			if (answer == 1)
				day += dates[i][0][0];
		}

		System.out.println("Your birthday is: " + day);
	}
}