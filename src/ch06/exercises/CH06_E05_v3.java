package ch06.exercises;

import java.util.Scanner;

public class CH06_E05_v3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		double[] numbers = new double[scan.nextInt()];
		
		enterTheNumbers(scan, numbers);
	}
	
	public static void displaySortedNumbers(double[] numbers) {
		int counter = 1;
		for (int i = 0; i < numbers.length; ++i) { // her bir sayı için kontrol
			for (int j = 0; j < numbers.length; ++j) { // secilen sayinin diger sayilarla kontrolu
				if (numbers[i] < numbers[j]) {
					System.out.println(numbers[i]);
					++counter;
					break;
				}
			}
		}
	}

	public static void enterTheNumbers(Scanner scan, double[] numbers) {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.print("[" + (i + 1) + "]: ");
			numbers[i] = scan.nextDouble();
		}
		System.out.println();
	}

}
