package ch10.exercises.ch10_e17;

import static java.lang.Math.*;

import java.math.BigInteger;

public class TestSquareNumbers {

	public static void main(String[] args) {

		long longMax = Long.MAX_VALUE;
		System.out.println("Long.MAX_VALUE = " + longMax);

		BigInteger start = BigInteger.valueOf((long) Math.sqrt(longMax) + 1);

		for (int i = 0; i < 10; i++) {
			BigInteger n = start.add(BigInteger.valueOf(i));
			BigInteger square = n.multiply(n);
			System.out.println((i + 1) + ". " + square);
		}
	}
}
