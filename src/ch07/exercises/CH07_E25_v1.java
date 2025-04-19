package ch07.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH07_E25_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		double[] eqn = new double[3];
		double[] roots = new double[2];
		enterEqn(eqn);
		displayRoots(eqn, roots);

	}

	public static void displayRoots(double[] eqn, double[] roots) {
		if (solveQuadratic(eqn, roots) == 2)
			System.out.format("The equation has two roots: %.3f and %.3f\n", roots[0], roots[1]);
		else if (solveQuadratic(eqn, roots) == 1)
			System.out.format("The equation has two roots but both of them are equal: %f\n", roots[0]);
		else
			System.out.println("The equation has no real roots");
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		if (calculateDiscriminant(eqn) > 0) {
			roots[0] = ((-1 * eqn[1]) + sqrt(calculateDiscriminant(eqn))) / (2 * eqn[0]);
			roots[1] = ((-1 * eqn[1]) - sqrt(calculateDiscriminant(eqn))) / (2 * eqn[0]);
			return 2;
		} else if (calculateDiscriminant(eqn) == 0) {
			roots[0] = roots[1] = ((-eqn[1]) + Math.sqrt(calculateDiscriminant(eqn))) / (2 * eqn[0]);
			return 1;
		}
		return 0;
	}

	public static double calculateDiscriminant(double[] eqn) {
		return pow(eqn[1], 2) + (-1 * 4 * eqn[0] * eqn[2]);
	}

	public static void enterEqn(double[] eqn) {
		for (int i = 0; i < eqn.length; ++i) {
			if (i == 0)
				System.out.print("Enter value a: ");
			else if (i == 1)
				System.out.print("Enter value b: ");
			else
				System.out.print("Enter value c: ");
			eqn[i] = SCAN.nextDouble();
		}
	}
}