package ch04.exercises;

import java.util.Scanner;
import static java.lang.Math.*;

public class CH04_E05_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		double kenarSayisi = scan.nextDouble();
		
		System.out.print("Enter the side: ");
		double kenarUzunlugu = scan.nextDouble();
		
		System.out.format("The area of the polygon is %f ", calArea(kenarSayisi, kenarUzunlugu));

	}
	
	public static double calArea(double kenarSayisi, double kenarUzunlugu) {
		return (kenarSayisi * pow(kenarUzunlugu, 2)) / (4 * tan(toRadians(180 / kenarSayisi))); 
	}

}
