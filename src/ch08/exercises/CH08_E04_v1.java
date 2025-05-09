package ch08.exercises;

public class CH08_E04_v1 {

	public static void main(String[] args) {
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		displayEmployees(hours);
	}

	public static void displayEmployees(int[][] hours) {
		int[][] descHours = new int[hours.length][2];
		for (int i = 0; i < hours.length; ++i) {
			descHours[i][0] = i;
			descHours[i][1] = sumTotalHours(hours[i]);
		}

		sortCounts(descHours);
		for (int i = 0; i < descHours.length; ++i)
			System.out.println("Employee " + descHours[i][0] + " worked " + descHours[i][1] + " hours this week");
	}

	public static void sortCounts(int[][] descHours) {
		for (int i = 0; i < descHours.length - 1; ++i) {
			int currentMax = descHours[i][1];
			int employee = descHours[i][0];
			int currentMaxIndex = i;

			for (int j = i + 1; j < descHours.length; ++j) {
				if (currentMax < descHours[j][1]) {
					currentMax = descHours[j][1];
					employee = descHours[j][0];
					currentMaxIndex = j;
				}
			}

			if (currentMaxIndex != i) {
				descHours[currentMaxIndex][1] = descHours[i][1];
				descHours[currentMaxIndex][0] = descHours[i][0];
				descHours[i][1] = currentMax;
				descHours[i][0] = employee;
			}
		}
	}

	public static int sumTotalHours(int[] eachHour) {
		int totalHour = 0;
		for (int i = 0; i < eachHour.length; ++i)
			totalHour += eachHour[i];
		return totalHour;
	}
}