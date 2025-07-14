package ch09.exercises.ch09_e12;

import java.util.Scanner;

public class TestLine {

	static final Scanner INPUT = new Scanner(System.in);
	
	public static void main(String[] args) {
		// get values from the user
		Point startPoint = new Point();
		System.out.println("Enter start point");
		System.out.print("x: ");
		startPoint.setX(INPUT.nextInt());
		System.out.print("y: ");
		startPoint.setY(INPUT.nextInt());
		
		
		Point endPoint = new Point();
		System.out.println("Enter end point");
		System.out.print("x: ");
		endPoint.setX(INPUT.nextInt());
		System.out.print("y: ");
		endPoint.setY(INPUT.nextInt());
		
		// create a instance of Line
		Line myLine = new Line(startPoint, endPoint);
		
		// create new instance of Line
		Line otherLine = new Line(4, 2, -1, -2);
		
		// test getIntersectPoint()
		System.out.println(myLine.getIntersectPoint(otherLine));
		
	}
}
