// The Card class represents a single card in our card game
public class Card {

	// String value that holds the rank of the card
	private String rank;

	// String value that holds the suit of the card
	private String suit;

	// int value that holds the point value
	private int pointValue;

	// Constructor: Creates a new Card instance.
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		this.rank = cardRank;
        this.suit = cardSuit;
		this.pointValue = cardPointValue;
	}

	// Accesses this Card's rank.
	public String getRank() {
		String x = rank;
		return x;
	}

	// Accesses this Card's suit.
	public String getSuit() {
		String x = suit;
		return x;
	}

	// Accesses this Card's point value.
	public int getPointValue() {
		int x = pointValue;
		return x;
	}

	// Compare this card with another
	public boolean equals(Card other) {
		if(other.rank.equals(this.rank) && other.suit.equals(this.suit) && other.pointValue == this.pointValue){
			return true;
		}
		return false;
	}

	// Converts the rank, suit, and point value into a string in the format
	//     "[Rank] of [Suit] (point value = [PointValue])".
	//     e.g. "Queen of Spades (point value = 10);
	public String toString() {
		String x = suit;
		String y = rank;
		int q = pointValue;
		String statement = y + " of " + x + " (point value = " + q + ")";
		return statement;
	}






	// CODE BELOW HERE IS ALREADY WRITTEN:
	// This version of equals is used in the testing code
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if (o == null || getClass() != o.getClass()) {
			return false;
		}
		else {
			return this.equals((Card) o);
		}
	}
}
