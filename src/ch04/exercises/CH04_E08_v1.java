package ch04.exercises;

import java.util.Scanner;

public class CH04_E08_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter an ASCII code: ");
			int n = scan.nextInt();
			
			if (0 <= n && n <= 127) {
				System.out.println("The character for ASCII code " + n + " is " + (char)(n));
				break;
			}
			else
				System.out.println("Please enter an integer number between 0 and 127");
				
		} while (true);
	}

}
