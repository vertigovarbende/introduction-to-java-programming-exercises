package ch07.exercises;

import java.util.Scanner;

public class CH07_E26_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the size of lists: ");
		int n = SCAN.nextInt();
		int[] list1 = new int[n];
		int[] list2 = new int[n];

		System.out.println("Enter list1");
		initializeArray(list1);
		System.out.println("Enter list2");
		initializeArray(list2);
		result(list1, list2);

	}

	public static void result(int[] list1, int[] list2) {
		if (equals(list1, list2))
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");
	}

	public static boolean equals(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; ++i)
			if (list1[i] != list2[i])
				return false;
		return true;
	}

	public static void initializeArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("[" + array[i] + "]: ");
			array[i] = SCAN.nextInt();
		}
	}
}