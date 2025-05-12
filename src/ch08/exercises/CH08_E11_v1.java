package ch08.exercises;

import java.util.Scanner;

public class CH08_E11_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 511: ");
		int number = INPUT.nextInt();
		int[][] binaryMatrix = initializeBinaryMatrix(findBinary(number));
//		System.out.println("binary");
//		displayMatrix(binaryMatrix);
//		System.out.println("header-tail");
		displayHeaderTail(binaryMatrix);
	}

	public static void displayHeaderTail(int[][] binaryMatrix) {
		for (int i = 0; i < binaryMatrix.length; ++i) {
			for (int j = 0; j < binaryMatrix[i].length; ++j)
				if (binaryMatrix[i][j] == 1)
					System.out.print("T ");
				else if (binaryMatrix[i][j] == 0)
					System.out.print("H ");
			System.out.println();
		}
	}

	public static int[] findBinary(int number) {
		int a = 0;
		int count = 0;
		int[] division = new int[100];
		while (true) {
			a = number % 2;
			division[count] = a;
			++count;
			number = number / 2;
			if (number == 1 || number == 0) {
				division[count] = number;
				break;
			}
		}
		return division;
	}

	public static int[][] initializeBinaryMatrix(int[] division) {
		int index = 8;
		int[][] binaryMatrix = new int[3][3];
		for (int i = 0; i < binaryMatrix.length; ++i)
			for (int j = 0; j < binaryMatrix[i].length; ++j) {
				binaryMatrix[i][j] = division[index];
				--index;
			}
		return binaryMatrix;
	}

	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
}