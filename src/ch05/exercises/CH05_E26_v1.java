package ch05.exercises;

public class CH05_E26_v1 {

	public static void main(String[] args) {
		
		// i equals to 10_000
		System.out.println(showE(10_000));
		// i equals to 20_000
		System.out.println(showE(20_000));
		// i equals to 100_000
		System.out.println(showE(100_000));

	}
	
	public static double showE(double i) {
		double calculation = 0.0;
		for (double j = 1; j <= i; ++j) 
			calculation += (1 / calFact(j));
		return 1 + calculation;
	}
	
	public static double calFactRecursive(double sayi) {
		if (sayi == 1)
			return 1;
		else 
			return sayi * calFactRecursive(sayi - 1); // cal(5) -> 5 * cal(4) --> 5 * 4 * cal(3) --> 5 * 4 * 3 * cal(2) --> 5 * 4 * 3 * 2 * 1
	}
	
	public static double calFact(double sayi) {
		double factorial = 1.0;
		for (double i = sayi; i >= 1; --i)
			factorial *= i;
		return factorial;
	}

}
