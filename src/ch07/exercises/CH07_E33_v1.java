package ch07.exercises;

import java.util.Scanner;

public class CH07_E33_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		String[] animals = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };
		System.out.print("Enter a year: ");
		int year = SCAN.nextInt();
		System.out.println(animals[year % 12]);
	}
}