package ch05.exercises;

import java.util.Scanner;

public class CH05_E01_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int pozSayac = 0, negSayac = 0;
		double total = 0;
		
		do {
			System.out.print("Enter an integer, the input ends if it is 0: ");
			input = scan.nextInt();
			if (input > 0)
				++pozSayac;
			else if (input < 0)
				++negSayac;
			total += input;
			if (pozSayac == 0 && negSayac == 0)
				System.out.println("No numbers are entered except 0 ");
		}while(input != 0);
		
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + (total / (pozSayac + negSayac)));

		

	}

}
