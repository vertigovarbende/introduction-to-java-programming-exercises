package ch07.exercises;

import java.util.Scanner;

public class CH07_E02_v1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[10];
		initializeArray(array);
		reverseArray(array);
		displayArray(array);
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

	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; ++i) {
			int temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;
		}
	}
}