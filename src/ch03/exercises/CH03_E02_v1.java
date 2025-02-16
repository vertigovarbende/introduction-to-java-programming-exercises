package ch03.exercises;

import java.util.Random;

public class CH03_E02_v1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(1, 12);
		System.out.println("randomNumber = " + randomNumber);
		String[] months ={"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik"};
		System.out.println(months[randomNumber - 1]);
	}

}
