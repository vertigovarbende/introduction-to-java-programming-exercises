package ch09.exercises.ch09_e12;

public class Point {

	// The private instance variable
	private int x;
	private int y;

	// Constructors

	// No-arg/Default constructor
	// +Point()
	public Point() {
		x = 0;
		y = 0;
	}

	// Smart constructor
	// +Point(x: int, y: int)
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'x'
	public int getX() {
		return x;
	}

	// Setter method for private instance variable 'x'
	public void setX(int x) {
		this.x = x;
	}

	// Getter method for private instance variable 'y'
	public int getY() {
		return y;
	}

	// Setter method for private instance variable 'y'
	public void setY(int y) {
		this.y = y;
	}

	// +getXY(): int[]
	public int[] getXY() {
		return new int[] { x, y };
	}

	// +setXY(x: int, y: int): void
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
		// or
//		this.x = x;
//		this.y = y;
	}

	// toString(): String
	@Override
	public String toString() {
		return ".(" + x + "," + y + ")";
	}
}