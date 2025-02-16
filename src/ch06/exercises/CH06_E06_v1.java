package ch06.exercises;

import java.util.Scanner;

public class CH06_E06_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		displayPattern(n);
		
	}

	public static void displayPattern(int n) {
		System.out.println();
		for (int i = 1; i <= n; ++i) {
			for (int j = n - i; j > 0; --j)
				System.out.print(" ");
			for (int k = i; k > 0; --k)
				System.out.print(k);
			System.out.println();
		}
	}

}
