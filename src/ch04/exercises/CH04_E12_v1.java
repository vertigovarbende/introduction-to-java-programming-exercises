package ch04.exercises;

import java.util.Scanner;

public class CH04_E12_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");
		char n = scan.next().charAt(0);
		System.out.println("The binary value is " + decimalToBinary(n));

	}
	
	public static String decimalToBinary(char n) {
		int deger = hexToDecimal(n);
		String returnDeger = "";
		while(true) {
			returnDeger += deger % 2 + "";
			deger /= 2;
			if (deger / 2 == 0) {
				returnDeger += "0"; 
				break;
			}
			else if (deger / 2 == 1) {
				returnDeger += "1";
				break;
			}
		}
		return returnDeger;
	}

	public static int hexToDecimal(char n) {
		int deger = 0;
		switch (n) {
		case 'A':
			deger = 10;
			break;
		case 'B':
			deger = 11;
			break;
		case 'C':
			deger = 12;
			break;
		case 'D':
			deger = 13;
			break;
		case 'E':
			deger = 14;
			break;
		case 'F':
			deger = 15;
			break;
		default:
			deger = (int) (n);
			break;
		}
		return deger;
	}

}
