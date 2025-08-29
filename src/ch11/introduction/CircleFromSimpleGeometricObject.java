package ch11.introduction;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

	private double radius;

	public CircleFromSimpleGeometricObject() {

	}

	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}

	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
//		setColor(color);
//		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}

}
