package ch02.exercises;

import java.util.Scanner;

public class CH02_E01_v1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius of the cylinder: ");
		double radius = scan.nextDouble();

		System.out.print("Enter the length of the cylinder: ");
		double length = scan.nextDouble();

		double area = calculateArea(radius, length);
		double volume = calculateVolume(area, length);
		printCylinderInfo(area, volume);
	}

	public static void printCylinderInfo(double area, double volume) {
		System.out.println("Area : " + area);
		System.out.println("Volume : " + volume);
	}

	public static double calculateVolume(double area, double length) {
		return area * length;
	}

	public static double calculateArea(double radius, double length) {
		return radius * length * Math.PI;
	}

}
