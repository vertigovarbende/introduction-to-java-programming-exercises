package ch08.exercises;

import java.util.Scanner;

public class CH08_E14_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the size for the matrix: ");
		int size = INPUT.nextInt();
		int[][] matrix = new int[size][size];
		initializeMatrix(matrix);
		displayMatrix(matrix);
		checkRow(matrix);
		checkColumn(matrix);
		checkMajorDiagonal(matrix);
		checkSubDiagonal(matrix);

//		int[][] matrix2 = {
//				{1, 0, 0, 0},
//				{0, 1, 0, 0},
//				{0, 0, 1, 0},
//				{0, 0, 0, 1}
//		};
//		
//		int[][] matrix3 = {
//				{0, 0, 0, 1},
//				{0, 0, 1, 0},
//				{0, 1, 0, 0},
//				{1, 0, 0, 0}
//		};
//		
//		checkMajorDiagonal(matrix2);
//		checkSubDiagonal(matrix3);
//		
//		
//		int[][] matrix4 = {
//				{0, 1, 1, 1},
//				{1, 0, 1, 1},
//				{1, 1, 0, 1},
//				{1, 1, 1, 0}
//		};
//		
//		int[][] matrix5 = {
//				{1, 1, 1, 0},
//				{1, 1, 0, 1},
//				{1, 0, 1, 1},
//				{0, 1, 1, 1}
//		};
//		
//		checkMajorDiagonal(matrix4);
//		checkSubDiagonal(matrix5);
//		
//		int[][] matrix6 = {
//				{1, 1, 1, 1},
//				{1, 1, 1, 1},
//				{1, 1, 1, 1},
//				{1, 1, 1, 1}
//		};
//		
//		int[][] matrix7 = {
//				{0, 0, 0, 0},
//				{0, 0, 0, 0},
//				{0, 0, 0, 0},
//				{0, 0, 0, 0},
//		};
//		
//		checkRow(matrix6);
//		checkColumn(matrix6);
//		checkRow(matrix7);
//		checkColumn(matrix7);

	}

	public static void initializeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				matrix[i][j] = (int) (Math.random() * 2);
	}

	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static void checkRow(int[][] matrix) {
		int countZero = 0, countOne = 0;
		boolean statusZero = false, statusOne = false;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == 0)
					++countZero;
				else
					++countOne;
			}
			if (countZero == 4) {
				System.out.println("All 0s on row " + i);
				statusZero = true;
			}
			countZero = 0;
			if (countOne == 4) {
				System.out.println("All 1s on row " + i);
				statusOne = true;
			}
			countOne = 0;
		}

		if (!statusZero && !statusOne)
			System.out.println("No same numbers on a row");
	}

	public static void checkColumn(int[][] matrix) {
		int countZero = 0, countOne = 0;
		boolean statusZero = false, statusOne = false;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[j][i] == 0)
					++countZero;
				else
					++countOne;
			}
			if (countZero == 4) {
				System.out.println("All 0s on column " + i);
				statusZero = true;
			}
			countZero = 0;
			if (countOne == 4) {
				System.out.println("All 1s on column " + i);
				statusOne = true;
			}
			countOne = 0;
		}

		if (!statusZero && !statusOne)
			System.out.println("No same numbers on a column");
	}

	// degistirilebilir!
	public static void checkMajorDiagonal(int[][] matrix) {
		int countZero = 0, countOne = 0;
		boolean statusZero = false, statusOne = false;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (i == j) {
					if (matrix[i][j] == 0)
						++countZero;
					else
						++countOne;
				}
			}
		}
		if (countZero == 4) {
			System.out.println("All 0s on the major diagonal ");
			statusZero = true;
		}
		if (countOne == 4) {
			System.out.println("All 1s on the major diagonal");
			statusOne = true;
		}

		if (!statusZero && !statusOne)
			System.out.println("No same numbers on the major diagonal");
	}

	public static void checkSubDiagonal(int[][] matrix) {
		int countZero = 0, countOne = 0;
		boolean statusZero = false, statusOne = false;
		int a = matrix.length - 1;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (j - i == a) {
					a -= 2;
					if (matrix[i][j] == 0)
						++countZero;
					else
						++countOne;
				}
			}
		}
		if (countZero == 4) {
			System.out.println("All 0s on the sub-diagonal ");
			statusZero = true;
		}
		if (countOne == 4) {
			System.out.println("All 1s on the sub-diagonal");
			statusOne = true;
		}

		if (!statusZero && !statusOne)
			System.out.println("No same numbers on the sub-diagonal");
	}

}