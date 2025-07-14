package ch09.exercises.ch09_e09;

import static java.lang.Math.*;

public class RegularPolygon {

	// The private instance variables
	private int n; // number of the side in the polygon
	private double side; // the length of the sides
	private double x; // x-coordinate of the polygon
	private double y; // y-coordinate of the polygon

	// Constructors

	// No-arg/Default constructor
	// +RegularPolygon()
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0.0;
		y = 0.0;
	}

	// Smart constructor
	// +RegularPolygon(n: int, side: double)
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = 0.0;
		y = 0.0;
	}

	// Smart constructor
	// +RegularPolygon(n: int, side: double, x: double, y: double)
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'n'
	public int getN() {
		return n;
	}

	// Setter method for private instance variable 'n'
	public void setN(int n) {
		this.n = n;
	}

	// Getter method for private instance variable 'side'
	public double getSide() {
		return side;
	}

	// Setter method for private instance variable 'side'
	public void setSide(double side) {
		this.side = side;
	}

	// Getter method for private instance variable 'x'
	public double getX() {
		return x;
	}

	// Setter method for private instance variable 'x'
	public void setX(double x) {
		this.x = x;
	}

	// Getter method for private instance variable 'y'
	public double getY() {
		return y;
	}

	// Setter method for private instance variable 'y'
	public void setY(double y) {
		this.y = y;
	}

	// +getPerimeter(): double
	// this method calculates and returns the perimeter of the 'this' polygon
	public double getPerimeter() {
		return n * side;
	}

	// +getArea(): double
	// this method calculates and returns the area of the 'this' polygon
	public double getArea() {
		double area = (n * pow(side, 2)) / (4 * tan(PI / n));
		return area;
	}
}