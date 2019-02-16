package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private ArrayList<Card> cards;


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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
