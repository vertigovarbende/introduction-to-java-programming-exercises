package ch07.exercises;

import java.util.Scanner;

public class CH07_E32_v1 {
	// you didn't solve this! look at again!

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the length of the list: ");
		int n = SCAN.nextInt();
		int[] list = new int[n];

		initializeList(list);
		displayList(list);
		

	}

	public static int partition(int[] list) {
		int pivot = list[0], temp = 0;
		for (int i = 1; i < list.length; ++i) {
			if (list[i] <= pivot) {
				temp = list[i];
				list[i] = pivot;
				list[i - 1] = temp;
			}
		}
		return pivot;
	}

	public static void initializeList(int[] list) {
		for (int i = 0; i < list.length; ++i) {
			System.out.print("[" + i + "]: ");
			list[i] = SCAN.nextInt();
		}
		System.out.println();
	}

	public static void displayList(int[] list) {
		for (int i = 0; i < list.length; ++i)
			System.out.print(list[i] + " ");
		System.out.println();
	}
}
