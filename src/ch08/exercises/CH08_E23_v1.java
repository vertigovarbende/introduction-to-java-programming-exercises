package ch08.exercises;

import java.util.Scanner;

public class CH08_E23_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int SIZE = 6;

	public static void main(String[] args) {
		int[][] matrix = new int[SIZE][SIZE];
		initializeMatrix(matrix);
		displayMatrix(matrix);
//		int[][] matrix7 = {
//				{0, 1, 1, 1},
//				{0, 1, 1, 0},
//				{0, 1, 0, 1},
//				{1, 0, 1, 0}
//		};
		evenNumberOfOnes(matrix);
	}

	public static void evenNumberOfOnes(int[][] matrix) {
		int count = 0;
		int jIndex = 0;
		for (int i = 0; i < matrix.length; ++i) {
			count = 0;
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == 1) {
					++count;
					jIndex = j;
				}
			}
			if (count % 2 != 0) {
				System.out.println("The flipped cell is at (" + i + "," + jIndex + ")");
				System.exit(0);
			}
		}
		for (int i = 0; i < matrix.length; ++i) {
			count = 0;
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[j][i] == 1) {
					++count;
					jIndex = j;
				}
			}
			if (count % 2 != 0) {
				System.out.println("The flipped cell is at (" + i + "," + jIndex + ")");
				System.exit(0);
			}
		}
	}

	public static void initializeMatrix(int[][] matrix) {
		System.out.println("Enter a 6-by-6 matrix row by row");
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				matrix[i][j] = INPUT.nextInt();
			}
	}

	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}
