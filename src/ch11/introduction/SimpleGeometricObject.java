package ch11.introduction;

public class SimpleGeometricObject {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}

	public SimpleGeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

}
