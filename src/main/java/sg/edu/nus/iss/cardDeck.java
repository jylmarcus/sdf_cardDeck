package sg.edu.nus.iss;

import java.util.Collections;
import java.util.Stack;

public class cardDeck extends Stack<card>{

    private Stack<card> deck = new Stack<card>();

    public cardDeck() {

    }

    public Stack<card> getDeck() {
        return deck;
    }

    public void addCardtoDeck(card card) {
        this.deck.push(card);
    }

    public void setDeck() {
        this.deck.empty();
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] face = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",};
        Integer[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for(int i = 0; i < suit.length; i++) {
            for(int j = 0; j < face.length; j++) {
                card card = new card(suit[i], face[j], value[j]);
                addCardtoDeck(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public card draw() {
        return this.deck.pop();
    }
}
