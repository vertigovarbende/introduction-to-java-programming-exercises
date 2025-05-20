package ch08.exercises;

import java.util.Scanner;
import static java.util.Arrays.*;

public class CH08_E26_v1 {

	static final int SIZE = 3;
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] m = new double[SIZE][SIZE];
		initializeMatrix(m);
		System.out.println("The row-sorted array is - before");
		displayMatrix(m);
		System.out.println("The row-sorted array is - after");
		double[][] sortedMatrix = sortRows(m);
		displayMatrix(sortedMatrix);
	}

	public static double[][] sortRows(double[][] m) {
//		double[][] sortedMatrix = new double[SIZE][SIZE];
		for (int i = 0; i < m.length; ++i) {
			parallelSort(m[i]); // or sort(m[i])
//			sortedMatrix[i] = m[i];
		}
		return m;
	}

	public static void initializeMatrix(double[][] m) {
		System.out.println("Enter a 3-by-3 matrix row by row");
		for (int i = 0; i < m.length; ++i)
			for (int j = 0; j < m[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				m[i][j] = INPUT.nextDouble();
			}
	}

	public static void displayMatrix(double[][] m) {
		for (int i = 0; i < m.length; ++i) {
			for (int j = 0; j < m[i].length; ++j)
				System.out.printf("%.3f ", m[i][j]);
			System.out.println();
		}
	}
}
