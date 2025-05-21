package ch08.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH08_E32_v1 {

	static final Scanner INPUT = new Scanner(System.in);
	static final int ROW = 3;
	static final int COLUMN = 2;

	public static void main(String[] args) {
		double[][] points = new double[ROW][COLUMN];
		initializePoints(points);
		displayPoints(points);
		if (getTriangleArea(points) == 0)
			System.out.println("The three points are on the same line");
		else
			System.out.format("The are of the triangle is %.2f", getTriangleArea(points));
	}

	public static double getTriangleArea(double[][] points) {
		double[] sides = calculateSides(points);
		double s = (sides[0] + sides[1] + sides[2]) / 2;
		double check = s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]);
		if (check < 0)
			return 0;
		else
			return sqrt(check);

	}

	public static double[] calculateSides(double[][] points) {
		double[] sides = new double[ROW];
		sides[0] = sqrt(pow(points[1][0] - points[0][0], 2) + pow(points[1][1] - points[0][1], 2)); // (x1,y1) - (x2,y2)
		sides[1] = sqrt(pow(points[2][0] - points[0][0], 2) + pow(points[2][1] - points[0][1], 2)); // (x1,y1) - (x3,y3)
		sides[2] = sqrt(pow(points[2][0] - points[1][0], 2) + pow(points[2][1] - points[1][1], 2)); // (x2,y2) - (x3,y3)
		return sides;
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
