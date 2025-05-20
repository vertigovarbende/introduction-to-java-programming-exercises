package ch08.exercises;

import java.util.Scanner;

public class CH08_E27_v2 {

	static final int SIZE = 3;
	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[][] m = new double[SIZE][SIZE];
		initializeMatrix(m);
		System.out.println("The column-sorted array is - before");
		displayMatrix(m);
		System.out.println("The column-sorted array is - after");
		double[][] sortedMatrix = sortColumns(m);
		displayMatrix(sortedMatrix);
	}
	
	public static double[][] sortColumns(double[][] m) {
		for (int k = 0; k < m.length; ++k) {
			for (int i = 0; i < m.length - 1; ++i) {
				double currentMin = m[i][k];
				int currentMinIndex = i;

				for (int j = i + 1; j < m.length; ++j) {
					if (currentMin > m[j][k]) {
						currentMin = m[j][k];
						currentMinIndex = j;
					}
				}
				if (currentMinIndex != i) {
					m[currentMinIndex][k] = m[i][k];
					m[i][k] = currentMin;
				}
			}
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
