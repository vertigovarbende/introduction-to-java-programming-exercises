package ch05.exercises;

import java.util.Scanner;

public class CH05_E38_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		int number = scan.nextInt();
		System.out.println(number + " -> " + Integer.toOctalString(number));

	}

}
