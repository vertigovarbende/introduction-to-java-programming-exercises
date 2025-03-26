package ch07.exercises;

import java.util.Scanner;

public class CH07_E19_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("length: ");
		int length = SCAN.nextInt();
		double[] array = new double[length];
		initializeArray(array);
		displayArray(array);
		isSorted(array);
	}

	public static boolean isSorted(double[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = 0; j < array.length - i - 1; ++j) {
				if (array[j] > array[j + 1]) {
					System.out.println("The list is not sorted");
					return false;
				}
			}
		}
		System.out.println("The list is already sorted");
		return true;
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void initializeArray (double[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextDouble();
		}
	}
}
