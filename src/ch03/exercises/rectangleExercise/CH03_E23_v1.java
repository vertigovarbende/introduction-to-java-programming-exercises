package ch03.exercises.rectangleExercise;

import java.util.*;

public class CH03_E23_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dikdortgenin boyu: ");
		double boy = scan.nextDouble();
		
		System.out.print("Dikdortgenin eni: ");
		double en = scan.nextDouble();
		
		System.out.print("Noktanin x'i: ");
		double x = scan.nextDouble();
		
		System.out.print("Noktanin y'si: ");
		double y = scan.nextDouble();
		
		Point pointObj = new Point(x, y, boy, en);
		displayPoint(pointObj);

	}
	
	public static void displayPoint(Point pointObj) {
		if(pointObj.IsValid())
			System.out.format("Point (%.1f %.1f) is in the rectangle\n", pointObj.getX(), pointObj.getY());
		else 
			System.out.format("Point (%.1f %.1f) is not in the rectangle\n", pointObj.getX(), pointObj.getY());
	}

}
