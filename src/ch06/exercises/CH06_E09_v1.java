package ch06.exercises;

public class CH06_E09_v1 {

	public static void main(String[] args) {

		// Test of the method footToMeter(foot:double):double
//		System.out.println(footToMeter(3.14) == 0.957072);
//		System.out.println(footToMeter(2.71) == 0.826008);
//		System.out.println(footToMeter(12.32) == 3.755136);

		// Test of the method meterToFoot(meter:double):double

//		System.out.println(meterToFoot(0.957072) == 3.14);
//		System.out.println(meterToFoot(0.826008) == 2.71);
//		System.out.println(meterToFoot(3.755136) == 12.32);

		// The solution of the question
		displayTable();

	}

	public static void displayTable() {
		System.out.println("Feet  Meters \t Meters  Feet");
		printHypen(30);
		for (double i = 0; i < 10; ++i) {
			if (i != 9)
				System.out.print(" ");
			System.out.format("%.1f   %.3f \t %.1f    %.3f\n", i + 1, footToMeter(i + 1), (20.0 + (i * 5)),
					meterToFoot((20.0 + (i * 5))));
		}
	}

	// This method converts the Feet value to Meters
	public static double footToMeter(double foot) {
		return foot * 0.3048;
	}

	// This method converts the Feet value to Meters
	public static double meterToFoot(double meter) {
		return meter * 3.279;
	}
	
	public static void printHypen(int length) {
		for (int i = 0; i < length; ++i)
			System.out.print("-");
		System.out.println();
	}

}
