package ch07.exercises;

import java.util.Scanner;
import java.util.Random;

public class CH07_E21_v1 {

	static final Scanner SCAN = new Scanner(System.in);
	static final Random RAND = new Random();

	public static void main(String[] args) {
		System.out.print("Enter the number of balls to drop: ");
		int ballNumber = SCAN.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int slotNumber = SCAN.nextInt();
		String[] slots = new String[slotNumber];
		System.out.println();
		start(slots, ballNumber);
	}

	public static void displayPaths(String[] paths) {
		for (int i = 0; i < paths.length; ++i)
			System.out.println(paths[i]);
		System.out.println();
	}

	public static void displaySlots(String[] slots) {
		for (int i = 0; i < slots.length; ++i) {
			if (slots[i] == null)
				System.out.println("slot-" + (i + 1) + ": empty");
			else
				System.out.println("slot-" + (i + 1) + ": " + slots[i]);
		}
	}

	public static void start(String[] slots, int ballNumber) {
		String[] allPaths = new String[ballNumber];
		for (int i = 0; i < allPaths.length; ++i) {
			allPaths[i] = randomPath(slots.length);
			if (slots[numberOfR(allPaths[i])] == null) {
				slots[numberOfR(allPaths[i])] = "0";
			} else
				slots[numberOfR(allPaths[i])] += "0";
		}
		displayPaths(allPaths);
		displaySlots(slots);
	}

	public static String randomPath(int slotNumber) {
		String path = "";
		String[] way = new String[] { "L", "R" };
		for (int i = 0; i < slotNumber; ++i) {
			int n = RAND.nextInt(0, 2);
			path += way[n];
		}
		return path;
	}

	public static int numberOfR(String path) {
		int numberOfRight = 0;
		for (int i = 0; i < path.length(); ++i)
			if (path.charAt(i) == 'R')
				++numberOfRight;
		return numberOfRight;
	}
}