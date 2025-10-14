package ch12.exercises.ch12_e06;

import java.util.Scanner;

public class CH12_E06_v1 {

	public static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter a hex number: ");
		String hex = INPUT.nextLine();

		try {
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		if (hex == null || hex.isEmpty())
			throw new NumberFormatException("Input cannot be empty!");

		int decimalValue = 0;
		for (int i = 0; i < hex.length(); ++i) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) throws NumberFormatException {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')// ch is '0', '1', ..., or '9'
			return ch - '0';
		else
			throw new NumberFormatException("The string is not a hex string");
	}
}