package ch06.exercises;

import java.util.Scanner;

public class CH06_E21_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		System.out.println(displayString(scan.next()));

	}

	public static int getNumber(char uppercaseLetter) {
		int letterInt = 0;
		if (uppercaseLetter >= 65 && uppercaseLetter <= 90) {
			if (uppercaseLetter <= 67)
				letterInt = 2;
			else if (uppercaseLetter <= 70)
				letterInt = 3;
			else if (uppercaseLetter <= 73)
				letterInt = 4;
			else if (uppercaseLetter <= 76)
				letterInt = 5;
			else if (uppercaseLetter <= 79)
				letterInt = 6;
			else if (uppercaseLetter <= 83)
				letterInt = 7;
			else if (uppercaseLetter <= 86)
				letterInt = 8;
			else if (uppercaseLetter <= 90)
				letterInt = 9;
		}

		if (letterInt < 2)
			return 0;
		else
			return letterInt;
	}

	public static String displayString(String letter) {
		int number = 0;
		String after = " ";
		String newLetter = "";
		if (letter.contains("-")) {
			after = letter.substring(6);
			newLetter += letter.substring(0, 6);
		} else {
			after = letter.substring(4);
			newLetter += letter.substring(0, 4);
		}
		after = after.toUpperCase();

		for (int i = 0; i < after.length(); ++i) {
			number = getNumber(after.charAt(i));
			newLetter += number;
		}
		return newLetter;
	}

}
