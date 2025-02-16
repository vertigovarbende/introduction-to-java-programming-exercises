package ch03.exercises.rectangleExercise;

public class Rectangle {

	private static int x = 0;
	private static int y = 0;
	private double en;
	private double boy;

	public Rectangle() {

	}

	public Rectangle(double en, double boy) {
		setEn(en);
		setBoy(boy);
	}

	public double getEn() {
		return en;
	}

	public void setEn(double en) {
		this.en = en;
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}

	public static double getX() {
		return Rectangle.x;
	}

	public static double getY() {
		return Rectangle.y;
	}

}
