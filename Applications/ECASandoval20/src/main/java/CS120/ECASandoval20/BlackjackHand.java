package CS120.ECASandoval20;

public class BlackjackHand extends Hand {
	/* The blackjack file extends hand and will add many of it's more blackjack specific features 
	 */

	public BlackjackHand() {
		super();

	}
	/*This may be the most complex method I've created 
	 * It will use the cardNum to determine the cards value. to do this it must check for face cards and aces
	 *it can also determine what to value each card at automatically
	 * It is a for loop so that I only have to write it for one card and then can go through it for each 
	 */
	public int value() {
		int handVal =0;
		//For loop for application to each card
		for (int i=0; i<super.currentHand.size(); i++) {
			if (currentHand.get(i).faceCardCheck() == true) { //Check for face card
				handVal += 10;
			} else if (currentHand.get(i).aceCheck() == true) {   //Check for Ace
				if ((handVal + 11) > 21) { 							//calculate ace value
					handVal += 1;	
				} else {
					handVal += 11;
				}
			}	else {
				handVal += currentHand.get(i).getCardValue(); // for non-ace non-face cards
			}

		}
		return handVal;
	}
	//This method checks if the value is over 21
	public boolean isBust() {	
		return value() > 21; 
	}
	//This method checks for aces and whether or not the hand has the possibility of busting
	public boolean isSoft() {
		boolean aceTF = true;
		for (int i=0; i<super.currentHand.size(); i++) {
			if (currentHand.get(i).aceCheck() == false) {
				aceTF = false;
			}		
		} return aceTF;
	}
	// This method checks to see if the hand equals exactly 21
	public boolean isTwentyOne() {
		return value() == 21;
	}
}
