package ch02.exercises;

import java.util.Scanner;

public class CH02_E07_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = scan.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemp = scan.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemp = scan.nextDouble();

		double energy = findRequiredEnergy(kilograms, initialTemp, finalTemp);
		System.out.println("The energy needed is " + energy);
	}

	public static double findRequiredEnergy(double kilograms, double initialTemp, double finalTemp) {
		return (kilograms) * (finalTemp - initialTemp) * 4184;
	}

}
