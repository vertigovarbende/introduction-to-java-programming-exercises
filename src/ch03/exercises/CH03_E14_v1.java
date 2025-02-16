package ch03.exercises;

import java.util.*;

public class CH03_E14_v1 {

	public static void main(String[] args) {

		do {
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();
			int yaziTuraRast = rand.nextInt(0, 2);

			System.out.print("0 or 1? : ");
			int tahmin = scan.nextInt();

			if (tahmin == yaziTuraRast) {
				System.out.println(tahmin + " - " + yaziTuraRast + " - Dogru");
				break;
			}
			else 
				System.out.println(tahmin + " - " + yaziTuraRast + " - Yanlis");
			System.out.println();
		} while (true);
	}

}
