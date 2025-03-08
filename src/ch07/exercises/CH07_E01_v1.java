package ch07.exercises;

import java.util.Scanner;

public class CH07_E01_v1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the number of students: ");
		int n = scan.nextInt();
		int[] scores = new int[n];
		initializeScores(scores);
		printGrades(scores);
	}

	public static void printGrades(int[] scores) {
		int best = scores[0];
		char grade = ' ';
		for (int i = 0; i < scores.length; ++i) {
			if (best < scores[i])
				best = scores[i];
		}
		for (int i = 0; i < scores.length; ++i) {
			if (scores[i] >= best - 10)
				grade = 'A';
			else if (scores[i] >= best - 20)
				grade = 'B';
			else if (scores[i] >= best - 30)
				grade = 'C';
			else if (scores[i] >= best - 40)
				grade = 'D';
			else
				grade = 'F';
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
		}

	}

	public static void initializeScores(int[] scores) {
		System.out.print("Enter " + scores.length + " scores: ");
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = scan.nextInt();
		}
	}
}