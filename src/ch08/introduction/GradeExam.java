package ch08.introduction;

public class GradeExam {

	/* The problem is to write a program that will grade multiple-choice tests */

	public static void main(String[] args) {

		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		grade(answers, keys);
	}

	public static void grade(char[][] answers, char[] keys) {
		for (int i = 0; i < answers.length; ++i) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; ++j) {
				if (answers[i][j] == keys[j])
					++correctCount;
			}
			System.out.println("Student " + i + "'s correct count is " + correctCount);
		}
	}
}