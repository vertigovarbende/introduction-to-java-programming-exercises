package ch10.exercises.ch10_e12;

import static java.lang.Math.*;

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
		double a = p1.distance(p2);
		double b = p2.distance(p3);
		double c = p3.distance(p1);
		double s = (a + b + c) / 2;
		return sqrt(s * (s - a) - (s - b) * (s - c));
	}
	
	// +getPerimeter()
	// this method returns the perimeter of the triangle
	public double getPerimeter() {
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}
	
	// +contains(p: MyPoint): boolean
	// this method returns true iff the specified point 'p' is inside this triangle
	public boolean contains(MyPoint p) {
        double areaOrig = getArea();
        double area1 = triangleArea(p, p2, p3);
        double area2 = triangleArea(p1, p, p3);
        double area3 = triangleArea(p1, p2, p);

        double sum = area1 + area2 + area3;
        return Math.abs(areaOrig - sum) < 1e-9;
	}
	
	// +contains(t: Triangle2D): boolean
	// this method returns true if the specified triangle is inside this triangle
    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }
    
    // +overlaps(t: Triangle2D): boolean
    // this method returns true if the specified triangle overlaps with this triangle
    public boolean overlaps(Triangle2D t) {
        if (contains(t) || t.contains(this)) return false;

        return linesIntersect(p1, p2, t.p1, t.p2) ||
               linesIntersect(p1, p2, t.p2, t.p3) ||
               linesIntersect(p1, p2, t.p3, t.p1) ||

               linesIntersect(p2, p3, t.p1, t.p2) ||
               linesIntersect(p2, p3, t.p2, t.p3) ||
               linesIntersect(p2, p3, t.p3, t.p1) ||

               linesIntersect(p3, p1, t.p1, t.p2) ||
               linesIntersect(p3, p1, t.p2, t.p3) ||
               linesIntersect(p3, p1, t.p3, t.p1);
    }
	
    private double triangleArea(MyPoint a, MyPoint b, MyPoint c) {
        return Math.abs((a.getX() * (b.getY() - c.getY()) +
                         b.getX() * (c.getY() - a.getY()) +
                         c.getX() * (a.getY() - b.getY())) / 2.0);
    }

    private boolean linesIntersect(MyPoint a, MyPoint b, MyPoint c, MyPoint d) {
        return ccw(a, c, d) != ccw(b, c, d) && ccw(a, b, c) != ccw(a, b, d);
    }

    private boolean ccw(MyPoint a, MyPoint b, MyPoint c) {
        return (c.getY() - a.getY()) * (b.getX() - a.getX()) >
               (b.getY() - a.getY()) * (c.getX() - a.getX());
    }
	
}
