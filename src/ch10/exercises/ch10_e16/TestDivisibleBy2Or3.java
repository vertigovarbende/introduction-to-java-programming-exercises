package ch10.exercises.ch10_e16;

import java.math.BigInteger;

public class TestDivisibleBy2Or3 {

	public static void main(String[] args) {
		BigInteger zero = new BigInteger("0");
		BigInteger a = new BigInteger("10000000000000000000000000000000000000000000000000");
		int i = 0;
		while(true) {
			if (a.mod(new BigInteger("2")) == zero)
				System.out.println(a.mod(new BigInteger("2")));
			else if (a.mod(new BigInteger("3")) == zero)
				System.out.println(a.mod(new BigInteger("3")));
			++i;
			
			if (i % 10 == 0)
				break;
		}
		
	}
}
