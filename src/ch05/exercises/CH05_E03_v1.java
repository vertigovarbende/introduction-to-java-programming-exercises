package ch05.exercises;

public class CH05_E03_v1 {

	public static void main(String[] args) {
//		1 lbs 		0.45 kg
//		x			1 kg 

//		1 lbs		0.45kg
//		x			3 kg
//		
//		0.45x = 3

		/*
		 * for (int i = 0; i < 5; ++i) { if (i == 2) { System.out.println("...\t");
		 * continue; } for (int j = 0; j < 2; ++j) { if (j == 0) System.out.print((i +
		 * 1) + "\t"); else System.out.format("%.1f", calPound(i + 1)); }
		 * System.out.println(); }
		 */

		/*
		 * System.out.println("Kilogram Pound"); for (int i = 1; i <= 199; i += 2) { for
		 * (int j = 1; j <= 2; ++j) { if (j == 1) System.out.print(i + "\t  "); else
		 * System.out.format("%.1f", calPound(i)); } System.out.println(); }
		 */
		int sayiKilogram = 1;
		System.out.println("Kilogram Pound");
		for (int i = 0; i < 5; ++i) {
			if (sayiKilogram == 5) {
				System.out.println("...\t");
				sayiKilogram = 197;
				continue;
			}
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.print(sayiKilogram + "\t  ");
				else
					System.out.format("%.1f", calPound(sayiKilogram));
			}
			sayiKilogram += 2;
			System.out.println();
		}
	}

	public static double calPound(double kg) {
		return (kg / 0.45);
	}

}
