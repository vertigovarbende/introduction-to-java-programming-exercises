package ch05.exercises;

import java.util.Scanner;

public class CH05_E48_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scan.nextLine();
		char[] charArray = text.toCharArray();
		String textOdd = "";

		for (int i = 0; i < charArray.length; ++i) {
			if (i % 2 == 0)
				textOdd += charArray[i];
		}
		
		System.out.println(textOdd);

	}

}
