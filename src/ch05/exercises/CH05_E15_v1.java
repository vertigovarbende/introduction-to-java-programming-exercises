package ch05.exercises;

public class CH05_E15_v1 {

	public static void main(String[] args) {
		// 33 - 126
		int sayac = 0;
		for (int i = 33; i <= 126; ++i) {
			++sayac;
			System.out.print((char) (i) + " ");
			if (sayac % 10 == 0) 
				System.out.println();
		}

	}

}
