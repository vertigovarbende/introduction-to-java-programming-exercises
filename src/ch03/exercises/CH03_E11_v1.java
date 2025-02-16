package ch03.exercises;

import java.util.Scanner;

public class CH03_E11_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Yil bilgisini giriniz: ");
		String yil = scan.nextLine();

		System.out.print("Ay bilgisini giriniz: ");
		int ay = scan.nextInt();

		gunSayisi(ay, yil);

	}

	public static void gunSayisi(int ay, String yil) {
		String[] aylar = { "Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim",
				"Kasim", "Aralik" };
		System.out.print(aylar[ay - 1] + " " + yil + ", ");
		for (int i = 0; i < aylar.length; ++i) {
			if (ay % 2 == 1)
				System.out.print("31 gundur");
			else if (ay == 2)
				System.out.print("29 gundur");
			else
				System.out.print("30 gundur");
			break;
		}
	}

}
