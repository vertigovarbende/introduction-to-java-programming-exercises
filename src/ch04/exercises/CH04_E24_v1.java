package ch04.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class CH04_E24_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String firstCity = scan.nextLine();
		
		System.out.print("Enter the second city: ");
		String secondCity = scan.nextLine();
		
		System.out.print("Enter the third city: ");
		String thirdCity = scan.nextLine();
		
		String[] allCities = {firstCity, secondCity, thirdCity};
		
		Arrays.sort(allCities);
		
		System.out.print("The three cities in alphabetical order are ");
		for(String value: allCities)
			System.out.print(value + " ");
	}

}
