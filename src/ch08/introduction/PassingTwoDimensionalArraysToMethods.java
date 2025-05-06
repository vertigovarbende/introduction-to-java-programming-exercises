package ch08.introduction;

import java.util.Scanner;

public class PassingTwoDimensionalArraysToMethods {

	/*
	 * When passing a two-dimensional array to a method, the reference of the array
	 * is passed to the method
	 */

	public static void main(String[] args) {

		int[][] m = getArray();
		System.out.println("sum: " + sum(m));

		// (8.7)
		System.out.println("(8.7)");
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out.println(m1(array)[0]);
		System.out.println(m1(array)[1]);
	}

	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);

		int[][] m = new int[3][4];
		System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
		for (int i = 0; i < m.length; ++i)
			for (int j = 0; j < m[i].length; ++j)
				m[i][j] = input.nextInt();
		return m;
	}

	public static int sum(int[][] m) {
		int total = 0;
		for (int row = 0; row < m.length; ++row)
			for (int column = 0; column < m[row].length; ++column)
				total += m[row][column];
		return total;
	}

	// (8.7)
	public static int[] m1(int[][] m) {
		int[] result = new int[2];
		result[0] = m.length;
		result[1] = m[0].length;
		return result;
	}

}