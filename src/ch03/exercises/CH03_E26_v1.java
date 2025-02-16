package ch03.exercises;

import java.util.Scanner;

public class CH03_E26_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = scan.nextInt();
		boolean deger = false;
		display(n);


	}
	
	public static void display(int n) {
		boolean[] degerler = IsDivisible(n);
		char op = 38;
		for (int i = 0; i < degerler.length; ++i) {
			System.out.println("Is " + n + " divisible by 5 " + op + " 6?: " + degerler[i]);
			if (op == 38)
				op += 86;
			else if (op == 124)
				op -= 30;
		}
	}

	public static boolean[] IsDivisible(int n) {
		boolean[] degerler = new boolean[3];
		if (n % 5 == 0 & n % 6 == 0)
			degerler[0] = true;
		else
			degerler[0] = false;
		if (n % 5 == 0 | n % 6 == 0)
			degerler[1] = true;
		else
			degerler[1] = false;
		if (n % 5 == 0 ^ n % 6 == 0)
			degerler[2] = true;
		else
			degerler[2] = false;

		return degerler;
	}

}
