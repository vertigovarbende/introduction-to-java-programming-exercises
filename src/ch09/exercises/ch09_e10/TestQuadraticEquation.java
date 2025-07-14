package ch09.exercises.ch09_e10;

import java.util.Scanner;

public class TestQuadraticEquation {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		// Get the values from the user
		int a, b, c;
		System.out.print("Enter a: ");
		a = INPUT.nextInt();
		System.out.print("Enter b: ");
		b = INPUT.nextInt();
		System.out.print("Enter c: ");
		c = INPUT.nextInt();

		// Create the instance
		QuadraticEquation qeObj = new QuadraticEquation(a, b, c);

		// return the roots
		if (qeObj.getDiscriminant() > 0)
			System.out.println("Discriminant > 0 - root1=" + qeObj.getRoot1() + ",root2=" + qeObj.getRoot2());
		else if (qeObj.getDiscriminant() == 0)
			System.out.println("Discriminant = 0 - root1=root2=" + qeObj.getRoot1() + " " + qeObj.getRoot2());
		else
			System.out.println("Discriminant < 0 - The equation has no real roots!");
	}
}
