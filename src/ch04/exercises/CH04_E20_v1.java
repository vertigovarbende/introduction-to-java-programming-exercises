package ch04.exercises;

import java.util.Scanner;

public class CH04_E20_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String text = scan.next();
		
		System.out.println("The length of the text is: " + text.length());
		System.out.println("The first character of the text is: " + text.charAt(0));

	}

}
