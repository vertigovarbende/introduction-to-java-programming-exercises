package ch11.exercises.ch11_e12;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSumArrayList {

	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Double> myArrayList = new ArrayList<>();
		System.out.println("Enter 5 integer number");
		for (int i = 0; i < 5; ++i) 
			myArrayList.add(INPUT.nextDouble());
		double sum = sum(myArrayList);
		System.out.println("sum: " + sum);
	}
	
	public static double sum(ArrayList<Double> list) {
		double sum = 0.0;
		for (double value : list)
			sum += value;
		return sum;
	}
}
