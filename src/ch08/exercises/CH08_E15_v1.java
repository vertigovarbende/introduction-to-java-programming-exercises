package ch08.exercises;

import java.util.Scanner;

public class CH08_E15_v1 {

	static final int ROW = 5;
	static final int COLUMN = 2;
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		double[][] points = new double[ROW][COLUMN];

		initializePoints(points);

		if (sameLine(points))
			System.out.println("The five points are on the same line");
		else
			System.out.println("The five points are not on the same line");
	}

	public static boolean sameLine(double[][] points) {
		boolean result = true;
		double m = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
		double k = points[0][1] - (points[0][0] * m);
		if (((m * points[1][0]) + k) == points[1][1]) {
			for (int i = 2; i < points.length; ++i) {
				if (m * points[i][0] + k == points[i][1])
					continue;
				else
					return false;
			}
		} else
			return false;
		return result;
	}

	public static void initializePoints(double[][] points) {
		System.out.println("Enter five points");
		for (int i = 0; i < points.length; ++i)
			for (int j = 0; j < points[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				points[i][j] = INPUT.nextDouble();
			}
	}

	public static boolean onTheSameLine(double[][] points) {
//		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
		return false;
	}

}
