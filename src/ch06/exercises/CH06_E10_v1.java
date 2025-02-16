package ch06.exercises;

public class CH06_E10_v1 {
	public static void main(String[] args) {
		// The test of the isPrime(number:int):boolean method
		
//		System.out.println(isPrime(2) == true);
//		System.out.println(isPrime(5) == true);
//		System.out.println(isPrime(13) == true);
//		System.out.println(isPrime(103) == true);
//		System.out.println(isPrime(4) == false);
//		System.out.println(isPrime(28) == false);
		
		// The solution of the question
		displayTable();
	}
	
	public static void displayTable() {
		int counter = 0;
		for (int i = 2; i < 10_000; ++i) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				++counter;
				if (counter % 10 == 0)
					System.out.println();
			}
		}
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	
}
