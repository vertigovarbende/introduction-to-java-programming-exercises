package ch05.exercises;

public class CH05_E23_v1 {

	public static void main(String[] args) {
		double sayiSoldan = 1;
		for (double i = 2; i <= 50_000; ++i)
			sayiSoldan += (1 / i);

		System.out.println(sayiSoldan);

		double sayiSagdan = (1 / (double) (50_000));
		for (double i = 49_999; i >= 2; --i)
			sayiSagdan += ((double) (1) / i);

		System.out.println(sayiSagdan);

		
		double sayi = 1;
		for (double i = 2; i <= 3; ++i)
			sayi += (1 / i);
		System.out.println(sayi);	// 1 + 0.5 + 0.33333
		
	}

}
