package ch05.exercises;

public class CH05_E04_v1 {

	public static void main(String[] args) {

		int sayiMile = 1;
		System.out.println("Mile    Kilometer");
		for (int i = 0; i < 5; ++i) {
			if (sayiMile == 3) {
				System.out.println("...\t");
				sayiMile = 9;
				continue;
			}
			for (int j = 0; j < 2; ++j) {
				if (j == 0)
					System.out.print(sayiMile + "\t");
				else
					System.out.format("%.1f", calKilometer(sayiMile));
			}
			++sayiMile;
			System.out.println();
		}

	}

	public static double calKilometer(double mile) {
		return mile * 1.609;
	}

}
