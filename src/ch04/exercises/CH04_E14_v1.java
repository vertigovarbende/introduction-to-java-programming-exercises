package ch04.exercises;

import java.util.Scanner;

public class CH04_E14_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		String grade = scan.next().toUpperCase();
		findGrade(grade);

	}

	public static void findGrade(String grade) {
		int gradeInt = 0;
		switch (grade) {
		case "A":
			gradeInt = 4;
			break;
		case "B":
			gradeInt = 3;
			break;
		case "C":
			gradeInt = 2;
			break;
		case "D":
			gradeInt = 1;
			break;
		case "F":
			break;
		default:
			gradeInt = -1;
		}
		if (gradeInt < 0)
			System.out.println(grade + " is an invalid grade ");
		else
			System.out.println("The numeric value for grade " + grade + " is " + gradeInt);
	}

}
