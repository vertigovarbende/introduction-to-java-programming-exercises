package ch05.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH05_E19_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int line = scan.nextInt();
		
		for (int i = 1; i <= line; ++i) {
			for (int j = 1; j <= line - i; ++j)
				System.out.print("  ");
			for (int k = 0; k < i; ++k) 
				System.out.print((int) pow(2, k) + " ");
			for (int l = (i - 1); l > 0; --l) 
				System.out.print((int) pow(2, l - 1) + " ");
				
			System.out.println();
		}

	}

}
