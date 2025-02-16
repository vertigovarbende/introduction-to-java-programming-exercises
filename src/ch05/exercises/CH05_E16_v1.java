package ch05.exercises;

import java.util.Scanner;

public class CH05_E16_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a integer number: ");
		int n = scan.nextInt();
		int i = 2;

		while (n / i != 0) {
			if (n % i == 0) {
				System.out.print(i + ", ");
				n /= i;
			}
			else
				++i;
		}

	}

}
