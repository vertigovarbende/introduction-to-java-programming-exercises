package ch07.exercises;

import java.util.Random;

public class CH07_E29_v1 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		initializeDeck(deck);
		display(deck, suits, ranks);

	}

	public static void display(int[] deck, String[] suits, String[] ranks) {
		int sum = calculateSum(deck, suits, ranks);
		String[][] fourCards = pickFourCards(deck, suits, ranks);
		for (int i = 0; i < fourCards.length; ++i)
			System.out.println("Card number " + deck[i] + ": " + fourCards[i][0] + " of " + fourCards[i][1]);
		System.out.println("The sum of the picked four cards is " + sum);
	}

	public static int calculateSum(int[] deck, String[] suits, String[] ranks) {
		String[][] fourCards = pickFourCards(deck, suits, ranks);
		int sum = 0;
		for (int i = 0; i < fourCards.length; ++i) {
			if (fourCards[i][1].equals("Ace"))
				sum += 1;
			else if (fourCards[i][1].equals("Jack"))
				sum += 11;
			else if (fourCards[i][1].equals("Queen"))
				sum += 12;
			else if (fourCards[i][1].equals("King"))
				sum += 13;
			else
				sum += Integer.parseInt(fourCards[i][1]);
		}
		return sum;
	}

	public static void initializeDeck(int[] deck) {
		for (int i = 0; i < deck.length; ++i)
			deck[i] = i;
		shuffleDeck(deck);
	}

	public static String[][] pickFourCards(int[] deck, String[] suits, String[] ranks) {
		String[][] fourCards = new String[4][2];
		for (int i = 0; i < fourCards.length; ++i) {
			for (int j = 0; j < fourCards[i].length; ++j) {
				if (j == 0)
					fourCards[i][j] = suits[deck[i] / 13];
				else if (j == 1)
					fourCards[i][j] = ranks[deck[i] % 13];
			}
		}
		return fourCards;
	}

	public static void shuffleDeck(int[] deck) {
		Random rand = new Random();
		for (int i = 0; i < deck.length; ++i) {
			int j = rand.nextInt(0, deck.length);

			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}
}