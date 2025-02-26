package ch06.exercises;

public class CH06_E26_v1 {

	public static void main(String[] args) {

		// test isPrime()
//		System.out.println(isPrime(2) == true);
//		System.out.println(isPrime(3) == true);
//		System.out.println(isPrime(5) == true);
//		System.out.println(isPrime(7) == true);
//		System.out.println(isPrime(11) == true);

		// test isPalindrome()
//		System.out.println(isPalindrome("101") == true);
//		System.out.println(isPalindrome("131") == true);
//		System.out.println(isPalindrome("929") == true);
//		System.out.println(isPalindrome("111") == true);
//		System.out.println(isPalindrome("121") == true);

		// Solution of the question
		display();

	}

	public static void display() {
		int i = 0;
		int number = 2;
		int row = 0;
		while (i != 100) {
			if (isPrime(number) && isPalindrome(number + "")) {
				System.out.print(number + " ");
				++i;
				++row;
				if (row % 10 == 0)
					System.out.println();
			}
			++number;
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; ++i) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPalindrome(String number) {
		if (number.length() == 1 || number.length() == 0)
			return true;
		else {
			if (number.charAt(0) == number.charAt(number.length() - 1)) {
				number = number.substring(1, number.length() - 1);
				return isPalindrome(number);
			} else
				return false;
		}
	}
}
