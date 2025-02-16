package ch06.exercises;

public class CH06_E08_v1 {
	public static void main(String[] args) {

		// Test of the method celsiusToFahrenheit()
//		System.out.println(celsiusToFahrenheit(40.0) == 104.0);
//		System.out.println(celsiusToFahrenheit(53.0) == 127.40);
//		System.out.println(celsiusToFahrenheit(62.2) == 143.960);
//		System.out.println(celsiusToFahrenheit(95.8) == 204.4400);

		// Test of the method fahrenheitToCelsius()
//		System.out.println(fahrenheitToCelsius(104.0) == 40);
//		System.out.println(fahrenheitToCelsius(127.40) == 53.00000000000001);	// 53
//		System.out.println(fahrenheitToCelsius(143.960) == 62.20000000000001);	// 62.2
//		System.out.println(fahrenheitToCelsius(204.4400) == 95.8);

		// The solution of the question
		displayTable();
	}

	public static void displayTable() {
		System.out.println("Celsius Fahrenheit \t Fahrenheit Celsius");
		printHyphen("CelsiusFahrenheitFahrenheitCelsius             ".length());
		for (int i = 0; i < 10; ++i)
			System.out.format("%.1f\t%.1f \t\t %.1f\t    %.2f\n", (40.0 - i), celsiusToFahrenheit(40.0 - i),
					(120.0 - (10 * i)), fahrenheitToCelsius(120.0 - (10 * i)));
	}

	// This method converts the Celsius value to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return ((9.0 / 5) * celsius) + 32;
	}

	// This method converts the Fahrenheit value to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

	public static void printHyphen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}
}
