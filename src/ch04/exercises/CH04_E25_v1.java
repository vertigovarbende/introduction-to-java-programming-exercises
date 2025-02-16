package ch04.exercises;

import java.util.Random;

public class CH04_E25_v1 {

	public static void main(String[] args) {
		Random rand = new Random();
		String plaka = "";

		for (int i = 0; i < 7; ++i) {
			if (i < 2)
				plaka += rand.nextInt(0, 10);
			else if (i == 5 || i == 6)
				plaka += rand.nextInt(0, 10);
			else 
				plaka += (char)(rand.nextInt(65, 91));
		}
		
		System.out.println("Plaka: " + plaka);
	}
	
}
