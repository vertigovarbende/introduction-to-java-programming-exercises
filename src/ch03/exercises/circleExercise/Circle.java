package ch03.exercises.circleExercise;

public class Circle {

	private static double x = 0;
	private static double y = 0;
	private double r;
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		setR(r);
	}
	
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}

	public static double getX() {
		return Circle.x;
	}
	
	public static double getY() {
		return Circle.y;
	}
	
}
