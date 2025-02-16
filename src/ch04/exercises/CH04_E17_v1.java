package ch04.exercises;

import java.util.Scanner;

public class CH04_E17_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		System.out.print("Enter a year: ");
		int year = scan.nextInt();

		System.out.print("Enter a month: ");
		String month = scan.next();
		
		displayDay(year, month);


	}

	public static void displayDay(int year, String month) {
		int day = 0;
		
		switch (month) {
		case "Jan", "Mar", "May", "July", "Aug", "Oct", "Dec":
			day = 31;
			break;
		case "Apr", "Jun", "Sep", "Nov":
			day = 30;
			break;
		case "Feb":
			if (year % 4 == 0)
				day = 29;
			else
				day = 28;
			break;
		}
		System.out.println(month + " " + year + " has " + day + " days");
	}

}
