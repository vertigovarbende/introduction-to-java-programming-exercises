package ch05.exercises;

import static java.lang.Math.*;

public class CH05_E35_v1 {

	public static void main(String[] args) {
		double calculation = 0.0;
		for (int i = 1; i < 625; ++i)
			calculation += 1 / (sqrt(i) + sqrt(2));
		System.out.println(calculation);
	}

}
