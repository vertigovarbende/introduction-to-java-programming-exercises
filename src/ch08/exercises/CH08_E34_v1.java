package ch08.exercises;

import java.util.Scanner;

public class CH08_E34_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int ROW = 6;
	static final int COLUMN = 2;

	public static void main(String[] args) {
		double[][] points = new double[ROW][COLUMN];
		initializePoints(points);
		displayPoints(points);
		double[] rightmostLowestPoint = getRightmostLowestPoint(points);
		System.out.println(
				"The rightmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		double[] rightmostLowestPoint = points[0];
		for (int i = 0; i < points.length; ++i) {
			if (rightmostLowestPoint[1] > points[i][1])
				rightmostLowestPoint = points[i];
			else if (rightmostLowestPoint[1] == points[i][1]) {
				if (rightmostLowestPoint[0] < points[i][0])
					rightmostLowestPoint = points[i];
			}
		}
		return rightmostLowestPoint;
	}

	public static void initializePoints(double[][] points) {
		System.out.println("Enter 6 points");
		for (int i = 0; i < points.length; ++i)
			for (int j = 0; j < points[i].length; ++j) {
				if (j == 0)
					System.out.print("x" + (i + 1) + ": ");
				else
					System.out.print("y" + (i + 1) + ": ");
				points[i][j] = INPUT.nextDouble();
			}
	}

	public static void displayPoints(double[][] points) {
		System.out.println("points");
		System.out.println("------");
		for (int i = 0; i < points.length; ++i)
			System.out.println(".(" + points[i][0] + ", " + points[i][1] + ")");
	}
}