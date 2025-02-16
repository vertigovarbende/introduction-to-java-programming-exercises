package ch04.exercises.CH04_E02_v1;

public class Point {

	private double en;
	private double boy;
	
	public Point() {
		
	}
	
	public Point(double en, double boy) {
		setBoy(boy);
		setEn(en);
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
	
}
