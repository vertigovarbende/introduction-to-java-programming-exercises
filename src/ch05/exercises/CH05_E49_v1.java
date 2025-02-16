package ch05.exercises;

import java.util.Scanner;

public class CH05_E49_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scan.nextLine();
		char[] charArray = text.toCharArray();

		int numberOfVowels = 0, numberOfSpace = 0;

		for (int i = 0; i < charArray.length; ++i) {
			switch (charArray[i]) {
			case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
				++numberOfVowels;
				break;
			case ' ':
				++numberOfSpace;
				break;
			}
		}
		System.out.println();
		System.out.println("The number of vowels is " + numberOfVowels);
		System.out.println("The number of consonants is " + (charArray.length - numberOfVowels - numberOfSpace));

	}

}
