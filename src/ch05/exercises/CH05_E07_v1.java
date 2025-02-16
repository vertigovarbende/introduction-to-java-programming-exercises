package ch05.exercises;

public class CH05_E07_v1 {

	public static void main(String[] args) {
		
		int okulUcret = 10_000;
		int toplam = 0;
		for(int i = 0; i <= 10; ++i) {
			System.out.println(i + " -> "  + calFee(okulUcret, i));
			if (i > 6)
				toplam += calFee(okulUcret, i + 4);		// 11 12 13 14
		}
		System.out.println("11 + 12 + 13 + 14: " + toplam);
	}
	
	public static double calFee(int okulUcret, int sene) {
		return  okulUcret + (sene * okulUcret * (0.05));
	}

}
