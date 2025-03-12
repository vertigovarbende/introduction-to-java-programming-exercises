package ch07.exercises;

import static java.lang.Math.*;
import java.util.Scanner;

public class CH07_E11_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final int SIZE = 10;

	public static void main(String[] args) {

		double[] numbers = new double[SIZE];
		initializeArray(numbers);
		displayArray(numbers);
		System.out.println(String.format("The mean is: %.2f", calMean(numbers)));
		System.out.format("The standard deviation is: %.5f", calDeviation(numbers));
	}

	public static double calMean(double[] numbers) {
		double addition = 0.0;
		for (int i = 0; i < numbers.length; ++i)
			addition += numbers[i];
		return addition / numbers.length;
	}

	public static double calDeviation(double[] numbers) {
		double powAddition = 0.0;
		double powMean = calMean(numbers) * (calMean(numbers) * numbers.length);
		double result = 0.0;

		for (int i = 0; i < numbers.length; ++i)
			powAddition += pow(numbers[i], 2);

		return sqrt((powAddition - powMean) / (numbers.length - 1));

	}

	public static void initializeArray(double[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.print("array[" + i + "]: ");
			array[i] = SCAN.nextDouble();
		}
	}

	public static void displayArray(double[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}