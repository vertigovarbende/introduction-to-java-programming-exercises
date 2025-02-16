package ch06.exercises;

public class CH06_E11_v1 {

	public static void main(String[] args) {
		
		displayTable();

	}
	
	public static void displayTable() {
		System.out.println("Sales Amount \t Commission");
		printHypen(27);
		for (int i = 10_000; i <= 100_000; i += (5 * Math.pow(10, 3)))
			System.out.format("%d \t\t %.1f\n", i, computeCommission(i));
	}
	
	public static double computeCommission(double salesAmount) {
		if (salesAmount <= 5000.0)
			return salesAmount * 0.08;
		else if (salesAmount <= 10000.0)
			return salesAmount * 0.1;
		else 
			return salesAmount * 0.12;
	}
	
	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}
}
