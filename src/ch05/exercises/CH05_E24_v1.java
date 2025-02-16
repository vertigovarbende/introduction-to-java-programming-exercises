package ch05.exercises;

public class CH05_E24_v1 {

	public static void main(String[] args) {
		
		// fromLeft
		double sayiSoldan = 0.0;
		for (double i = 1; i <= 97; i += 2)
			sayiSoldan += (i / (i + 2));
		System.out.println(sayiSoldan);
		
		// fromRight
		double sayiSagdan = 0.0;
		for (double i = 97; i >= 1; i -= 2)
			sayiSagdan += (i / (i + 2));
		System.out.println(sayiSagdan);
		
		// test
		double sayi = 0.0;
		for (double i = 1; i <= 5; i += 2)
			sayi += (i / (i + 2));
		System.out.println(sayi); // 0.333 + 0.6 + 0.714 = 1.6475

	}

}
