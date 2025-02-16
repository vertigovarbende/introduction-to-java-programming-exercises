package ch05.exercises;

import java.util.*;

public class CH05_E40_v1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 1_000_000; ++i) {
			int sayi = rand.nextInt(0, 2);
			String yaziTura = (sayi == 0) ? "Yazi" : "Tura";
			System.out.println(i + 1 + " -> " + yaziTura);
		}

	}

}
