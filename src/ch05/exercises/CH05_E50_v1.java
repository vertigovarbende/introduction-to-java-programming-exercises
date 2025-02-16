package ch05.exercises;

import java.util.Scanner;

public class CH05_E50_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String text = scan.nextLine();
		char[] charArray = text.toCharArray();
		
		int numberOfUpper = 0;
		
		for (int i = 0; i < charArray.length; ++i) {
			if ((int) (charArray[i]) >= 65 && (int)(charArray[i]) <= 90)
				++numberOfUpper;
		}
		
		System.out.println("The number of uppercase letters is " + numberOfUpper);

	}

}
