package ch05.exercises;

public class CH05_E25_v1 {

	public static void main(String[] args) {
		double PI = 0.0;
		
		// i equals to 10_000
		System.out.println(showPI(10_000));
		System.out.println(showPI(20_000));
		System.out.println(showPI(100_000));
		
			
	}
	
	public static double showPI(double i) {
		double calculation = 0.0;
		double operator = 0;
		for (double j = 1; j <= (2 * i) - 1; j += 2) {
			++operator;
			if (j == 1) {
				calculation++;
				continue;
			}
			else if (j == (2 * i) - 1)
				calculation += Math.pow(-1, i + 1) / ((2 * i) - 1);
			else if (operator % 2 == 0)
				calculation -= (1 / j);
			else if (operator % 2 == 1)
				calculation += (1 / j);
		}
		return 4 * calculation;	
	}

}
