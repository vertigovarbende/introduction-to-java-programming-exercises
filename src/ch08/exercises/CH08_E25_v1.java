package ch08.exercises;

import java.util.Scanner;

public class CH08_E25_v1 {

	static final int SIZE = 3;
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] m = new double[SIZE][SIZE];
		initializeMatrix(m);
		displayMatrix(m);
		if (isMarkovMatrix(m))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m) {
		double count = 0.0;
		for (int i = 0; i < m.length; ++i) {
			count = 0.0;
			for (int j = 0; j < m[i].length; ++j) {
				if (m[j][i] < 0)
					return false;
				count += m[j][i];
			}
			if (count != 1)
				return false;
		}
		return true;
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
