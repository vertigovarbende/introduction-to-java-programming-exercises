package ch04.exercises;

import java.util.Scanner;

public class CH04_E21_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String SSN = scan.next();
		
		if (SSN.charAt(3) == '-' && SSN.charAt(6) == '-')
			System.out.println(SSN + " is a valid social security number ");
		else
			System.out.println(SSN + " is an invalid social security number ");
		

	}

}
