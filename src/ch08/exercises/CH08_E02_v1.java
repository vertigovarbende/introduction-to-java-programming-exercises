package ch08.exercises;

import java.util.Scanner;

public class CH08_E02_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int ROW = 4;
	static final int COLUMN = 4;

	public static void main(String[] args) {

		double[][] matrix = new double[ROW][COLUMN];
		initializeMatrix(matrix);
		System.out.println("matrix");
		displayMatrix(matrix);
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

	}

	public static double sumMajorDiagonal(double[][] m) {
		double result = 0.0;
		for (int i = 0; i < m.length; ++i)
			for (int j = 0; j < m[i].length; ++j)
				if (i == j)
					result += m[i][j];
		return result;
	}

	public static void initializeMatrix(double[][] matrix) {
		System.out.println("Enter a 4-by-4 matrix row by row");
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