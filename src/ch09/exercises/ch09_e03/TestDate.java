package ch09.exercises.ch09_e03;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date dateObj = new Date(10_000);
		System.out.println(dateObj);

		dateObj.setTime(100_000);
		System.out.println(dateObj);

		dateObj.setTime(1_000_000);
		System.out.println(dateObj);

		dateObj.setTime(10_000_000);
		System.out.println(dateObj);

		dateObj.setTime(100_000_000);
		System.out.println(dateObj);

		dateObj.setTime(1_000_000_000);
		System.out.println(dateObj);

		
		Date dateObj3 = new Date();
		System.out.println(dateObj3);
	}
}