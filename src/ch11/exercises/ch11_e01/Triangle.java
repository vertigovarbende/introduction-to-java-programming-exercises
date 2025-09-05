package ch11.exercises.ch11_e01;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject {

	// The private instance variables
	private double side1;
	private double side2;
	private double side3;

	// Constructors

	// No-arg/Default constructor
	// +Triangle()
	public Triangle() {
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	// Smart constructor
	// +Triangle(side1: double, side2: double, side3: double)
	public Triangle(double side1, double side2, double side3) {
		super();
		if (side1 < 0 || side2 < 0 || side3 < 0)
			throw new RuntimeException("sides cannot be negative!");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Smart constructor
	// +Triangle(color: String, filled: boolean, side1: double, side2: double,
	// side3: double)
	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Getter methods

	// Getter method for private instance variable 'side1'
	public double getSide1() {
		return side1;
	}

	// Getter method for private instance variable 'side2'
	public double getSide2() {
		return side2;
	}

	// Getter method for private instance variable 'side3'
	public double getSide3() {
		return side3;
	}

	// +getArea(): double
	// this method calculates and returns the area of the triangle
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double check = s * (s - side1) * (s - side2) * (s - side3);
		if (check < 0)
			return -1; // return '-1' if the three points are on the same line
		else
			return sqrt(check);
	}

	// +getPerimeter(): double
	// this method calculates and returns the perimeter o the triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// toString()
	public String toString() {
		return super.toString() + "\n" + "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
