package ch07.exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class CH07_E04_v1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		initializeArrayList(arrayList);
		displayArrayList(arrayList);
		displayResult(arrayList);
	}

	public static void initializeArrayList(ArrayList<Integer> arrayList) {
		int number = 0;
		do {
			System.out.print("Enter a score between 0 and 100: ");
			number = scan.nextInt();
			if (number > 100)
				System.out.println("Please enter a integer between 0 and 100");
			else if (number < 0)
				break;
			else {
				if (number == 0)
					continue;
				else
					arrayList.add(number);
			}
		} while (true);
	}

	public static void displayResult(ArrayList<Integer> arrayList) {
		double sum = 0.0;
		int above = 0, below = 0;
		for (int i = 0; i < arrayList.size(); ++i)
			sum += arrayList.get(i);
		double avg = sum / arrayList.size();
		for (int i = 0; i < arrayList.size(); ++i) {
			if (arrayList.get(i) >= avg)
				++above;
			else
				++below;
		}
		System.out.println("average: " + avg);
		System.out.println("above and equal: " + above);
		System.out.println("below: " + below);
	}
	
	public static void displayArrayList(ArrayList<Integer> arrayList) {
		for (int value : arrayList)
			System.out.print(value + " ");
		System.out.println();
	}
}