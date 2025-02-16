package ch06.exercises;

import java.util.Scanner;

public class CH06_E05_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number one: "); 
		double numberOne = scan.nextDouble();
		
		System.out.print("Number two: ");
		double numberTwo = scan.nextDouble();
		
		System.out.print("Number three: ");
		double numberThree = scan.nextDouble();
		
		System.out.println();
		displaySortedNumbers(numberOne, numberTwo, numberThree);
	}
	
	public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree) {
		double[] numbers = {numberOne, numberTwo, numberThree};
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
	
}
