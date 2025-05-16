package ch08.exercises;

import java.util.Scanner;

public class CH08_E16_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int ROW = 6;
	static final int COLUMN = 2;

	public static void main(String[] args) {

		int[][] matrix = new int[ROW][COLUMN];
		initializeMatrix(matrix);
		sort(matrix);
		displayMatrix(matrix);
	}

	public static void displayMatrix(int[][] matrix) {
		System.out.print("{");
		for (int i = 0; i < matrix.length; ++i) {
			System.out.print("{");
			for (int j = 0; j < matrix[i].length; ++j) {
				if (j == 0)
					System.out.print(matrix[i][j] + ", ");
				else
					System.out.print(matrix[i][j]);
			}
			System.out.print("}");
		}
		System.out.print("}");
	}

	public static void initializeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				matrix[i][j] = INPUT.nextInt();
			}
	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length - 1; ++i) {
			int[] currentMin = m[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < m.length; ++j) {
				if (currentMin[0] > m[j][0]) {
					currentMin = m[j];
					currentMinIndex = j;
				} else if (currentMin[0] == m[j][0]) {
					if (currentMin[1] > m[j][1]) {
						currentMin = m[j];
						currentMinIndex = j;
					}
				}
			}
			if (currentMinIndex != i) {
				m[currentMinIndex] = m[i];
				m[i] = currentMin;
			}
		}

	}
}