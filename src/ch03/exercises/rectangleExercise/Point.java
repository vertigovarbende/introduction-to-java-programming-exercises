package ch03.exercises.rectangleExercise;

public class Point {

	private double x;
	private double y;
	Rectangle rec = new Rectangle();
	
	public Point() {
		
	}
	
	public Point(double x, double y, double boy, double en) {
		setX(x);
		setY(y);
		rec.setBoy(boy);
		rec.setEn(en);
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
	
	public boolean IsValid() {
		if (x <= rec.getBoy() / 2 && y <= rec.getEn() / 2)
			return true;
		else 
			return false;
	}
	
	
	
}
