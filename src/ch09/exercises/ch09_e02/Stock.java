package ch09.exercises.ch09_e02;

public class Stock {

	// The private instance variables
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	// Constructor

	// +Stock(symbol: String, name: String)
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	// Getter and Setter methods

	// Getter method for private instance 'previousClosingPrice'
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	// Setter method for private instance 'previousClosingPrice'
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	// Getter method for private instance 'currentPrice'
	public double getCurrentPrice() {
		return currentPrice;
	}

	// Setter method for private instance 'currentPrice'
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	// +getChangePercent(): double
	public double getChangePercent() {
		double percent = ((100 * currentPrice) - (100 * previousClosingPrice)) / previousClosingPrice;
		return percent;
	}
}
