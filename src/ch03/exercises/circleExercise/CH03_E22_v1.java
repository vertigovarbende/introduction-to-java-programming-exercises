package ch03.exercises.circleExercise;

import java.util.Scanner;

public class CH03_E22_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a circle'r: ");
		int r = scan.nextInt();

		System.out.print("Enter a point's x: ");
		int x = scan.nextInt();

		System.out.print("Enter a point's y: ");
		int y = scan.nextInt();

		Point pointObj = new Point(x, y, r);
		displayPoint(pointObj);

	}

	public static void displayPoint(Point pointObj) {
		if (pointObj.IsValid())
			System.out.format("Point (%.1f,%.1f) is in the circle\n", pointObj.getX(), pointObj.getY());
		else
			System.out.format("Point (%.1f,%.1f) is not in the circle\n", pointObj.getX(), pointObj.getY());
	}

}
