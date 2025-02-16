package ch04.exercises;

import java.util.Scanner;

public class CH04_E11_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int n = scan.nextInt();

		if (0 <= n && n <= 15)
			System.out.println("The hex value is " + decimalToHex(n));
		else
			System.out.println(n + " is an invalid input");
	}

	public static String decimalToHex(int n) {
		String deger;
		switch (n) {
		case 10:
			deger = "A";
			break;
		case 11:
			deger = "B";
			break;
		case 12:
			deger = "C";
			break;
		case 13:
			deger = "D";
			break;
		case 14:
			deger = "E";
			break;
		case 15:
			deger = "F";
			break;
		default:
			deger = n + "";
			break;
		}
		return deger;
	}

}
