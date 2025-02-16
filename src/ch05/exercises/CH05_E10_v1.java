package ch05.exercises;

public class CH05_E10_v1 {

	public static void main(String[] args) {
		int satir = 0;
		for (int i = 100; i <= 1000; ++i) {
			if (i % 5 == 0 && i % 6 == 0) {
				++satir;
				System.out.print(i + " ");
				if (satir % 10 == 0)
					System.out.println();
			}
		}

		
	}

}
