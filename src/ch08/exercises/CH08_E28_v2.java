package ch08.exercises;

import java.util.Scanner;

public class CH08_E28_v2 {

	static final int SIZE = 3;
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] list1 = new int[SIZE][SIZE];
		int[][] list2 = new int[SIZE][SIZE];
		System.out.println("Enter list1");
		initializeList(list1);
		System.out.println("Enter list2");
		initializeList(list2);
		if (equals(list1, list2))
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays are not strictly identical");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < SIZE; ++i)
			for (int j = 0; j < SIZE; ++j)
				if (m1[i][j] != m2[i][j])
					return false;
		return true;
	}

	public static void initializeList(int[][] m) {
		for (int i = 0; i < m.length; ++i)
			for (int j = 0; j < m[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				m[i][j] = INPUT.nextInt();
			}
	}

	public static void displayList(int[][] m) {
		for (int i = 0; i < m.length; ++i) {
			for (int j = 0; j < m[i].length; ++j)
				System.out.print(m[i][j] + " ");
		}
		System.out.println();
	}
}
