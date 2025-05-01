package ch07.exercises;

import java.util.Scanner;
import java.util.Random;

public class CH07_E35_v1 {

	/*
	 * problem-1	// done!
	 * 
	 * When a capital letter is entered, even though the letter is in the word, the
	 * programme I wrote cannot find the word! solve this!
	 */

	/*
	 * problem-2
	 * 
	 * word like 'precedence', doesn't work very well because the programme I wrote
	 * just searches 2 times.
	 * 
	 */

	static final Scanner SCAN = new Scanner(System.in);
	static final Random RAND = new Random();

	public static void main(String[] args) {
		startGame();
	}

	public static boolean startGame() {
		String[] words = { "write", "that", "program", "sunday", "book", "school", "car", "apple", "orange", "yellow" };
		String randomWord = randomWord(words);
		char[] starArray = starArray(randomWord.length());
		char[] randomWordArray = randomWordArray(randomWord);
		char letter = ' ';
		int wrongCount = 0;

		while (true) {
			System.out.print("(Guess) Enter a letter in word ");
			display(starArray);
			System.out.print(" > ");
			letter = SCAN.next().toLowerCase().charAt(0);
			if (isEntered(letter, starArray))
				System.out.print("\t" + letter + " is already in the word\n");
			else {
				if (leftSearch(letter, randomWordArray) >= 0) {
					int index = leftSearch(letter, randomWordArray);
					starArray[index] = letter;
				}
				if (rightSearch(letter, randomWordArray) >= 0) {
					int index = rightSearch(letter, randomWordArray);
					starArray[index] = letter;
				}
				if (leftSearch(letter, randomWordArray) < 0 && rightSearch(letter, randomWordArray) < 0) {
					System.out.print("\t" + letter + " is not in the word\n");
					++wrongCount;
				}
			}

			String text = convertText(starArray);
			if (text.equals(randomWord)) {
				System.out.println("The word is " + randomWord + ". You missed " + wrongCount + " time");
				break;
			}
		}

		System.out.print("Do you want to guess another word? Enter y or n > ");
		String again = SCAN.next().toUpperCase();
		if (again.equals("N"))
			return false;
		else
			return startGame();
	}

	public static String randomWord(String[] words) {
		int randomNumber = RAND.nextInt(words.length);
		return words[randomNumber];
	}

	public static char[] starArray(int length) {
		char[] starArray = new char[length];
		for (int i = 0; i < starArray.length; ++i)
			starArray[i] = '*';
		return starArray;
	}

	public static char[] randomWordArray(String randomWord) {
		char[] randomWordArray = new char[randomWord.length()];
		for (int i = 0; i < randomWordArray.length; ++i)
			randomWordArray[i] = randomWord.charAt(i);
		return randomWordArray;
	}

	public static void display(char[] starArray) {
		for (int i = 0; i < starArray.length; ++i)
			System.out.print(starArray[i]);
	}

	public static boolean isEntered(char letter, char[] starArray) {
		for (int i = 0; i < starArray.length; ++i)
			if (starArray[i] == letter)
				return true;
		return false;
	}

	public static int leftSearch(char letter, char[] wordArray) {
		for (int i = 0; i < wordArray.length; ++i)
			if (letter == wordArray[i])
				return i;
		return -1;
	}

	public static int rightSearch(char letter, char[] wordArray) {
		for (int i = wordArray.length - 1; i > 0; --i)
			if (letter == wordArray[i])
				return i;
		return -1;
	}

	public static String convertText(char[] starArray) {
		String text = "";
		for (int i = 0; i < starArray.length; ++i)
			text += starArray[i];
		return text;
	}
}