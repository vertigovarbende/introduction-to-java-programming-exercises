package ch07.exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class CH07_E03_v1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		initializeArrayList(arrayList);
		displayArrayList(arrayList);
		displayResult(arrayList);
	}

	public static void displayResult(ArrayList<Integer> array) {
		array.sort(null);
		for (int i = 0; i < array.size(); ++i) {
			if (countNumber(array, array.get(i)) > 1)
				System.out.println(array.get(i) + " occurs " + countNumber(array, array.get(i)) + " times ");
			else
				System.out.println(array.get(i) + " occurs " + countNumber(array, array.get(i)) + " time ");
		}
	}

	public static void displayArrayList(ArrayList<Integer> array) {
		for (int i = 0; i < array.size(); ++i)
			System.out.print(array.get(i) + " ");
		System.out.println();
	}

	public static void initializeArrayList(ArrayList<Integer> array) {
		do {
			System.out.print("Enter the integers between 1 and 100: ");
			int number = scan.nextInt();
			if (number < 0 || number > 100)
				System.out.println("Please enter a integer between 1 and 100");
			else if (number == 0)
				break;
			else
				array.add(number);
		} while (true);
	}

	public static int countNumber(ArrayList<Integer> numbers, int number) {
		int count = 0;
		for (int i = 0; i < numbers.size(); ++i)
			if (numbers.get(i) == number)
				++count;
		return count;
	}
}