package ch08.introduction;

import java.util.Scanner;

public class ProcessingTwoDimensionalArrays {

	/* Nested 'for' loops are often used to process a two-dimensional array. */

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matrix = new int[10][10];

		// (1) Initializing arrays with input values.
		System.out.println("(1)");
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
//		initializeArray(matrix);

		// (2) Initializing arrays with random values. between 0-99
		System.out.println("(2)");
		initializeArrayWithRandoms(matrix);

		// (3) Printing arrays
		System.out.println("(3)");
		displayMatrix(matrix);

		// (4) Summing all elements
		System.out.println("(4)");
		System.out.println("total: " + sumAllElements(matrix));

		// (5) Summing elements by column
		System.out.println("(5)");
		sumElementsByColumn(matrix);
		// (5.1) Summing elements by rows
		System.out.println("(5.1)");
		sumElementsByRow(matrix);

		// (6) Which row has the largest sum?
		System.out.println("(6)");
		whichRowHasTheLargestSum(matrix);

		// (7) Random shuffling
		System.out.println("(7)");
		displayMatrix(matrix);
		System.out.println("total: " + sumAllElements(matrix));
		System.out.println("after shuffling");
		randomShuffle(matrix);
		displayMatrix(matrix);
		System.out.println("total: " + sumAllElements(matrix));
	}

	// (1) initializing arrays with input values
	public static void initializeArray(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				matrix[i][j] = SCAN.nextInt();
	}

	// (2) Initializing arrays with random values. between 0-99
	public static void initializeArrayWithRandoms(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[0].length; ++j)
				matrix[i][j] = (int) (Math.random() * 100);
	}

	// (3) Printing arrays
	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	// (4) Summing all elements
	public static int sumAllElements(int[][] matrix) {
		int total = 0;
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				total += matrix[i][j];
		return total;
	}

	// (5) Summing elements by column
	public static void sumElementsByColumn(int[][] matrix) {
		int allTotal = 0;
		for (int j = 0; j < matrix[0].length; ++j) {
			int total = 0;
			for (int i = 0; i < matrix.length; ++i)
				total += matrix[i][j];
			allTotal += total;
			System.out.println("Sum for column " + j + " is " + total);
		}
		System.out.println("allTotal: " + allTotal);
	}

	// (5.1) Summing elements by row
	public static void sumElementsByRow(int[][] matrix) {
		int allTotal = 0;
		for (int row = 0; row < matrix.length; ++row) {
			int total = 0;
			for (int column = 0; column < matrix[row].length; ++column)
				total += matrix[row][column];
			allTotal += total;
			System.out.println("Sum for row " + row + " is " + total);
		}
		System.out.println("allTotal: " + allTotal);
	}

	// (6) Which row has the largest sum?
	public static void whichRowHasTheLargestSum(int[][] matrix) {
		int maxRow = 0;
		int indexOfMaxRow = 0;
		for (int i = 0; i < matrix[0].length; ++i)
			maxRow += matrix[0][i];

		for (int row = 1; row < matrix.length; ++row) {
			int totalOfThisRow = 0;
			for (int column = 0; column < matrix[row].length; ++column)
				totalOfThisRow += matrix[row][column];

			if (totalOfThisRow > maxRow) {
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
	}

	// (7) Random Shuffling
	public static void randomShuffle(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
	}
}