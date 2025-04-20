package ch07.exercises;

import java.util.Scanner;

public class CH07_E31_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the length of list1: ");
		int n1 = SCAN.nextInt();
		int[] list1 = new int[n1];
		initializeList(list1);

		System.out.print("Enter the length of list2: ");
		int n2 = SCAN.nextInt();
		int[] list2 = new int[n2];
		initializeList(list2);

		System.out.print("list1: ");
		displayList(list1);
		System.out.print("list2: ");
		displayList(list2);

		System.out.print("The merged list is ");
		displayList(merge(list1, list2));

	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedList = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; ++i)
			mergedList[i] = list1[i];
		for (int i = list1.length; i < mergedList.length; ++i)
			mergedList[i] = list2[i - list1.length];
		return sortList(mergedList);
	}

	public static int[] sortList(int[] list) {
		for (int i = 0; i < list.length - 1; ++i) {
			for (int j = i + 1; j < list.length; ++j) {
				if (list[i] > list[j]) {
					int temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
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