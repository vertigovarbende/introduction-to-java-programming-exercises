package ch06.exercises;

public class CH06_E13_v1 {

	public static void main(String[] args) {

		displayTable();
		
	}
	
	public static void displayTable() {
		System.out.println("i \t m(i)");
		printHypen(15);
		for (int i = 1; i <= 20; ++i)
			System.out.format("%d \t %.4f\n", i, calSeries(i));
	}

	public static double calSeries(int n) {
		double sum = 0.0;
		for (double i = 1.0; i <= n; ++i)
			sum += (i / (i + 1));
		return sum;
	}
	
	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}

}
