package ch06.exercises;

public class CH06_E16_v1 {

	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; ++i)
			System.out.println("year: " + i + " number of days in this year: " + numberOfDaysInAYear(i));
	} 
	
	public static int numberOfDaysInAYear(int year) {
		if (year % 4 == 0)
			return 366;
		else 
			return 365;
	}
}


