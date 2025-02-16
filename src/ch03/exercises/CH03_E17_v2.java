package ch03.exercises;

import java.util.*;

public class CH03_E17_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean deger = false;

		do {
			int programSecim = rand.nextInt(0, 3);
			System.out.print("Scissor(0), rock(1), paper(2): ");
			int secim = scan.nextInt();

			if (programSecim == secim)
				System.out.println("The computer is " + programSecim + ". You are " + secim + ". It is draw");
			else {
				switch (programSecim) {
				case 0:
					if (secim == 1)
						deger = true;
					else
						deger = false;
					break;
				case 1:
					if (secim == 0)
						deger = true;
					else
						deger = false;
					break;
				case 2:
					if (secim == 1)
						deger = true;
					else
						deger = false;
					break;
				}
				kimKazandi(deger, secim, programSecim);
			}
			System.out.println();
			System.out.print("Do you want to continue? (Y / N): ");
			String secimContinue = scan.next();
			System.out.println();
			if (secimContinue.equals("Y"))
				continue;
			else if (secimContinue.equals("N"))
				break;
		} while (true);

	}

	public static void kimKazandi(boolean deger, int secim, int programSecim) {
		if (deger == false)
			System.out.println("The computer is " + programSecim + ". You are " + secim + ". You won");
		else
			System.out.println("The computer is " + programSecim + ". You are " + secim + ". Computer won");
	}

}
