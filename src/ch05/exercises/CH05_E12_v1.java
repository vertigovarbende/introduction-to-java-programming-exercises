package ch05.exercises;

import static java.lang.Math.*;

public class CH05_E12_v1 {

	public static void main(String[] args) {
		int i = 0;
		while (pow(i, 2) < 12_000)
			--i;
		System.out.println(i);

	}

}
