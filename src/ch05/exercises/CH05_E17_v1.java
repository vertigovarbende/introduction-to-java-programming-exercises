package ch05.exercises;

import java.util.Scanner;

public class CH05_E17_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of lines between 1 and 15: ");
		int line = scan.nextInt();
		
		
		for (int i = 1; i <= line; ++i) {
			for (int j = 1; j <= line - i; ++j)
				System.out.print("  ");
			for (int k = i; k > 0; --k)
				System.out.print(k + " ");
			for (int l = 2; l <= i; ++l)
				System.out.print(l + " ");
			System.out.println();
		}
		
		
		
//		for (int j = i; j > 0; --j)
//			System.out.print(j + " ");
		
	}

}
