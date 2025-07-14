package ch09.exercises.ch09_e05;

import java.util.*;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// Creating instance
		GregorianCalendar myGreCalendar = new GregorianCalendar();
		
		// get year, month and day of month
		System.out.println(myGreCalendar.get(GregorianCalendar.YEAR));
		System.out.println(myGreCalendar.get(GregorianCalendar.MONTH));
		System.out.println(myGreCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		// setTimeInMillis(long)
		myGreCalendar.setTimeInMillis(1234567898765L);
		System.out.println(myGreCalendar.get(GregorianCalendar.YEAR));
		System.out.println(myGreCalendar.get(GregorianCalendar.MONTH));
		System.out.println(myGreCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	}
}