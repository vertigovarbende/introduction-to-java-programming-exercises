package ch05.exercises;

import java.util.Scanner;

public class CH05_E47_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String ISBN = scan.next();
		char[] intISBN = ISBN.toCharArray();
		int checksum = calChecksum(intISBN);

		if (ISBN.length() < 12)
			System.out.println(ISBN + " is an invalid input");
		else
			System.out.println("The ISBN-13 number is: " + ISBN + checksum);

	}

	public static int calChecksum(char[] intISBN) {
		int addition = 0;
		for (int i = 0; i < intISBN.length; ++i) {
			if (i % 2 == 0)
				addition += (int) (intISBN[i]) - 48;
			else
				addition += 3 * ((int) (intISBN[i]) - 48);
		}

		if (10 - (addition % 10) == 10)
			return 0;
		else
			return 10 - (addition % 10);
	}

}
