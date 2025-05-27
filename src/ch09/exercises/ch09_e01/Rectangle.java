package ch09.exercises.ch09_e01;

public class Rectangle {

	// The public instance variables
	public double width;
	public double height;

	// Constructors

	// +Rectangle() - no-arg constructor
	public Rectangle() {
		width = 1;
		height = 1;
	}

	// +Rectangle(width: double, height: double) - smart constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// getArea(): double
	// getArea() returns the area of this rectangle
	public double getArea() {
		return height * width;
	}

	// getPerimeter(): double
	// getPerimeter() returns the perimeter of this rectangle
	public double getPerimeter() {
		return (2 * height) + (2 * width);
	}
}