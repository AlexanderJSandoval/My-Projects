package CS120.ECASandoval20;

import java.util.Scanner;

public class BlackJackGame {

	public boolean pOf;	
	public String pState = "Playing";
	public String dState = "Playing";
	public Deck deckGame;
	public BlackjackHand pHand;
	public BlackjackHand dHand;

	public BlackJackGame() {
		//Establish playable deck!!!!
		deckGame = new Deck();
		deckGame.shuffle();
		//Establish Hands
		pHand = new BlackjackHand();
		dHand = new BlackjackHand();
		//While loop is game
		while(pState == "Playing" || dState =="Playing") {
			//Ask user for values
			//Scanner scanny = new Scanner(System.in);
			System.out.println("Your hand has " + pHand.value() );	
			System.out.println("Please type 'hit' if you would like a card, or 'pass' to pass");
			//bjgCont();
			dState = "Standing";
			pState = "Standing";
		}
	}

	public void bjgCont() {
		//Process user input	
		if (pOf == true) {
			System.out.println("You hit");
			pHand.addCard();

		} else if(pOf == false) {
			System.out.println("You passed");
			pState = "Standing";

		}
		//Decide Dealer's move
		if (dHand.value()<=17) {
			System.out.println("The dealer will hit");	
			dHand.addCard();
		} else {
			System.out.println("The dealer will pass");		
			dState = "Standing";
		}
		//Check hands	
		if (pHand.isBust()) {
			pState = "Busted";
		}
		if (dHand.isBust()) {
			dState = "Busted";
		}
		if (pHand.isTwentyOne()) {
			pState = "Twenty-One";
		}
		if (dHand.isTwentyOne()) {
			dState = "Twenty-One";
		}
		if (pState == "Busted") {
			System.out.println("Dealer wins with: "+ dHand.value() );
			System.out.println("Player had: "+ pHand.value() );
			dState= "Winner";
		} else if (dState == "Busted") {
			System.out.println("Player wins with: "+ pHand.value() );
			System.out.println("Dealer had: "+ dHand.value() );
			pState= "Winner";
		} else {
			if (dState == "Twenty-One") {
				System.out.println("Dealer wins with: "+ dHand.value() );
				System.out.println("Player had: "+ pHand.value() );
				pState= "Loser";
			}  else if (pState == "Twenty-One") {
				System.out.println("Player wins with: "+ pHand.value() );
				System.out.println("Dealer had: "+ dHand.value() );
				dState= "Loser";
			} else { 
				if (pHand.value() > dHand.value() ) {
					System.out.println("Player wins with: "+ pHand.value() );
					System.out.println("Dealer had: "+ dHand.value() );
					pState= "Winner";
					dState= "Loser";
				} else if (dHand.value() > pHand.value() ) {
					System.out.println("Dealer wins with: "+ dHand.value() );
					System.out.println("Player had: "+ pHand.value() );
					dState= "Winner";
					pState= "Loser";
				} else if (pHand.value() == dHand.value() ) {
					System.out.println("Tie at: "+ pHand.value() );
					pState= "Tie";
					dState= "Tie";
				}	

			}
		}
	}

	//Getters and Setters 
	public boolean ispOf() {
		return pOf;
	}

	public void setpOf(boolean pOf) {
		this.pOf = pOf;
	}
}




