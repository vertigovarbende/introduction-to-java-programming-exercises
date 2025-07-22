package ch10.exercises.ch10_e03;

public class MyInteger {

	// The private instance variable
	private int value;

	// Constructor

	// Smart constructor
	// +MyInteger(value: int)
	public MyInteger(int value) {
		this.value = value;
	}

	// Getter Method

	// Getter method for private instance variable 'value'
	public int getValue() {
		return value;
	}

	// instance methods

	// +isEven(): boolean
	// this method checks if the value is even number or not
	// if it is then returns true
	public boolean isEven() {
		return value % 2 == 0 ? true : false;
	}

	// +isOdd(): boolean
	// this method checks if the value is odd number or not
	// if it is then returns true
	public boolean isOdd() {
		return value % 2 == 1 ? true : false;
	}

	// +isPrime(): boolean
	// this method checks if the value is prime number or not
	// if it is then returns true
	public boolean isPrime() {
		if (value <= 1)
			return false;
		else {
			for (int i = 2; i < value; ++i)
				if (value % i == 0)
					return false;
		}
		return true;
	}

	// +equals(value: int): boolean
	// this method compares the value of 'this' with the specified value and
	// returns true if the two numbers are equal
	public boolean equals(int value) {
		return this.value == value ? true : false;
	}

	// +equals(value: MyInteger): boolean
	// this method compares the value of 'this' with the specified MyInteger
	// instance's value and
	// returns true if the two numbers are equal
	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.value ? true : false;
	}

	// static methods

	// +isEven(value: int): boolean
	// this static method checks if the specified value is even number or not
	// if it is then returns true
	public static boolean isEven(int value) {
		return value % 2 == 0 ? true : false;
	}

	// +isOdd(): boolean
	// this static method checks if the specified value is odd number or not
	// if it is then returns true
	public static boolean isOdd(int value) {
		return value % 2 == 1 ? true : false;
	}

	// +isPrime(): boolean
	// this static method checks if the specified value is prime number or not
	// if it is then returns true
	public static boolean isPrime(int value) {
		if (value <= 1)
			return false;
		else {
			for (int i = 2; i < value; ++i)
				if (value % i == 0)
					return false;
		}
		return true;
	}

	// +parseInt(value: char[]): int
	// this static method converts the char array to int value
	public static int parseInt(char[] value) {
		String valueStr = "";
		for (int i = 0; i < value.length; ++i)
			valueStr = Character.toString(value[i]);
		return Integer.parseInt(valueStr);
	}

	// +parseInt(value: String): int
	// this static method converts the string value to int value
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}

	// toString()
	@Override
	public String toString() {
		return "value: " + value;
	}
}