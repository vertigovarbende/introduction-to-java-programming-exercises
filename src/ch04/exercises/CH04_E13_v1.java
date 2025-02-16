package ch04.exercises;

import java.util.Scanner;

public class CH04_E13_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char harf = scan.next().charAt(0);
		displayResult(harf);

	}

	public static int findVowel(char harf) {
		// A E I O U
		int result = -1;
		if (harf >= 65 && harf <= 90 || harf >= 97 && harf <= 122) {
			switch (harf) {
			case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
				result = 1;
				break;
			default:
				result = 0;
				break;
			}
		}
		else 
			return result;
		return result;
	}

	public static void displayResult(char harf) {
		int result = findVowel(harf);
		if (result == 1)
			System.out.println(harf + " is a vowel");
		else if (result == 0)
			System.out.println(harf + " is a consonant");
		else
			System.out.println(harf + " is an invalid input");
	}

}
