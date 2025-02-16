package ch05.exercises;

import java.util.Random;
import java.util.Scanner;

public class CH05_E34_v1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean deger = false;
		int sayacForPlayer = 0;
		int sayacForComputer = 0;

		do {
			int programSecim = rand.nextInt(0, 3);
			System.out.print("Scissor(0), rock(1), paper(2): ");
			int secim = scan.nextInt();

			if (programSecim == secim)
				System.out.println("The computer is " + programSecim + ". You are " + secim + ". It is draw");
			else {
				switch (programSecim) {
				case 0:
					if (secim == 1) {
						deger = true;
						++sayacForComputer;
					}
					else {
						deger = false;
						++sayacForPlayer;
					}
					break;
				case 1:
					if (secim == 0) {
						deger = true;
						++sayacForComputer;
					}
					else {
						deger = false;
						++sayacForPlayer;
					}
					break;
				case 2:
					if (secim == 1) {
						deger = true;
						++sayacForComputer;
					}
					else {
						deger = false;
						++sayacForPlayer;
					}
					break;
				}
				kimKazandi(deger, secim, programSecim);
			}
			System.out.println();
			
			if (sayacForComputer == 2) {
				System.out.println("The game is over. Computer Won!");
				break;
			}
			else if (sayacForPlayer == 2) {
				System.out.println("The game is over. Player Won!");
				break;
			}
			else 
				continue;
		} while (true);

	}

	public static void kimKazandi(boolean deger, int secim, int programSecim) {
		if (deger == false) 
			System.out.println("The computer is " + programSecim + ". You are " + secim + ". You won");
		else {
			System.out.println("The computer is " + programSecim + ". You are " + secim + ". Computer won");
		}
	}

}
