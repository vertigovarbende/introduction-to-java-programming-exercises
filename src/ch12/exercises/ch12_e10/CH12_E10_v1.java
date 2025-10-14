package ch12.exercises.ch12_e10;

import java.util.List;
import java.util.ArrayList;

public class CH12_E10_v1 {

	public static void main(String[] args) {
		
		// OutOfMemoryError
		
		List<int[]> memoryFuckedUp = new ArrayList<>();

		try {
			while (true) {
				memoryFuckedUp.add(new int[1_000_000]);
				System.out.println("Total objects: " + memoryFuckedUp.size());
			}
		} catch (OutOfMemoryError err) {
			System.out.println("You fucked up the heap memory! " + err.getMessage());
			System.out.println("Total arrays allocated before crash: " + memoryFuckedUp.size());
		}
	}
}
