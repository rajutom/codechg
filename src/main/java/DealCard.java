package main.java;

import java.util.Scanner;

public class DealCard {

	public static void main(String[] args) {
		try {			
				//Request the number of players
				System.out.println("Enter the number of players :: ");
				Scanner scanner = new Scanner(System.in);
				String numberOfPlayers = scanner.nextLine();
				
				//Get players with shuffled cards
				ShuffleCards shuffle = new ShuffleCards();
				shuffle.shuffleCardsToPlayers(numberOfPlayers);
				shuffle.printCardsPossesed();
				scanner.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
