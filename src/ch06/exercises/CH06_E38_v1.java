package ch06.exercises;

import static java.lang.Math.*;

public class CH06_E38_v1 {

	public static void main(String[] args) {

		System.out.println("Random Upper Letters");
		printHypen("Random Upper Letters".length());
		displayUpperLetters();
		System.out.println();
		System.out.println("Random Digit Characters");
		printHypen("Random Digit Characters".length());
		displayDigitCharacters();
		System.out.println("Chinese?");
		printHypen("Chinese?".length());
		displayAllRandom();
	}

	public static void displayAllRandom() {
		for (int i = 1; i <= 100; ++i) {
			System.out.print(getRandomCharacter());
			if (i % 10 == 0)
				System.out.println();
		}
	}

	public static void displayDigitCharacters() {
		for (int i = 1; i <= 100; ++i) {
			System.out.print(getRandomDigitCharacter() + " ");
			if (i % 10 == 0)
				System.out.println();
		}
	}

	public static void displayUpperLetters() {
		for (int i = 1; i <= 100; ++i) {
			System.out.print(getRandomUpperCaseLetter() + " ");
			if (i % 10 == 0)
				System.out.println();
		}
	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}
}