package ch11.exercises.ch11_e15;

import java.util.ArrayList;
import java.util.Scanner;

public class TestConvexPolygon {

	static final Scanner INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of the points: ");
		int numberOfPoints = INPUT.nextInt();
		ArrayList<Double> list = new ArrayList<>();
		initializeList(list, numberOfPoints);
		System.out.println("The total area is " + calculateArea(list));
	}

	public static void initializeList(ArrayList<Double> list, int numberOfPoints) {
		System.out.println("Enter the coordinates of the points: ");
		char letter = 'A';
		for (int i = 0; i < numberOfPoints * 2; ++i) {
			if (i % 2 == 0) 
				System.out.print(letter + "x: ");
			else {
				System.out.print(letter + "y: ");
				++letter;
			}
			list.add(INPUT.nextDouble());
		}
	}
	
	public static double calculateArea(ArrayList<Double> list) {
//		int sum1 = 0, sum2 = 0;
//		for (int i = 0; i < list.size() - 3; ++i) {
//			if (i <= 5) 
//				sum1 += list.get(i * 2) * list.get((i * 2) + 3);
//			else if (i > 5)
//				sum2 += list.get(i + 1) * list.get(i + 2);
//		}
//		sum2 += (list.get(list.size() - 2) * list.get(1)) - (list.getFirst() * list.getLast());
//		return 0.5 * (sum1 - sum2);
		
		int n = list.size() / 2;
		double sum = 0.0;
		
		for (int i = 0; i < n; ++i) {
			double x1 = list.get(i * 2);
			double y1 = list.get(i * 2 + 1);
			double x2 = list.get((2 * ((i + 1) % n)));
			double y2 = list.get((2 * ((i + 1) % n)) + 1);
			
			sum += (x1 * y2 - x2 * y1);
		}
		
		return Math.abs(sum) / 2.0;
	}
}
