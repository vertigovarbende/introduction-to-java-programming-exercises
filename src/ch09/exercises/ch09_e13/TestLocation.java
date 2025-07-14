package ch09.exercises.ch09_e13;

import java.util.Scanner;

public class TestLocation {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		// Get values from the user
		System.out.println("Enter the number of the rows and columns in the array: ");
		System.out.print("Enter row: ");
		int row = INPUT.nextInt();
		System.out.print("Enter column: ");
		int column = INPUT.nextInt();

		// Create a two-dimensional array with the specified row and column values
		double[][] matrix = new double[row][column];

		// initialize the matrix
		initializeMatrix(matrix);
		// display matrix
		System.out.println();
		displayMatrix(matrix);
		// Test locateLargest()
		Location largestLocation = locateLargest(matrix);
		System.out.println(
				"The location of the largest element is " + largestLocation.getMaxValue() + " at " + largestLocation);

	}

	public static Location locateLargest(double[][] a) {
		Location locObj = new Location();
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				if (locObj.getMaxValue() < a[i][j]) {
					locObj.setMaxValue(a[i][j]);
					locObj.setRow(i);
					locObj.setColumn(j);
				}
			}
		}
		return locObj;
	}

	public static void initializeMatrix(double[][] matrix) {
		System.out.println("Enter the matrix");
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				matrix[i][j] = INPUT.nextDouble();
			}
	}

	public static void displayMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}