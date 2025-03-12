package ch07.exercises;

import java.util.Scanner;

public class CH07_E08_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {

		double[] dArray = new double[SIZE];
		int[] iArray = new int[SIZE];

		initializeArray(dArray);
		displayArray(dArray);
		System.out.println(average(dArray));

		initializeArray(iArray);
		displayArray(iArray);
		System.out.println(average(iArray));

	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void initializeArray(double[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextDouble();
		}
	}

	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextInt();
		}
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; ++i)
			sum += array[i];
		return sum / array.length;
	}

	public static double average(double[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; ++i)
			sum += array[i];
		return sum / array.length;
	}
}