package ch03.exercises;

import java.util.Scanner;

public class CH03_E12_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		String sayi = scan.nextLine();

		palindrome(sayi);

	}

	public static void palindrome(String sayi) {
		String sonuc = "";

		for (int i = sayi.length() - 1; i >= 0; i--)
			sonuc += sayi.charAt(i);

		if (sonuc.equals(sayi))
			System.out.println(sayi + " is a palindrome");
		else
			System.out.println(sayi + " is not a palindrome");
	}

}
