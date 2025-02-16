package ch05.exercises;

import java.util.Scanner;

public class CH05_E41_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0, count = 0;

		do {
			System.out.print("Enter number: ");
			int number = scan.nextInt();
			if (number == 0)
				break;
			
			max = number;
			if (max < number) {
				max = number;
				count = 1;
			} else
				++count;


		} while (true);

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}

}
