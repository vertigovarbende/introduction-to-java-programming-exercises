package ch07.exercises;

import java.util.Scanner;

public class CH07_E34_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter: ");
		String text = SCAN.next();
		System.out.println(sort(text));

	}

	public static String sort(String s) {
		char temp = ' ';
		char[] array = new char[s.length()];
		for (int i = 0; i < array.length; ++i)
			array[i] = s.charAt(i);
		for (int i = 0; i < array.length - 1; ++i) {
			for (int j = 0; j < array.length - (i + 1); ++j) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		String newS = "";
		for (int i = 0; i < array.length; ++i)
			newS += array[i];
		return newS;
	}
}