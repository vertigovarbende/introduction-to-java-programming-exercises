package ch07.exercises;

import java.util.Scanner;

public class CH07_E12_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {
		int[] array = new int[SIZE];
		initializeArray(array);
		displayArray(array);
		System.out.println("Reversed");
		displayArray(reverse(array));
	}

	public static int[] reverse(int[] array) {
		int[] reversedArray = new int[array.length];
		int temp = 0;
		for (int i = 0, j = array.length - 1; i < array.length; ++i, --j)
			reversedArray[i] = array[j];
		return reversedArray;
	}

	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextInt();
		}
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}