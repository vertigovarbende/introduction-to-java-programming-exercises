package ch07.exercises;

import java.util.Scanner;

public class CH07_E05_v1 {
	// you didn't solve this! look at again!
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = new int[10];
		initializeArray(array);
		displayArray(array);
		displayResult(array);
	}

	public static void displayResult(int[] array) {
		int distinctNumber = 0;
		for (int i = 0; i < array.length; ++i) {
			if (countNumber(array, array[i]) < 1)
				++distinctNumber;
		}
		int[] newArray = new int[distinctNumber];
		for (int i = 0; i < array.length; ++i) {
			if (countNumber(newArray, newArray[i]) > 1)
				continue;
			newArray[i] = array[i];
		}
	}

	public static int countNumber(int[] array, int number) {
		int count = 0;
		for (int i = 0; i < array.length; ++i)
			if (array[i] == number)
				++count;
		return count;
	}

	public static void initializeArray(int[] array) {
		System.out.println("Enter ten numbers");
		for (int i = 0; i < array.length; ++i) {
			System.out.print("[" + i + "]: ");
			array[i] = scan.nextInt();
		}
	}

	public static void displayArray(int[] array) {
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}