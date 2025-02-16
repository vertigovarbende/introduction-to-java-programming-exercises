package ch06.exercises;

import java.util.Scanner;

public class CH06_E05_v2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] numbers = new double[3];
		enterTheNumbers(numbers, scan);
		displaySortedNumbers(numbers);

	}
	
	public static void displaySortedNumbers(double ...numbers) {
		double max, min;

		max = numbers[0];
		for (int i = 0; i < numbers.length; ++i) {
			if (max <= numbers[i])
				max = numbers[i];
		}
		
		min = numbers[0];
		for (int i = 0; i < numbers.length; ++i)
			if (min >= numbers[i])
				min = numbers[i];
		
		double middle = 0.0;
		for(int i = 0; i < numbers.length; ++i) {
			if (numbers[i] == max || numbers[i] == min)
				continue;
			else
				middle = numbers[i];
		}
		System.out.println(min + " " + middle + " " + max);
	}

	public static void enterTheNumbers(double[] numbers, Scanner scan) {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print("[" + (i + 1) + "]: ");
			numbers[i] = scan.nextDouble();
		}
		System.out.println();
	}

}
