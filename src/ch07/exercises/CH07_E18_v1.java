package ch07.exercises;

import java.util.Scanner;

public class CH07_E18_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;
	
	public static void main(String[] args) {
		
		double[] array = new double[SIZE];
		initializeArray(array);
		displayArray(array);
		System.out.println("sorted");
		bubbleSort(array);
		displayArray(array);
	}
	
	public static void bubbleSort(double[] array) {
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = 0; j < array.length - i - 1; ++j) {
				if (array[j] > array[j + 1]) {
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;	
				}
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