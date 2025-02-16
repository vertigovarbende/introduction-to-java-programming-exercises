package ch03.exercises.circleExercise;

public class Point {

	private double x;
	private double y;
	Circle circ = new Circle();

	public Point() {

	}

	public Point(double x, double y, int r) {
		setX(x);
		setY(y);
		circ.setR(r);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double calDistance() {
		return Math.sqrt(Math.pow(x - Circle.getX(), 2) + Math.pow(y - Circle.getY(), 2));
	}

	public boolean IsValid() {
		if (calDistance() <= circ.getR())
			return true;
		else
			return false;
	}
}
