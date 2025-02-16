package ch05.exercises;

import java.util.*;

public class CH05_E02_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int trueAnswer = 0, falseAnswer = 0, sum = 0;

		for (int i = 0; i < 10; ++i) {
			int sayi1 = rand.nextInt(1, 16);
			int sayi2 = rand.nextInt(1, 16);
			System.out.print(sayi1 + " + " + sayi2 + " = ");
			int cevap = scan.nextInt();
			sum += cevap;
			if (cevap == sayi1 + sayi2)
				++trueAnswer;
			else
				++falseAnswer;
		}
		
		System.out.println("The number of the true answer: " + trueAnswer);
		System.out.println("The number of the false answer: " + falseAnswer);
		System.out.println("The sum of all additions: " + sum);
	}

}
