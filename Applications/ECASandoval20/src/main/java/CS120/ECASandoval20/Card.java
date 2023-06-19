package CS120.ECASandoval20;

public class Card implements Comparable<Card>{
	private int suitNum; // (1=Clubs 2=Diamonds 3=Hearts 4=Spades)
	private int cardValue;
	private String suitString;
	private String faceString;

	protected static final int Clubs = 1;
	protected static final int Diamonds = 2;
	protected static final int hearts = 3;
	protected static final int Spades = 4;
	protected static final int Ace = 1;
	protected static final int Jack = 11;
	protected static final int Queen = 12;
	protected static final int King = 13;

	public Card(int suitNum, int cardValue) {
		this.suitNum = suitNum;
		this.cardValue = cardValue;
	}
	public String toString() {
		return "Card [suitNum=" + suitNum + ", cardValue=" + cardValue + ", rank=" + getRank() + ", suitString=" + suitString
				+ ", faceString=" + faceString + "]";
	}


	public boolean faceCardCheck() {
		if ((getRank() >= 37)) {
			//	System.out.println(" It is a facecard");
			return true;
		} else {
			//	System.out.println(" It is not a facecard");
			return false;
		}

	}

	public boolean aceCheck() {
		if (this.cardValue == (1)) {
			//	System.out.println("It is an Ace");
			return true;
		} else {
			//	System.out.println("It is not an Ace");
			return false;
		}
	}

	public boolean equals(Card Comp) {
		if (getCardValue() == Comp.cardValue) {
			//	System.out.println("It is equal");
			return true;
		} else {
			//	System.out.println("It is not equal");
			return false;
		}
	}
	public int getSuitNum() {
		return suitNum;
	}


	public int getCardValue() {
		return cardValue;
	}

	public int getRank() {
		int rank=((getCardValue()-2)*4 + getSuitNum());
		return rank;
	}

	public String getSuitString() {
		return suitString;
	}

	public String getFaceString() {
		return faceString;
	}

	public int compareTo(Card ohNo) {
		int diff = getCardValue() - ohNo.getCardValue();
		int absDiff;		//Absolute difference will be the difference |diff| (difference from zero)
		//System.out.println(diff);
		if (diff <0) {
			absDiff = (diff*-1);	
		} else {
			absDiff = (diff);
		}
		//System.out.println(absDiff);
		return absDiff;
	}
	public String suitString(int suitNum) {
		String suitString= "something seems to be wrong with this";
		if (suitNum== 1) {
			suitString = "Clubs";
			return suitString;
		} else if (suitNum == 2) {
			suitString = "Daimonds";
		} else if (suitNum == 3) {
			suitString = "Hearts";
			return suitString;
		} else if (suitNum == 4) {
			suitString = "Spades";
			return suitString;
		} else {
			suitString = "Not a Valid Suit";
			return suitString;
		} return suitString;
	}

	public String faceString(int cardNum) {
		String faceString= "something seems to be wrong with this";
		if (cardNum== 1) {
			faceString = "One";
			return faceString;
		} else if (cardNum== 2) {
			faceString = "Two";
			return faceString;
		} else if (cardNum== 3) {
			faceString = "Three";
			return faceString;
		} else if (cardNum== 4) {
			faceString = "Four";
			return faceString;
		} else if (cardNum== 5) {
			faceString = "Five";
			return faceString;
		} else if (cardNum== 6) {
			faceString = "Six";
			return faceString;
		} else if (cardNum== 7) {
			faceString = "Seven";
			return faceString;
		} else if (cardNum== 8) {
			faceString = "Eight";
			return faceString;
		} else if (cardNum== 9) {
			faceString = "Nine";
			return faceString;
		} else if (cardNum== 10) {
			faceString = "Ten";
			return faceString;
		} else if (cardNum== 11) {
			faceString = "Jack";
			return faceString;
		} else if (cardNum== 12) {
			faceString = "Queen";
			return faceString;
		} else if (cardNum== 13) {
			faceString = "King";
			return faceString;
		} 
		return faceString;
	}}
