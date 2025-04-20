package ch07.exercises;

import java.util.Scanner;

public class CH07_E27_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the size of lists: ");
		int n = SCAN.nextInt();
		int[] list1 = new int[n];
		int[] list2 = new int[n];

		System.out.println("Enter list1");
		initializeList(list1);
		System.out.println("Enter list2");
		initializeList(list2);

		sortList(list1);
		sortList(list2);

		displayResult(list1, list2);
	}

	public static void displayResult(int[] list1, int[] list2) {
		if (equals(list1, list2))
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");
	}

	public static void sortList(int[] list) {
		for (int i = 0; i < list.length - 1; ++i) {
			int min = i;
			for (int j = i + 1; j < list.length; ++j) {
				if (list[j] < list[min]) {
					min = j;
					int a = list[i];
					list[i] = list[min];
					list[min] = a;
				}
			}
		}
	}

	public static boolean equals(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; ++i)
			if (list1[i] != list2[i])
				return false;
		return true;
	}

	public static void initializeList(int[] list) {
		for (int i = 0; i < list.length; ++i) {
			System.out.print("[" + i + "]: ");
			list[i] = SCAN.nextInt();
		}
	}

	public static void displayList(int[] list) {
		for (int i = 0; i < list.length; ++i)
			System.out.print(list[i] + " ");
		System.out.println();
	}

}