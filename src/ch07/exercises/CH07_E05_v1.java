package ch07.exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class CH07_E05_v1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = new int[10];
		initializeArray(array);
	}

	public static void initializeArray(int[] array) {
		ArrayList<Integer> distinctArray = new ArrayList<Integer>();
		System.out.println("Enter ten numbers");
		for (int i = 0; i < array.length; ++i) {
			System.out.print("[" + i + "]: ");
			array[i] = scan.nextInt();
			if (!distinctArray.contains(array[i]))
				distinctArray.add(array[i]);
		}
		displayArray(array);
		displayDistinct(distinctArray);
	}

	public static void displayDistinct(ArrayList<Integer> array) {
		System.out.println("The number of distinct number is " + array.size());
		System.out.print("The distinct numbers are: ");
		for (int a : array)
			System.out.print(a + " ");
		System.out.println();
	}

	public static void displayArray(int[] array) {
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}