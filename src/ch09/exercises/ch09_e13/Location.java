package ch09.exercises.ch09_e13;

public class Location {

	// The private instance variables
	private int row;
	private int column;
	private double maxValue;

	// Constructor

	// No-arg/Default constructor
	// +Location()
	public Location() {
		row = 0;
		column = 0;
		maxValue = 0.0;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'row'
	public int getRow() {
		return row;
	}

	// Setter method for private instance variable 'row'
	public void setRow(int row) {
		this.row = row;
	}

	// Getter method for private instance variable 'column'
	public int getColumn() {
		return column;
	}

	// Setter method for private instance variable 'column'
	public void setColumn(int column) {
		this.column = column;
	}

	// Getter method for private instance variable 'maxValue'
	public double getMaxValue() {
		return maxValue;
	}

	// Setter method for private instance variable 'maxValue'
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	// toString()
	@Override
	public String toString() {
		return "(" + row + ", " + column + ")";
	}
}