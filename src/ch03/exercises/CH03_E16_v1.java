package ch03.exercises;

import java.util.*;

public class CH03_E16_v1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int x = rand.nextInt(-100, 101); // height 200
		int y = rand.nextInt(-50, 51); // weight 100

		System.out.print("(" + x + "," + y + ")");

		

	}

}
