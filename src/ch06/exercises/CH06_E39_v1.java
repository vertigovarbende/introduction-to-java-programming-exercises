package ch06.exercises;

import java.util.Scanner;

public class CH06_E39_v1 {

	public static void main(String[] args) {
		double[] xValues = new double[3];
		double[] yValues = new double[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; ++i) {
			System.out.print("Enter x" + i + " : ");
			xValues[i] = scan.nextDouble();
			System.out.print("Enter y" + i + " : ");
			yValues[i] = scan.nextDouble();
		}

		if (leftOfTheLine(xValues[0], yValues[0], xValues[1], yValues[1], xValues[2], yValues[2]))
			System.out.println("(" + xValues[2] + ", " + yValues[2] + ") is on the left side of the line from ("
					+ xValues[0] + ", " + yValues[0] + ") to (" + xValues[1] + ", " + yValues[1] + ")");
		else if (rightOfTheLine(xValues[0], yValues[0], xValues[1], yValues[1], xValues[2], yValues[2]))
			System.out.println("(" + xValues[2] + ", " + yValues[2] + ") is on the right side of the line from ("
					+ xValues[0] + ", " + yValues[0] + ") to (" + xValues[1] + ", " + yValues[1] + ")");
		else if (onTheLineSegment(xValues[0], yValues[0], xValues[1], yValues[1], xValues[2], yValues[2]))
			System.out.println("(" + xValues[2] + ", " + yValues[2] + ") is on the line segment from (" + xValues[0]
					+ ", " + yValues[0] + ") to (" + xValues[1] + ", " + yValues[1] + ")");
		else
			System.out.println("(" + xValues[2] + ", " + yValues[2] + ") is on the same line from (" + xValues[0] + ", "
					+ yValues[0] + ") to (" + xValues[1] + ", " + yValues[1] + ")");
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
	}

	public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0 && (x2 == (x0 + x1) / 2 && y2 == (y0 + y1) / 2);
	}
}