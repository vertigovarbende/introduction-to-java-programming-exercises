package ch05.exercises;

public class CH05_E06_v1 {

	public static void main(String[] args) {
		int sayiMile = 1;
		int sayiKm = 20;

		System.out.println("Mile Kilometer   Kilometer Mile");
		// firstTable
		for (int i = 0; i < 5; ++i) {
			if (sayiMile == 3) {
				System.out.println("...\t");
				sayiMile = 9;
				sayiKm = 60;
				continue;
			}
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.print(sayiMile + "\t");
				else
					System.out.format("%.3f", calKilometer(sayiMile));
			}
			++sayiMile;

			// secondTable

			for (int j = 0; j < 2; ++j) {
				if (j == 0 && sayiKm < 30)
					System.out.print("    " + sayiKm + "\t");
				else if (j == 0 && sayiKm < 70)
					System.out.print("   " + sayiKm + "\t");
				else
					System.out.format("   %.3f", calMile(sayiKm));
			}
			sayiKm += 5;
			System.out.println();
		}
	}

	public static double calKilometer(double mile) {
		return mile * 1.609;
	}

	public static double calMile(double kilometer) {
		return kilometer / 1.609;
	}

}
