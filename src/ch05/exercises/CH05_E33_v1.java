package ch05.exercises;

public class CH05_E33_v1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10_000; ++i) {
			if (findPerfectNumber(i))
				System.out.println(i);
		}

	}
	
	public static boolean findPerfectNumber(int number) {
		int total = 0;
		for (int i = 1; i < number; ++i) {
			if (number % i == 0)
				total += i;
		}
		if (total == number)
			return true;
		else 
			return false;
	}

}
