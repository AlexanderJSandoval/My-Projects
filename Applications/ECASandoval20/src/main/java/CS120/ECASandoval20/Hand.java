package CS120.ECASandoval20;

import java.util.ArrayList;

public class Hand {
	protected Deck ourDeck = new Deck();
	//Establish main array list
	protected ArrayList<Card> currentHand = new ArrayList<>();  

	//This constructor will create a hand with two cards in it, which is standard for blackjack
	public Hand() {
		currentHand.add(ourDeck.deal());
		currentHand.add(ourDeck.deal());
	}
	//This method will add a card to the hand
	public void addCard() {
		currentHand.add(ourDeck.deal());
	}
	//This method will remove a card from the hand using the returnCard() for Deck.java
	public void removeCard(Card retCard) {
		ourDeck.returnCard(retCard);
		currentHand.remove(retCard);
	}
	//This method will clear the entire hand one card at a time
	public void clearAll() {
		for (int i=0; i<currentHand.size(); i++) {
			currentHand.remove(i);
		}
	}
}
