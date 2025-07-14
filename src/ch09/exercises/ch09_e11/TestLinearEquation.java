package ch09.exercises.ch09_e11;

import java.util.Scanner;

public class TestLinearEquation {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		// Get values from the user
		int[] values = new int[6];
		for (int i = 0; i < values.length; ++i) {
			System.out.print("Enter " + (char) (i + 97) + ": ");
			values[i] = INPUT.nextInt();
		}

		// Create the instance
		LinearEquation leObj = new LinearEquation(values[0], values[1], values[2], values[3], values[4], values[5]);

		// return the results
		if (!leObj.isSolvable())
			System.out.println("The equation has no solution");
		else
			System.out.println("x: " + leObj.getX() + ", y: " + leObj.getY());
	}
}
