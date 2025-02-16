package ch04.exercises;

import java.util.Scanner;

public class CH04_E22_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter String s1: ");
		String s1 = scan.next();
		
		System.out.print("Enter String s2: ");
		String s2 = scan.next();
		
		if (s1.contains(s2) == true)
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}

}
