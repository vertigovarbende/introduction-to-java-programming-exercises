package ch08.exercises;

import java.util.Scanner;

public class CH08_E06_v1 {

	static final Scanner INPUT = new Scanner(System.in);

	static final int ROW = 3;
	static final int COLUMN = 3;

	public static void main(String[] args) {
		double[][] a = new double[ROW][COLUMN];
		double[][] b = new double[ROW][COLUMN];

		System.out.println("Enter matrix1");
		initializeMatrix(a);
		System.out.println("Enter matrix2");
		initializeMatrix(b);
		double[][] c = multiplyMatrix(a, b);
		System.out.println("The multiplication of the matrices is");
		displayCalculation(a, b, c);
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[ROW][COLUMN];
		double result = 0.0;
		for (int i = 0; i < ROW; ++i) {
			for (int j = 0; j < COLUMN; ++j) {
				for (int k = 0; k < COLUMN; ++k) {
					result += a[i][k] * b[k][j];
				}
				c[i][j] = result;
				result = 0.0;
			}
		}
		return c;
	}

	public static void initializeMatrix(double[][] matrix) {
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

	public static void displayCalculation(double[][] a, double[][] b, double[][] c) {
		String subRow = "";
		for (int i = 0; i < ROW; ++i) {
			if (i == 1) {
				subRow += returnSubStr(a[i]);
				subRow += " *";
				subRow += returnSubStr(b[i]);
				subRow += " =";
				subRow += returnSubStr(c[i]);
			} else {
				subRow += returnSubStr(a[i]);
				subRow += "  ";
				subRow += returnSubStr(b[i]);
				subRow += "  ";
				subRow += returnSubStr(c[i]);
			}
			System.out.println(subRow);
			subRow = "";
		}
	}

	public static String returnSubStr(double[] array) {
		String subStr = "";
		for (int i = 0; i < ROW; ++i) {
			subStr += String.format(" %.1f", array[i]);
		}
		return subStr;
	}
}