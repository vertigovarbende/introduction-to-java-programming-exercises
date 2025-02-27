package ch06.exercises;

import java.util.Random;
import java.util.Scanner;

public class CH06_E30_v1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 to play: ");
		startGame(scan.nextInt());
	}

	public static void startGame(int n) {
		int num1, num2, point = 0;
		String state = "";
		String newState = "";
		if (n == 1) {
			while (true) {
				num1 = rollDice();
				num2 = rollDice();
				if (state.equals("")) {
					switch (num1 + num2) {
					case 2, 3, 12:
						state = "craps";
						break;
					case 7, 11:
						state = "natural";
						break;
					case 4, 5, 6, 8, 9, 10:
						state = "again";
						point = num1 + num2;
						break;
					}
				} else if (state.equals("again")) {
					if (point == num1 + num2) {
						newState = "againWon";
						break;
					} else if (point == 7) {
						newState = "againLost";
						break;
					} else
						point = num1 + num2;
				}
				System.out.format("You rolled %d + %d = %d\n", num1, num2, num1 + num2);
				if (state.equals("craps")) {
					System.out.println("You lose!");
					break;
				} else if (state.equals("natural")) {
					System.out.println("You win!");
					break;
				} else if (state.equals("again")) {
					System.out.println("point is " + point);
					if (newState.equals("againWon")) {
						System.out.println("You won!");
						break;
					} else if (newState.equals("againLost")) {
						System.out.println("You lose!");
						break;
					}
				}
			}
		}
	}

	public static int rollDice() {
		Random rand = new Random();
		return rand.nextInt(1, 7);
	}

}
