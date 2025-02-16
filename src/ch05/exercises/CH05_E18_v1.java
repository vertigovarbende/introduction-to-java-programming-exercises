package ch05.exercises;

import java.util.Scanner;

public class CH05_E18_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int line = scan.nextInt();

		displayPatternA(line);
		displayPatternB(line);
		displayPatternC(line);
		displayPatternD(line);

	}
	
	public static void displayPatternD(int line) {
		System.out.println("\nPatternD");
		for (int i = 1; i <= line; ++i) {
			for (int j = 1; j < i; ++j)
				System.out.print("  ");
			for (int k = 1; k <= line - i + 1; ++k)
				System.out.print(k + " ");
			System.out.println();
		}
	}

	public static void displayPatternC(int line) {
		System.out.println("\nPatternC");
		for (int i = 1; i <= line; ++i) {
			for (int j = line - i; j > 0; --j)
				System.out.print("  ");
			for (int k = i; k >= 1; --k)
				System.out.print(k + " ");
			System.out.println();
		}
	}

	public static void displayPatternB(int line) {
		System.out.println("\nPatternB");
		for (int i = 1; i <= line; ++i) {
			for (int j = 1; j <= line - i + 1; ++j)
				System.out.print(j + " ");
			System.out.println();
		}
	}

	public static void displayPatternA(int line) {
		System.out.println("\nPatternA");
		for (int i = 1; i <= line; ++i) {
			for (int j = 1; j <= i; ++j)
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
