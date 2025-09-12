package ch11.exercises.ch11_e17;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPerfectSquare {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter an integer m: ");
		int m = INPUT.nextInt();

//		System.out.println(findFactors(m));
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(3);
//		list.add(3);
//		list.add(5);
//		System.out.println(findOdds(list));
		
		findPerfectSquare(m);

	}
	
	public static void findPerfectSquare(int m) {
		ArrayList<Integer> odds = findOdds(findFactors(m));
		int n = 1;
		for (int value : odds)
			n *= value;
		System.out.println("The smallest number n for m * n to be a perfect square " + n + "\nm * n is " + m * n);
	}
	
	public static ArrayList<Integer> findOdds(ArrayList<Integer> factors) {
		ArrayList<Integer> odds = new ArrayList<>();
		int i = 0;
		while(true) {
			int value = factors.get(i);
			if (!odds.contains(value))
				odds.add(value);
			else {
				Integer wValue = value;
				odds.remove(wValue);
			}
			++i;
			if (i == factors.size())
				break;
		}
		return odds;
	}

	public static ArrayList<Integer> findFactors(int m) {
		ArrayList<Integer> factors = new ArrayList<>();
		int i = 2;
		while (true) {
			if (isPrime(i)) {
				if (m % i == 0) {
					factors.add(i);
					m /= i;
				} else
					++i;
			} else
				++i;
			if (m == 1)
				break;
		}
		return factors;
	}

	public static boolean isPrime(int n) {
		if (n < 0)
			return false;
		if (n == 1)
			return false;
		else {
			for (int i = 2; i < n; ++i)
				if (n % i == 0)
					return false;
		}
		return true;
	}
}
