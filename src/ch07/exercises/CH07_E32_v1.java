package ch07.exercises;

import java.util.Scanner;

public class CH07_E32_v1 {
	// you didn't solve this! look at again!

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the length of the list: ");
		int n = SCAN.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < list.length; i++) {
			list[i] = SCAN.nextInt();
		}

	}
}
