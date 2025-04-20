package ch07.exercises;

import java.util.Scanner;

public class CH07_E30_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the number of values: ");
		int n = SCAN.nextInt();
		int[] values = new int[n];

		initializeArray(values);
		displayArray(values);
		display(values);
	}

	public static void display(int[] values) {
		if (isConsecutiveFour(values))
			System.out.println("The list has consecutive fours");
		else
			System.out.println("The list has no consecutive fours");
	}

	public static boolean isConsecutiveFour(int[] values) {
		int count = 1;
		for (int i = 0; i < values.length - 1; ++i) {
			int j = i + 1;
			if (values[i] == values[j])
				++count;
		}
		if (count == 4)
			return true;
		return false;
	}

	public static void initializeArray(int[] array) {
		System.out.println("Enter the values");
		for (int i = 0; i < array.length; ++i) {
			System.out.print("[" + i + "]: ");
			array[i] = SCAN.nextInt();
		}
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}