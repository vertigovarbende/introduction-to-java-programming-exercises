package ch05.exercises;

public class CH05_E20_v1 {

	public static void main(String[] args) {
		int i = 3;
		int sayac = 1;
		System.out.print(2 + " ");
		while (i <= 1000) {
			if (IsPrimeNumber(i)) {
				System.out.print(i + " ");
				++sayac;
				if (sayac % 8 == 0)
					System.out.println();
			}
			++i;
		}

	}

	public static boolean IsPrimeNumber(int sayi) {
		boolean sonuc = false;
		for (int i = 2; i < sayi; ++i) {
			if (sayi % i == 0) {
				sonuc = false;
				break;
			} else
				sonuc = true;
		}
		return sonuc;
	}

}
