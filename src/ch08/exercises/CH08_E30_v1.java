package ch08.exercises;

import java.util.Scanner;

public class CH08_E30_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int SIZE = 2;

	public static void main(String[] args) {
		double[][] a = new double[SIZE][SIZE];
		double[] b = new double[SIZE];
		initializeA(a);
		initializeB(b);
		displayEquation(a, b);
		double[] result = linearEquation(a, b);
		if (result == null)
			System.out.println("The equation has no solution");
		else {
			System.out.println("x = " + result[0]);
			System.out.println("y = " + result[1]);
		}
	}

	public static void displayEquation(double[][] a, double[] b) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				if (j == 0)
					System.out.print(a[i][j] + "x + ");
				else
					System.out.print(a[i][j] + "y = ");
			}
			System.out.println(b[i]);
		}
	}

	public static void initializeB(double[] b) {
		for (int i = 0; i < b.length; ++i) {
			System.out.print("b[" + i + "]: ");
			b[i] = INPUT.nextDouble();
		}
	}

	public static void initializeA(double[][] a) {
		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print("a[" + i + "][" + j + "]: ");
				a[i][j] = INPUT.nextDouble();
			}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double[] result = new double[2];
		double x = 0.0, y = 0.0;
		if (cal(a) == 0) {
			return null;
		} else {
			result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (cal(a));
			result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (cal(a));
		}
		return result;
	}

	public static double cal(double[][] a) {
		return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
	}

//	public static double cal(double[][] a) {
//		double resultMajor = 1.0, resultSub = 1.0;
//		double count = a.length - 1;
//		for (int i = 0; i < a.length; ++i) {
//			for (int j = 0; j < a[i].length; ++j) {
//				if (i == j)
//					resultMajor *= a[i][j];
//				if ((j - i) == count) {
//					count -= 2;
//					resultSub *= a[i][j];
//				}
//			}
//		}
//		return resultMajor - resultSub;
//	}
}
