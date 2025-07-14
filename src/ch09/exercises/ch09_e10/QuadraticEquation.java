package ch09.exercises.ch09_e10;

import static java.lang.Math.*;

public class QuadraticEquation {

	// The private instance variable
	private int a;
	private int b;
	private int c;

	// Constructors

	// Smart constructor
	// +QuadraticEquation(a: int, b: int, c: int)
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Getter methods

	// Getter method for private instance varible 'a'
	public int getA() {
		return a;
	}

	// Getter method for private instance variable 'b'
	public int getB() {
		return b;
	}

	// Getter method for private instance variable 'c'
	public int getC() {
		return c;
	}

	// +getDiscriminant(): double
	// This method calculates the discriminant of the equation
	public double getDiscriminant() {
		double discriminant = pow(b, 2) - 4 * a * c;
		return discriminant;
	}

	// +getRoot1(): double
	// this method calculates the first root of the equation
	public double getRoot1() {
		if (getDiscriminant() >= 0)
			return (-b + sqrt(getDiscriminant())) / (2 * a);
		return 0.0;

	}

	// +getRoot2(): double
	// this method calculate the second root of the equation
	public double getRoot2() {
		if (getDiscriminant() >= 0)
			return (-b - sqrt(getDiscriminant())) / (2 * a);
		return 0.0;
	}
}