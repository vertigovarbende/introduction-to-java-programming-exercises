package ch06.exercises;

import static java.lang.Math.*;

public class CH06_E14_v1 {

	public static void main(String[] args) {
		displayTable();
	}

	public static double calSeries(int n) {
		double sum = 0.0;
		for (int i = 0; i <= n; ++i) {
			sum += (pow(-1, i + 1) / ((2 * i) - 1));
		}
		return 4 * sum;
	}

	public static void displayTable() {
		System.out.println("i \t m(i)");
		printHypen(15);
		System.out.format("%d \t %.4f\n", 1, calSeries(1));
		for (int i = 101; i <= 901; i += 100)
			System.out.format("%d \t %.4f\n", i, calSeries(i));
	}

	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}
}
