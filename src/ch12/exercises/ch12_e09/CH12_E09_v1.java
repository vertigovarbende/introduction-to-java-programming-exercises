package ch12.exercises.ch12_e09;

import java.util.Scanner;

public class CH12_E09_v1 {

	public static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter a binary number: ");
		String binary = INPUT.nextLine();

		try {
			int decimalValue = bin2Dec(binary);
			System.out.println("The decimal value for binary number " + binary + " is " + decimalValue);
		} catch (BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static int bin2Dec(String binaryString) throws BinaryFormatException, NumberFormatException {

		if (binaryString == null || binaryString.isEmpty()) {
			throw new NumberFormatException("Input cannot be empty");
		}

		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			char ch = binaryString.charAt(i);

			if (ch != '0' && ch != '1') {
				throw new BinaryFormatException("The string is not a binary string");
			}

			decimalValue = decimalValue * 2 + (ch - '0');
		}

		return decimalValue;
	}
}