package ch04.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class CH04_E24_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] allCities = enterTheCities(scan);
		System.out.print("The three cities in alphabetical order are ");
		displayCities(allCities);
		

	}
	
	public static void displayCities(String[] allCities) {
		Arrays.sort(allCities);
		for (String value: allCities)
			System.out.print(value + " ");
	}
	
	public static String[] enterTheCities(Scanner scan) {
		String[] allCities = new String[3];
		String text = "";
		for (int i = 0; i < allCities.length; ++i) {
			switch (i) {
			case 0:
				text = "first city";
				break;
			case 1:
				text = "second city";
				break;
			case 2:
				text = "third city";
				break;
			}
			System.out.print("Enter the " + text + ": ");
			allCities[i] = scan.next();
		}
		return allCities;
	}

}
