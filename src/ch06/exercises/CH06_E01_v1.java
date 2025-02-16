package ch06.exercises;

public class CH06_E01_v1 {

	public static void main(String[] args) {

		// Test that uses getPentagonalNumber method to display
		// the first 100 pentagonal numbers with each 10 numbers on each line

		int counter = 0;
		for (int i = 1; i <= 100; ++i) {
			System.out.print(getPentagonalNumber(i) + " ");
			++counter;
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
		
	}

	// This method will return a pentagonal number
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}

}
