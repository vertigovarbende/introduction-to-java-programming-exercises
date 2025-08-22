package ch10.exercises.ch10_e18;

import java.math.BigInteger;

public class TestLargePrimeNumbers {

    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE);

        System.out.println("Long.MAX_VALUE = " + start);

        for (int i = 1; i <= 5; i++) {
            start = start.nextProbablePrime();
            System.out.println(i + ". prime = " + start);
        }
    }
}
