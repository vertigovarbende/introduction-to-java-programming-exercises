package ch02.exercises;

import java.util.*;

public class CH02_E05_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(0, 1000);
		int digitsOfRandomNumber = addTheDigitsOfTheRandomNumber(randomNumber);
		System.out.println("randomNumber is " + randomNumber + " and sum of digits of randomNumber " + digitsOfRandomNumber);
	}
	
	public static int addTheDigitsOfTheRandomNumber(int randomNumber) {
		return (randomNumber % 10) + ((randomNumber % 100) / 10) + (randomNumber / 100);
	}

}
