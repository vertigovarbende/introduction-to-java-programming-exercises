package ch06.exercises;

import java.util.Scanner;

public class CH06_E25_v1 {
	
	public static void main(String[] args) {
		
		// test converMillis() method
		System.out.println("0:0:5".equals(convertMillis(5500)));
		System.out.println("0:1:40".equals(convertMillis(100_000)));

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the milliseconds: ");
		long milliSeconds = scan.nextLong();
		
		System.out.print(convertMillis(milliSeconds));
	}
	
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		return String.format("%d:%d:%d", currentHour, currentMinute, currentSecond);
	}
}
