package ch06.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH06_E22_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		long n = scan.nextLong();
		System.out.println("root of " + n + "is: " + sqrt(n));
	}
	
	public static double sqrt(long n) {
		double nextGuess = 0.0;
		double lastGuess = 1.0;
		while(true) {
			nextGuess = ((lastGuess + n) / lastGuess) / 2;
			if (abs(nextGuess - lastGuess) == 0.0001)
				break;
			else 
				lastGuess = nextGuess;
		}
		return nextGuess;
	}
}
