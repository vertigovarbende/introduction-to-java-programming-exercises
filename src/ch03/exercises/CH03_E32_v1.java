package ch03.exercises;

import java.util.Scanner;

public class CH03_E32_v1 {

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
		display(xValues, yValues);
	}

	public static void display(double[] xValues, double[] yValues) {
		double x0 = xValues[0];
		double y0 = yValues[0];
		double x1 = xValues[1];
		double y1 = yValues[1];
		double x2 = xValues[2];
		double y2 = yValues[2];
		double cal = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (cal > 0)
			System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
		else if (cal == 0)
			System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1
					+ ", " + y1 + ")");
		else
			System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0
					+ ") to (" + x1 + ", " + y1 + ")");
	}
}