package ch08.exercises;

import java.util.Scanner;

public class CH08_E05_v1 {

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
		double[][] c = addMatrix(a, b);
		System.out.println("The matrices are added as follows");
		displayCalculation(a, b, c);
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[ROW][COLUMN];
		for (int i = 0; i < ROW; ++i)
			for (int j = 0; j < COLUMN; ++j)
				c[i][j] = a[i][j] + b[i][j];
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
				subRow += " +";
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
			subStr += " " + array[i];
		}
		return subStr;
	}
}