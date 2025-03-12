package ch05.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH05_E45_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter ten numbers");
		int[] numbers = new int[10];
		System.out.println();
		addNumbers(numbers, scan);
		System.out.println("The mean is " + calMean(numbers));
		System.out.println("The standard deviation is " + calDeviation(numbers));

	}

	public static void addNumbers(int[] numbers, Scanner scan) {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print("[" + (i + 1) + "]: ");
			numbers[i] = scan.nextInt();
		}
	}

	public static double calMean(int[] numbers) {
		int addition = 0;
		for (int i = 0; i < numbers.length; ++i)
			addition += numbers[i];
		return (double) (addition) / numbers.length;
	}

	public static double calDeviation(int[] numbers) {
		double powAddition = 0.0;
		double powMean = calMean(numbers) * (calMean(numbers) * numbers.length);
		double result = 0.0;

		for (int i = 0; i < numbers.length; ++i)
			powAddition += pow(numbers[i], 2);

		return sqrt((powAddition - powMean) / (numbers.length - 1));

	}
}