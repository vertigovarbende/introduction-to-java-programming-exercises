package ch07.exercises;

import java.util.Scanner;

public class CH07_E09_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {
		double[] numbers = new double[SIZE];

		initializeArray(numbers);
		displayArray(numbers);
		System.out.println("The minimum number is: " + min(numbers));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; ++i)
			if (min > array[i])
				min = array[i];
		return min;
	}

	public static void initializeArray(double[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextDouble();
		}
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}