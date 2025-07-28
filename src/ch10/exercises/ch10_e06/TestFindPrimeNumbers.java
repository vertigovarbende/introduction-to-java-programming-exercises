package ch10.exercises.ch10_e06;

public class TestFindPrimeNumbers {

	public static void main(String[] args) {
		displayPrimeNumbers(findPrimeNumbers());
	}

	public static StackOfIntegers findPrimeNumbers() {
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 1; i <= 120; ++i)
			if (isPrime(i))
				stack.push(i);
		return stack;
	}

	public static boolean isPrime(int value) {
		if (value <= 1)
			return false;
		else {
			for (int i = 2; i < value; ++i) {
				if (value % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void displayPrimeNumbers(StackOfIntegers stack) {
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}
