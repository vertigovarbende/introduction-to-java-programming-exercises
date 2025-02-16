package ch04.exercises;

import java.util.Scanner;

public class CH04_E15_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = scan.next().toUpperCase();
		
		displayNumber(letter);
	}

	
	public static void displayNumber(String letter) {
	
		int letterUpperInt = letter.charAt(0);
		int letterInt = 0;
		if (letterUpperInt >= 65 && letterUpperInt <= 90) {
			if (letterUpperInt <= 67)
				letterInt = 2;
			else if (letterUpperInt <= 70)
				letterInt = 3;
			else if (letterUpperInt <= 73)
				letterInt = 4;
			else if (letterUpperInt <= 76)
				letterInt = 5;
			else if (letterUpperInt <= 79)
				letterInt = 6;
			else if (letterUpperInt <= 83)
				letterInt = 7;
			else if (letterUpperInt <= 86)
				letterInt = 8;
			else if (letterUpperInt <= 90)
				letterInt = 9;
		}
		
		if (letterInt < 2)
			System.out.println(letter + " is an invalid input");
		else 
			System.out.println("The corresponding number is " + letterInt);
	}

}
