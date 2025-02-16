package ch03.exercises;

import java.util.Scanner;

public class CH03_E05_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int todayDay = scan.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int nextDayNumber = scan.nextInt();

		int nextDay = (todayDay + nextDayNumber) % 7;
		displayDay(todayDay, nextDay);

	}

	public static void displayDay(int todayDay, int nextDay) {
		int[] idDays = { todayDay, nextDay };
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 0; i < idDays.length; ++i) {
			for (int j = 0; j < days.length; ++j) {
				if (idDays[i] == j)
					System.out.print(days[j] + " ");
			}
		}
	}

}
