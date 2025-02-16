package ch03.exercises;

import java.util.*;

public class CH03_E18_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the weight: ");
		int weight = scan.nextInt();
		
		if(calculateCost(weight) == 0.0)
			System.out.println("Bu paket Kargonalanamaz");
		else
			System.out.println("The price of packet: " + calculateCost(weight));
		

	}

	public static double calculateCost(int weight) {
		double cost = 0;
		if (weight <= 1)
			cost = 3.5;
		else if (weight <= 3)
			cost = 5.5;
		else if (weight <= 10)
			cost = 8.5;
		else if (weight <= 20)
			cost = 10.5;
		else
			return 0.0;
		return cost;
	}

}
