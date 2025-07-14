package ch09.exercises.ch09_e12;

import static java.lang.Math.*;
import ch09.exercises.ch09_e11.LinearEquation;

public class Line {

	// The private instance variables
	private Point start;
	private Point end;
	private LinearEquation linearEquation;

	// Constructors

	// Smart constructor
	// +Line(x1: int, y1: int, x2: int, y2: int)
	public Line(int x1, int y1, int x2, int y2) {
		start = new Point(x1, y1);
		end = new Point(x2, y2);
	}

	// Smart constructor
	// +Line(start: Point, end: Point)
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'start'
	public Point getStart() {
		return start;
	}

	// Setter method for private instance variable 'start'
	public void setStart(Point start) {
		this.start = start;
	}

	// Getter method for private instance variable 'end'
	public Point getEnd() {
		return end;
	}

	// Setter method for private instance variable 'end'
	public void setEnd(Point end) {
		this.end = end;
	}

	// +setStartXY(x: int, y: int): void
	public void setStartXY(int x, int y) {
		start.setXY(x, y);
		// or
//		start.setX(x);
//		start.setY(y);
	}

	// +getStartXY(): int[]
	public int[] getStartXY() {
		return start.getXY();
	}

	// +setEndXY(x: int, y: int): void
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
		// or
//		end.setX(x);
//		end.setY(y);
	}

	// +getEndXY(): int[]
	public int[] getEndXY() {
		return end.getXY();
	}

	// +getLength(): double
	// this method calculates and returns the length of the line
	public double getLength() {
		return sqrt(pow(end.getX() - start.getX(), 2) + pow(end.getY() - start.getY(), 2));
	}

	// +getIntersectPoint(otherLine: Line): Point
	// this method calculates and returns the intersection point
	public Point getIntersectPoint(Line otherLine) {
		int a = start.getY() - end.getY();
		int b = start.getX() - end.getX();
		int c = otherLine.getStart().getY() - otherLine.getEnd().getY();
		int d = otherLine.getStart().getX() - otherLine.getEnd().getX();

		int e = (a * start.getX()) - (b * start.getY());
		int f = (c * otherLine.getStart().getX()) - (d * otherLine.getStart().getY());

		linearEquation = new LinearEquation(a, b, c, d, e, f);

		if (!linearEquation.isSolvable()) {
			System.out.println("The two lines are parallel");
			System.exit(0);
		}
		return new Point((int) (linearEquation.getX()), (int) (linearEquation.getX()));
	}
}
