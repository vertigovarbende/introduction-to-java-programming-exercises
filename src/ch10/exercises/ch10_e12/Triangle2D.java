package ch10.exercises.ch10_e12;

public class Triangle2D {

	// The private instance variables
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	// Constructors
	
	// No-arg/default constructor
	// +Triangle2D()
	public Triangle2D() {
		this(0, 0, 1, 2, 2, 5);
	}
	
	// Smart constructor - 1
	// +Triangle2D(p1: MyPoint, p2: MyPoint, p3: MyPoint)
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	// Smart constructor - 2
	// +Triangle2D(x1: double, y1: double, x2: double, y2: double, x3: double, y3: double)
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);
	}

	// Getter and Setter methods
	
	// Getter method for private instance variable 'p1'
	public MyPoint getP1() {
		return p1;
	}

	// Setter method for private instance variable 'p1'
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	// Getter method for private instance variable 'p2'
	public MyPoint getP2() {
		return p2;
	}

	// Setter method for private instance variable 'p2'
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	// Getter method for private instance variable 'p3'
	public MyPoint getP3() {
		return p3;
	}

	// Setter method for private instance variable 'p3'
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	// +getArea()
	// this method returns the area of the triangle
	public double getArea() {
		return 0.0;
	}
	
	// +getPerimeter()
	// this method returns the perimeter of the triangle
	public double getPerimeter() {
		return 0.0;
	}
}
