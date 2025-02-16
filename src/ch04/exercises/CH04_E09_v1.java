package ch04.exercises;

import java.util.Scanner;

public class CH04_E09_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String c = scan.next();
		System.out.println("The Unicode for the character " + c + " is " + (int)(c.charAt(0)));

	}

}
