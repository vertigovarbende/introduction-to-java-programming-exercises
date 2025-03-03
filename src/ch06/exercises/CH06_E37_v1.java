package ch06.exercises;

import java.util.Scanner;

public class CH06_E37_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		System.out.print("Enter a width: ");
		int width = scan.nextInt();
		System.out.println("format: " + format(number, width));
	}

	public static String format(int number, int width) {
		String strNumber = number + "";
		int length = strNumber.length();
		if (length > width)
			return strNumber;
		else {
			strNumber = "";
			for (int i = 0; i < width - length; ++i)
				strNumber += "0";
			return strNumber + number;
		}
	}
}