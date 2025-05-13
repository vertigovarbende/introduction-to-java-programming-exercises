package ch08.exercises;

import java.util.Scanner;

public class CH08_E13_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] matrix = initializeMatrix();
		displayMatrix(matrix);
		int[] indices = locateLargest(matrix);
		System.out.println("The location of the largest elements is at (" + indices[0] + ", " + indices[1] + ")");
	}

	public static int[] locateLargest(double[][] a) {
		int[] indices = new int[2];
		double max = 0.0;
		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				if (max < a[i][j]) {
					max = a[i][j];
					indices[0] = i;
					indices[1] = j;
				}
		return indices;
	}

	public static double[][] initializeMatrix() {
		System.out.println("Enter the number of rows and columns of the array");
		System.out.print("row: ");
		int row = INPUT.nextInt();
		System.out.print("column: ");
		int column = INPUT.nextInt();
		double[][] matrix = new double[row][column];
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				matrix[i][j] = INPUT.nextDouble();
			}
		return matrix;

	}

	public static void displayMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}