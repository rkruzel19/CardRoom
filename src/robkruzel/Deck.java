package robkruzel;

import java.util.ArrayList;

public class Deck {
	
	private String[] suits = {"C", "H", "D", "S"};
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Deck() {
//		populate();
//		shuffle();
	}
	
	public void populate() {
		for (int s = 0; s < 4; s++) {
			for(int v = 1; v <= 13; v++) {
				if (v == 1) {
					Card card = new Card(suits[s], "Ace");
					this.cards.add(card);
				} else if (v == 11) {
					Card card = new Card(suits[s], "Jack");
					this.cards.add(card);
				} else if (v == 12) {
					Card card = new Card(suits[s], "Queen");
					this.cards.add(card);
				} else if (v == 13) {
					Card card = new Card(suits[s], "King");
					this.cards.add(card);
				} else {
					Card card = new Card(suits[s], Integer.toString(v));
					this.cards.add(card);
//					System.out.println(card.toString());
				}
			}
			
		}
	}
	
	public void shuffle() {
		
	}
	
	public void printDeck() {
		for(int i = 0; i < cards.size(); i++) {
			System.out.println(cards.get(i).toString());
		}
	}
	
}
