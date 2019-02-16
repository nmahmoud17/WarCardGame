package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private ArrayList<Card> cards;
    private List<Card> playerOneHand;
    private List<Card> playerTwoHand;

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
        playerOneHand = cards.subList(0, 27);
        System.out.println("---------");
        System.out.println("Player1 hand");
        for (Card cards : playerOneHand) {
            cards.printCardDetails();
        }

        playerTwoHand = cards.subList(27, 52);
        System.out.println("---------");
        System.out.println("Player2 hand");
        for (Card cards : playerTwoHand) {
            cards.printCardDetails();
        }
    }

    public Card getPlayer1FirstCard() {
        Card hand1 = playerOneHand.get(0);
        return hand1;
    }

    public Card getPlayer2FirstCard() {
        Card hand2 = playerTwoHand.get(0);
        return hand2;
    }


}
