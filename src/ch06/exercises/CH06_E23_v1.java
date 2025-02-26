package ch06.exercises;

import java.util.Scanner;

public class CH06_E23_v1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = scan.next();
		System.out.print("Enter a char: ");
		char chr = scan.next().charAt(0);
		System.out.println("count: " + count(str, chr));
	}
	
	public static int count(String str, char a) {
		int numberOfChar = 0;
		char upperChr = (char) (a - 32);
		String upperStr = str.toUpperCase();
		for (int i = 0; i < upperStr.length(); ++i) {
			if (upperStr.charAt(i) == upperChr)
				++numberOfChar;
		}
		return numberOfChar;
	}

}
