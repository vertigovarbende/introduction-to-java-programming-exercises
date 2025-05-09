package ch08.exercises;

public class CH08_E03_v1 {

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
		int counts[][] = new int[answers.length][2];
		for (int i = 0; i < answers.length; ++i) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; ++j)
				if (answers[i][j] == keys[j])
					++correctCount;
			counts[i][0] = correctCount;
			counts[i][1] = i;
		}
		displayCounts(counts);
	}

	public static void sortCounts(int[][] counts) {
		for (int i = 0; i < counts.length - 1; ++i) {
			int currentMin = counts[i][0];
			int student = counts[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < counts.length; ++j) {
				if (currentMin > counts[j][0]) {
					currentMin = counts[j][0];
					student = counts[j][1];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				counts[currentMinIndex][0] = counts[i][0];
				counts[currentMinIndex][1] = counts[i][1];
				counts[i][0] = currentMin;
				counts[i][1] = student;
			}
		}
	}

	public static void displayCounts(int[][] counts) {
		sortCounts(counts);
		for (int i = 0; i < counts.length; ++i)
			System.out.println("Student " + counts[i][1] + "'s correct count is " + counts[i][0]);
	}
}