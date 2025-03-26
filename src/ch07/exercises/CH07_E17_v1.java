package ch07.exercises;

import java.util.Scanner;

public class CH07_E17_v1 {

	static final Scanner SCAN = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of students: ");
		int numbers = SCAN.nextInt();

		String[] names = new String[numbers];
		double[] scores = new double[numbers];
		enterStudents(names, scores);
		display(names, scores);
		System.out.println("\nsorted");
		sortScores(names, scores);
		display(names, scores);
	}

	public static void sortScores(String[] names, double[] scores) {
		double tempScore = 0.0;
		String tempName = "";
		for (int i = 0; i < scores.length - 1; ++i) {
			for (int j = 0; j < scores.length - i - 1; ++j)
				if (scores[j] > scores[j + 1]) {
					double tempS = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = tempS;
					String tempN = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tempN;
				}
		}
	}

	public static void enterStudents(String[] names, double[] scores) {
		for (int i = 0; i < names.length; ++i) {
			System.out.print("Enter [" + i + "] student's name: ");
			names[i] = SCAN.next();
			System.out.print("Enter [" + i + "] student's score: ");
			scores[i] = SCAN.nextDouble();
		}
	}

	public static void display(String[] names, double[] scores) {
		System.out.println();
		for (int i = 0; i < scores.length; ++i)
			System.out.println("name: " + names[i] + " score: " + scores[i]);
	}
}