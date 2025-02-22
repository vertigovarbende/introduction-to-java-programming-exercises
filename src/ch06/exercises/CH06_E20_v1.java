package ch06.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CH06_E20_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letters = scan.next();
		System.out.println("The number of the letters is: " + countLetters(letters));
	}

	public static int countLetters(String s) {
		ArrayList<Character> letters = new ArrayList();
		for (int i = 0; i < s.length(); ++i) {
			if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
				letters.add(s.charAt(i));
		}
		return letters.size();
	}
}
