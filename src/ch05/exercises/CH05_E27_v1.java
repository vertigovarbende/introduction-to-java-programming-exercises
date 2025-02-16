package ch05.exercises;

public class CH05_E27_v1 {
	
	public static void main(String[] args) {
		int sayac = 0;
		for (int i = 101; i <= 2100; ++i) {
			if (i % 4 == 0) {
				++sayac;
				System.out.print(i + " ");
				if (sayac % 10 == 0)
					System.out.println();
			}
		}
		
		
	}

}
