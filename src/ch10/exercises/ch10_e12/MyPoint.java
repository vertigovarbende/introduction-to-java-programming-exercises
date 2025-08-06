package ch10.exercises.ch10_e12;

import static java.lang.Math.*;

public class MyPoint {

	// The private instance variables
	private double x;
	private double y;

	// Constructor

	// No-arg/Default constructor
	// +MyPoint()
	public MyPoint() {
		x = 0.0;
		y = 0.0;
	}

	// Smart constructor
	// +MyPoint(x: double, y: double)
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
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

	// +distance(anotherPoint: MyPoint): double
	// this method calculates the distance to given another point instance
	public double distance(MyPoint anotherPoint) {
		return sqrt(pow(anotherPoint.getX() - x, 2) + pow(anotherPoint.getY() - y, 2));
	}

	// +distance(x: double, y: double): double
	// this method calculates the distance to a point given by its x and y
	// coordinates
	public double distance(double x, double y) {
		return sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
	}
	
}