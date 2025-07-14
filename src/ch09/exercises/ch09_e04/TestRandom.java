package ch09.exercises.ch09_e04;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random randObj = new Random(1000);
		
		for (int i = 0; i < 50; ++i)
			System.out.println(randObj.nextInt(100));
	}
}