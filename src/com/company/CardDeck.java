package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private ArrayList<Card> cards;

    public ArrayList<Card> getCardDeck() {
        return cards;
    }

    public void setCardDeck(ArrayList<Card> cardDeck) {
        this.cards = cardDeck;
    }

    public void shuffleDeck(ArrayList<Card> deck) {
        Collections.shuffle(deck);
    }

    public void showCardDeck(ArrayList<Card> deck) {
        for (Card cards : deck) {
            cards.printCardDetails();
        }
    }

    public void splitCardDeck() {
        List<Card> player1 = cards.subList(0, 27);
        System.out.println("Player1 hand");
        for (Card cards : player1) {
            cards.printCardDetails();
        }

        List<Card> player2 = cards.subList(27, 52);
        System.out.println("Player2 hand");
        for (Card cards : player2) {
            cards.printCardDetails();
        }
    }


}
