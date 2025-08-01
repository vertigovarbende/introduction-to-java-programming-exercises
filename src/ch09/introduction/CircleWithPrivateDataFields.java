package ch09.introduction;

public class CircleWithPrivateDataFields {

	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public CircleWithPrivateDataFields() {
		++numberOfObjects;
	}
	
	public CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		++numberOfObjects;
	}
	
	// Getter and Setter methods
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
}
