package ch03.exercises;

import java.util.Scanner;

public class CH03_E05_v1 {

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
		int[] days = { todayDay, nextDay };
		String[] daysS = new String[2];
		for (int i = 0; i < days.length; ++i) {
			switch (days[i]) {
			case 0:
				daysS[i] = "Sunday";
				break;
			case 1:
				daysS[i] = "Monday";
				break;
			case 2:
				daysS[i] = "Tuesday";
				break;
			case 3:
				daysS[i] = "Wednesday";
				break;
			case 4:
				daysS[i] = "Thursday";
				break;
			case 5:
				daysS[i] = "Friday";
				break;
			case 6:
				daysS[i] = "Saturday";
				break;
			}
		}
		System.out.println("Today is " + daysS[0] + " and the future day is " + daysS[1]);
	}

}
