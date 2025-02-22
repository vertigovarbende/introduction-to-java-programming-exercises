package ch06.exercises;

import java.util.Random;
import java.util.Scanner;

public class CH06_E17_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = scan.nextInt();
		System.out.println();
		printMatrix(n);
		
	}
	
	public static void printMatrix(int n) {
		Random rand = new Random();
		int element = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				element = rand.nextInt(2);
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
