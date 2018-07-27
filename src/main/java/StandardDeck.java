package main.java;

public class StandardDeck {

	 String[][] cards = new String[4][13];

	public StandardDeck() {
		StringBuilder cardName = new StringBuilder("");
		
		//Initialize a standard deck of cards
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				switch (i) {
				case 0:
					cardName = new StringBuilder("Spades:");
					break;
				case 1:
					cardName = new StringBuilder("Clubs:");
					break;
				case 2:
					cardName = new StringBuilder("Diamonds:");
					break;
				case 3:
					cardName = new StringBuilder("Hearts:");
					break;
				}

				switch (j) {
				case 9:
					cardName.append("Jack");
					break;
				case 10:
					cardName.append("Queen");
					break;
				case 11:
					cardName.append("King");
					break;
				case 12:
					cardName.append("A");
					break;
				default:
					cardName.append(String.valueOf(j + 2));
					break;
				}
				cards[i][j] = cardName.toString();
			}
		}
	}

}
