package ch04.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH04_E04_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double kenar = scan.nextDouble();
		
		System.out.format("The area of the hexagon is %.2f", calArea(kenar));

	}

	public static double calArea(double kenar) {
		return (6 * pow(kenar, 2)) / (4 * tan(toRadians(180 / 6)));
	}

}
