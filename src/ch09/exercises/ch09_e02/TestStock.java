package ch09.exercises.ch09_e02;

public class TestStock {

	public static void main(String[] args) {
		// Creating instance
		Stock myStock = new Stock("ORCL", "Oracle Corporation");
		
		// modify 'previousClosingPrice' and 'currentPrice'
		myStock.setPreviousClosingPrice(34.5);
		myStock.setCurrentPrice(33.35);
		
		// get 'previousClosingPrice' and 'currentPrice'
		System.out.println("previousClosingPrice: " + myStock.getPreviousClosingPrice());
		System.out.println("currentPrice: " + myStock.getCurrentPrice());
		
		// percent of change
		System.out.println("\nchangePercent: " + myStock.getChangePercent());
	}
}
