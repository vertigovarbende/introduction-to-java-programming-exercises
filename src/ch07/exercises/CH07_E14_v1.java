package ch07.exercises;

import java.util.Scanner;

public class CH07_E14_v1 {
	
    public static void main(String[] args) {

        int result = gcd(24, 48, 12, 6, 96);
        System.out.println("The GCD of the entered numbers is: " + result);
    }
    
    public static int gcd(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcdTwoNumbers(result, numbers[i]);
        }
        return result;
    }

    private static int gcdTwoNumbers(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
