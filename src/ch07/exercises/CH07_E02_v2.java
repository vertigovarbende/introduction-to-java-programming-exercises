package ch07.exercises;

import java.util.Scanner;

public class CH07_E02_v2 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[10];
		initializeArray(array);
		displayArray(array);
		displayArrayReversed(array);
	}

	public static void displayArrayReversed(int[] array) {
		for (int i = array.length - 1; i >= 0; --i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("[" + i + "]: ");
			array[i] = scan.nextInt();
		}
	}
}