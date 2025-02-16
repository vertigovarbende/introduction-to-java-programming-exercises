package ch03.exercises;

import java.util.*;

public class CH03_E17_v1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		do {
			int programSecim = rand.nextInt(0, 3);
			System.out.print("Scissor(0), rock(1), paper(2): ");
			int secim = scan.nextInt();

			if (secim == programSecim)
				System.out.println("The computer is " + programSecim + ". You are " + secim + ". It is a draw");
			else {
				switch (programSecim) {
				case 0:
					if (secim == 1)
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". You won");
					else
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". Computer won");
					break;
				case 1:
					if (secim == 0)
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". Computer won");
					else
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". You won");
					break;
				case 2:
					if (secim == 0)
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". You won");
					else
						System.out.println("The computer is " + programSecim + ". You are " + secim + ". Computer won");
					break;
				}
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

}
