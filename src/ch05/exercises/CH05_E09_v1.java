package ch05.exercises;

import java.util.Scanner;

public class CH05_E09_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of the students: ");
		int n = scan.nextInt();
		int[] points = new int[n];
		String[] names = new String[n];
		
		for (int i = 0; i < points.length; ++i) {
			System.out.print("Enter student's name: ");
			names[i] = scan.next();
			System.out.print("Enter student's points: ");
			points[i] = scan.nextInt();
			System.out.println();
		}
		
		display(points, names);
		
	}
	
	public static void display(int[] points, String[] names) {
			System.out.println("firstOne: " + names[findHighestOne(points)]);
			System.out.println("secondOne: " + names[findHighestOne(points)]);
	}
	
	public static int findHighestOne(int[] points) {
		int id = 0;
		int max = points[0];
		for (int i = 0; i < points.length; ++i) {
			if (max < points[i]) {
				max = points[i];
				id = i;
			}
		}
		points[id] = 0; 
		return id;
	}

}
