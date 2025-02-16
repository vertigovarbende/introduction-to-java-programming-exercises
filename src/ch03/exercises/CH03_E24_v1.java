package ch03.exercises;

import java.util.*;

public class CH03_E24_v1 {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] kart = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kız", "Papaz" };
		String[] kartTipi = { "Sinek", "Karo", "Kupa", "Maça" };

		int n = rand.nextInt(kart.length);
		int nTipi = rand.nextInt(kartTipi.length);
		System.out.println("Sectiginiz kart " + kartTipi[nTipi] + " " + kart[n] + " 'dir");
		
//		int[] dizi = {1, 2, 3};
//		int n = rand.nextInt();
//		System.out.println(dizi[n]);
	}

}
