package ch07.introduction;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		initializeDeck(deck);

		// display the first for cards
		for (int i = 0; i < 4; ++i) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}

		shuffleDeck(deck);

		System.out.println();
		// after shuffling the deck and display the first for cards
		for (int i = 0; i < 4; ++i) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}

	// initialize deck
	public static void initializeDeck(int[] deck) {
		for (int i = 0; i < deck.length; ++i)
			deck[i] = i;
	}

	// shuffle deck
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