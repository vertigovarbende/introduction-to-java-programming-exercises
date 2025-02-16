package ch03.exercises;

import java.util.*;

public class CH03_E21_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = scan.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = scan.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = scan.nextInt();

		dayOfTheWeek(year, month, day);

	}

	public static void dayOfTheWeek(int year, int month, int day) {
		String dayOfTheWeek = "";
		switch (calDay(year, month, day)) {
		case 0:
			dayOfTheWeek = "Saturday";
			break;
		case 1:
			dayOfTheWeek = "Sunday";
			break;
		case 2:
			dayOfTheWeek = "Monday";
			break;
		case 3:
			dayOfTheWeek = "Tuesday";
			break;
		case 4:
			dayOfTheWeek = "Wednesday";
			break;
		case 5:
			dayOfTheWeek = "Thursday";
			break;
		case 6:
			dayOfTheWeek = "Friday";
			break;
		}
		System.out.println("Day of the week is " + dayOfTheWeek);
	}

	public static int calDay(int year, int month, int day) {
		switch (month) {
		case 1:
			month = 13;
			--year;
			break;
		case 2:
			month = 14;
			--year;
			break;
		}
		int k = year % 100;
		int j = year / 100;
		int h = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		return h;
	}

}
