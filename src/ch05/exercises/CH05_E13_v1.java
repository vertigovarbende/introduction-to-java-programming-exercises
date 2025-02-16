package ch05.exercises;

import static java.lang.Math.*;

public class CH05_E13_v1 {

	public static void main(String[] args) {
		int i = 0;
		while (pow(i, 3) < 12000)
			i++;
		System.out.println(i - 1);

	}

}
