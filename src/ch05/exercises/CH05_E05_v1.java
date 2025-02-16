package ch05.exercises;

public class CH05_E05_v1 {

	public static void main(String[] args) {
		int sayiKg = 1;
		int sayiPound = 20;

		System.out.println("Kilogram Pound   Pound  Kilogram");
		for (int i = 0; i < 5; ++i) {
			// firstTable
			if (sayiKg == 5) {
				System.out.println("...\t");
				sayiPound = 510;
				sayiKg = 197;
				continue;
			}
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.print(sayiKg + "\t ");
				else
					System.out.format("%.1f", calPound(sayiKg));
			}
			sayiKg += 2;

			// secondTable

			for (int j = 0; j < 2; ++j) {
				if (j == 0 && sayiPound < 30)
					System.out.print("     " + sayiPound + "\t");
				else if (j == 0 && sayiPound < 520)
					System.out.print("   " + sayiPound + "\t");
				else
					System.out.format("%.1f", calKg(sayiPound));
			}
			sayiPound += 5;
			System.out.println();
		}
	}

	public static double calKg(double pound) {
		return pound * 0.45;
	}

	public static double calPound(double kg) {
		return kg / 0.45;
	}

}
