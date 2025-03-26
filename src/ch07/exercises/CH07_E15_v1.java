package ch07.exercises;

import java.util.Scanner;

public class CH07_E15_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {
		int[] array = new int[SIZE];
		initializeArray(array);
		displayArray(array);
		System.out.println("eliminated duplicates");
		displayArray(eliminateDuplicates(array));

	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] newArray = new int[list.length];
		for (int i = 0; i < list.length; ++i)
			if (isSameNumber(list[i], newArray))
				newArray[i] = list[i];
		return newArray;
	}

	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextInt();
		}
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == 0)
				continue;
			else
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean isSameNumber(int number, int... numbers) {
		for (int i = 0; i < numbers.length; ++i)
			if (number == numbers[i])
				return false;
		return true;
	}
}