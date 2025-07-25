package ch10.exercises.ch10_e11;

import static java.lang.Math.*;

public class Circle2D {

	// The private instance variables
	private double x;
	private double y;
	private double radius;

	// Constructors

	// No-arg/Default constructor
	// +Circle2D()
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	// Smart constructor
	// +Circle2D(x: double, y: double, radius: double)
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Getter methods

	// Getter method for private instance variable 'x'
	public double getX() {
		return x;
	}

	// Getter method for private instance variable 'y'
	public double getY() {
		return y;
	}

	// Getter method for private instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// +getArea(): double
	// this method calculates and returns the area of the circle
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// +getPerimeter(): double
	// this method calculates and returns the perimeter of the circle
	public double getPerimeter() {
		return 2 * PI * radius;
	}

	// +contains(x: double, y: double): boolean
	// this method returns true if the specified point (x, y) is inside this circle
	public boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		return distance <= radius;
	}

	// +contains(circle: Circle2D): boolean
	// this method returns true if the specified circle is inside this circle
	public boolean contains(Circle2D circle) {
		double distanceBetweenCenters = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
		return distanceBetweenCenters + circle.radius <= this.radius;
	}

	// +overlaps(circle: Circle2D): boolean
	// this method returns true if the specified circle overlaps with this circle
	public boolean overlaps(Circle2D circle) {
		double distanceBetweenCenters = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
		return distanceBetweenCenters < this.radius + circle.radius
				&& distanceBetweenCenters > Math.abs(this.radius - circle.radius);
	}
	
	// toString(): String
	@Override
	public String toString() {
		return "[x=" + x + ",y=" + y + ",radius=" + radius + "]";
	}
}
