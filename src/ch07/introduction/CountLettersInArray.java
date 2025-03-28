package ch07.introduction;

import java.util.Random;

public class CountLettersInArray {

	static final Random RAND = new Random();

	public static void main(String[] args) {

		char[] letters = createArray();
		System.out.println("The lowercase letters are:");
		displayArray(letters);
		System.out.println("\nThe occurrences of each letter are:");
		int[] counts = countLetters(letters);
		displayCount(counts);

		// example 7.16
		// answer: false

		// example 7.17
		System.out.println("\n");
		int[] list = { 1, 2, 3, 4, 5 };

		System.out.println("output");
		reverse(list);
		displayArray(list); // it doesn't change

		System.out.println("solution - 1");
		list = new int[] { 1, 2, 3, 4, 5 };
		displayArray(list);
		list = reverseSol1(list);
		displayArray(list); // correct - 1

		System.out.println("solution - 2");
		list = new int[] { 1, 2, 3, 4, 5 };
		displayArray(list);
		reverseSol2(list);
		displayArray(list);

	}

	public static char[] createArray() {
		char[] chars = new char[100];
		// 97 to 122
		for (int i = 0; i < chars.length; ++i)
			chars[i] = (char) RAND.nextInt(97, 123);
		return chars;
	}

	public static void displayArray(char[] chars) {
		for (int i = 0; i < chars.length; ++i) {
			if ((i + 1) % 20 == 0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}

	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; ++i)
			counts[chars[i] - 'a']++;
		return counts;
	}

	public static void displayCount(int[] counts) {
		for (int i = 0; i < counts.length; ++i) {
			if ((i + 1) % 10 == 0)
				System.out.println((char) (i + 'a') + ": " + counts[i]);
			else
				System.out.print((char) (i + 'a') + ": " + counts[i] + " ");
		}
	}

	// example 7.17
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; ++i)
			newList[i] = list[list.length - 1 - i];
		list = newList;
	}

	// correct one-1 7.17
	public static int[] reverseSol1(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; ++i)
			newList[i] = list[list.length - 1 - i];
		return newList;
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// correct one-2 7.17
	public static void reverseSol2(int[] list) {
		int temp = 0;
		for (int i = 0, j = list.length - 1; i < list.length / 2; ++i, --j) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}
}