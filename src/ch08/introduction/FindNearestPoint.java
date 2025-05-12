package ch08.introduction;

import java.util.Scanner;

public class FindNearestPoint {

	/*
	 * This section presents a geometric problem for finding the closest pair of
	 * points
	 */

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of points: ");
		int numberOfPoints = INPUT.nextInt();

		double[][] points = new double[numberOfPoints][2];
		initializePoints(points);
		findNearest(points);

	}

	public static void initializePoints(double[][] points) {
		System.out.println("Enter " + points.length + " points ");
		for (int i = 0; i < points.length; ++i) {
			for (int j = 0; j < points[i].length; ++j) {
				System.out.print("point[" + i + "][" + j + "]: ");
				points[i][j] = INPUT.nextDouble();
			}
			System.out.println();
		}
	}

	public static void findNearest(double[][] points) {
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		for (int i = 0; i < points.length; ++i) {
			for (int j = i + 1; j < points.length; ++j) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		System.out.println("The closest two points are " + "(" + points[p1][0] + "," + points[p1][1] + ") and ("
				+ points[p2][0] + "," + points[p2][1] + ")");
	}

	public static double distance(double x1, double y1, double x2, double y2) {
//		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}