package ch07.exercises;

import java.util.Random;
import java.util.Scanner;

public class CH07_E13_v1 {

	static final Random RAND = new Random();
	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getRandom(1, 2, 3, 4, 12, 43, 22, 12, 32, 40, 55, 11, 27, 33));
	}

	public static int getRandom(int... numbers) {
		int number = 0;
		while (true) {
			number = RAND.nextInt(1, 55);
			if (isSameNumber(number, numbers))
				return number;
			else {
				System.out.println("same!");
				continue;
			}
		}
	}

	public static boolean isSameNumber(int number, int... numbers) {
		for (int i = 0; i < numbers.length; ++i)
			if (number == numbers[i])
				return false;
		return true;
	}
}