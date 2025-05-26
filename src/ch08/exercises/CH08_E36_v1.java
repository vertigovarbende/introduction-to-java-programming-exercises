package ch08.exercises;

import java.util.Scanner;

public class CH08_E36_v1 {
	
	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number n: ");
		int n = INPUT.nextInt();
		char[][] latinSquare = new char[n][n];
		initializeLatinSquare(latinSquare);
		checkLatinSquare(latinSquare);
	}

	public static void checkLatinSquare(char[][] latinSquare) {
		int formerDecimal = ' ';

		for (int i = 0; i < latinSquare.length; ++i) {
			for (int j = 0; j < latinSquare[i].length; ++j) {
				if (formerDecimal == (int) (latinSquare[i][j])) {
					System.out.println("The input array is not a Latin square");
					System.exit(0);
				} else
					formerDecimal = latinSquare[i][j];
			}
			formerDecimal = ' ';
		}

		for (int i = 0; i < latinSquare.length; ++i) {
			for (int j = 0; j < latinSquare[i].length; ++j) {
				if (formerDecimal == (int) (latinSquare[j][i])) {
					System.out.println("The input array is not a Latin square");
					System.exit(0);
				} else
					formerDecimal = latinSquare[j][i];
			}
			formerDecimal = ' ';
		}

		System.out.println("The input array is a Latin square");
	}

	public static void initializeLatinSquare(char[][] latinSquare) {
		int range = latinSquare.length;

		System.out.println("Enter " + range + " row of letters separated by spaces");
		for (int i = 0; i < latinSquare.length; ++i) {
			for (int j = 0; j < latinSquare[i].length; ++j) {
				System.out.print("[" + i + "][" + j + "]: ");
				char letter = INPUT.next().toUpperCase().charAt(0);
				if (letter >= 65 && letter < (65 + range))
					latinSquare[i][j] = letter;
				else {
					System.out.println(
							"Wrong input: the letters must be from " + (char) (65) + " to " + (char) (65 + range - 1));
					System.exit(0);
				}
			}
		}
	}
}