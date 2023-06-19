package CS120.ECASandoval20;

import java.util.Random;

public class Deck {
	protected Card[] cards = new Card[52];


	// This method will create the ordered deck of 52
	public Deck() {
		int suitNum = 1;
		int cardNum = 1;
		for (int i = 0; i <= 51; i++) {
			cards[i] = new Card(suitNum, cardNum);

			if (cardNum == 13) {
				cardNum = 1;
				suitNum++;
			}
			cardNum++;
		}
		shuffle();
	}

	//The shuffle method will switch two random cards 1000 times tro effectively shuffle the deck
	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			Random rand = new Random();
			int trackRand1 = rand.nextInt(51);
			int trackRand2 = rand.nextInt(51);
			Card one =cards[trackRand1]; 
			Card two =cards[trackRand2];
			cards[trackRand2] = one;
			cards[trackRand1] = two;
		}
	}
	//This method will take a card from the deck and move all subsequent cards
	public Card deal() {
		Card one= cards[0];
		//This for loop moves each card down one so that one will always be at the bottom
		for(int i=0; i<=50; i++) {
			cards[i] = cards[i+1];	
		}
		return one;
	}

	//This will return a card to the deck
	public void returnCard(Card retCard) {
		cards[isEmpty()] = retCard;
	}
	//This method will check for the first empty spot within the deck and return it's index
	public int isEmpty() {
		for (int i=1; i<=51; i++ ) {
			if (cards[i]==(null)) {
				return i;
			}
		}
		return 404;
	}
	//This method will use the empty() to determine how many cards are lef tin teh deck
	public int numCardsLeft() {
		//		System.out.println(isEmpty() -1);
		return isEmpty() -1;
	}
	//This method will clear the entire deck
	public void clearAll(Deck aggregate) {
		for (int i=0; i<52; i++) {
			aggregate.cards[i] =null;
		}
	}
}
