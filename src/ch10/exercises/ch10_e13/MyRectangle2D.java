package ch10.exercises.ch10_e13;

public class MyRectangle2D {

	// The private instance variables
	private double x;
	private double y;
	private double width;
	private double height;

	// Constructors

	// No-arg/Default constructors
	// +MyRectangle2D()
	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	// Smart constructor
	// +MyRectangle2D(x: double, y: double, width: double, height: double)
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Getter and Setter methods

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

	// Getter method for private instance variable 'width'
	public double getWidth() {
		return width;
	}

	// Setter method for private instance variable 'width'
	public void setWidth(double width) {
		this.width = width;
	}

	// Getter method for private instance variable 'height'
	public double getHeight() {
		return height;
	}

	// Setter method for private instance variable 'height'
	public void setHeight(double height) {
		this.height = height;
	}

	// +getArea(): double
	// this method calculates and returns the area of the rectangle
	public double getArea() {
		return width * height;
	}

	// +getPerimeter(): double
	// this method calculates and returns the perimeter of the rectangle
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}

	// +contains(x: double, y: double): boolean
	// this method returns true if the specified point (x, y) is inside this
	// rectangle
	public boolean contains(double x, double y) {
		return (x >= this.x - width / 2 && x <= this.x + width / 2 && y >= this.y - height / 2
				&& y <= this.y + height / 2);
	}

	// +contains(r: MyRectangle2D): boolean
	// this method returns true if the specified rectangle is inside this rectangle
	public boolean contains(MyRectangle2D r) {
		double left = x - width / 2;
		double right = x + width / 2;
		double bottom = y - height / 2;
		double top = y + height / 2;

		double rLeft = r.x - r.width / 2;
		double rRight = r.x + r.width / 2;
		double rBottom = r.y - r.height / 2;
		double rTop = r.y + r.height / 2;

		return (rLeft >= left && rRight <= right && rBottom >= bottom && rTop <= top);
	}

	// +overlaps(r: MyRectangle2D): boolean
	// this method returns true if the specified rectangle overlaps with this
	// rectangle
	public boolean overlaps(MyRectangle2D r) {
		return !(r.x + r.width / 2 <= x - width / 2 || r.x - r.width / 2 >= x + width / 2
				|| r.y + r.height / 2 <= y - height / 2 || r.y - r.height / 2 >= y + height / 2);
	}

	// toString()
	@Override
	public String toString() {
		return "[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
	}

}
