package ch07.exercises;

import java.util.Scanner;

public class CH07_E20_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {
		double[] numbers = new double[SIZE];
		initializeArray(numbers);
		System.out.println("before sort");
		displayArray(numbers);
		System.out.println("after sort - largest");
		selectionSortLargest(numbers);
		displayArray(numbers);
		System.out.println("after sort - smallest");
		selectionSortSmallest(numbers);
		displayArray(numbers);

	}

	public static void selectionSortLargest(double[] list) {
		for (int i = 0; i < list.length - 1; ++i) {
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; ++j) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

	public static void selectionSortSmallest(double[] list) {
		for (int i = 0; i < list.length - 1; ++i) {
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; ++j) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	public static void displayArray(double[] array) {
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
}