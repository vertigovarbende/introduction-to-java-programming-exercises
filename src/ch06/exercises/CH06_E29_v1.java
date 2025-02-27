package ch06.exercises;

public class CH06_E29_v1 {

	public static void main(String[] args) {
		display();
	}
	public static void display() {
		for (int i = 2; i <= 1000; ++i) {
			if (isPrime(i) & isPrime(i + 2))
				System.out.format("(%d,%d)\n", i, i + 2);
		}
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; ++i) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
