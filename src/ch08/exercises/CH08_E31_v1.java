package ch08.exercises;

import java.util.Scanner;

public class CH08_E31_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int ROW = 4;
	static final int COLUMN = 2;

	public static void main(String[] args) {
		double[][] points = new double[ROW][COLUMN];
		initializePoints(points);
		displayPoints(points);
		double[] result = getIntersectingPoint(points);
		if (result == null)
			System.out.println("The two lines are parallel");
		else 
			System.out.println("The intersecting points is at (" + result[0] + ", " + result[1] + ")");
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] result = new double[2];
		double a = points[0][1] - points[1][1]; // (y1 - y2)
		double b = points[0][0] - points[1][0]; // (x1 - x2)
		double c = points[2][1] - points[3][1]; // (y3 - y4)
		double d = points[2][0] - points[3][0]; // (x3 - x4)
		double e = (a * points[0][0]) - (b * points[0][1]);
		double f = (c * points[2][0]) - (d * points[2][1]);
		if (cal(points) == 0)
			return null;
		else {
			result[0] = (((e * d) - (b * f)) / cal(points));
			result[1] = (((a * f) - (e * c)) / cal(points));
		}
		return result;
	}

	public static double cal(double[][] points) {
		return (((points[0][1] - points[1][1]) * (points[2][0] - points[3][0]))
				- ((points[0][0] - points[1][0]) * (points[2][1] - points[3][1])));
	}

	public static void initializePoints(double[][] points) {
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
