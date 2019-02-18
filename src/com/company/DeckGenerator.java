package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckGenerator {

    private ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));
    private ArrayList<String> suits = new ArrayList<>(Arrays.asList("Clubs", "Spades","Hearts","Diamonds"));
    private Card newCard;


    public ArrayList<Card> makeDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (String rank: ranks) {
            for (String suit: suits) {
               newCard = new Card(suit, rank);
               deck.add(newCard);
            }
        }
        return deck;
    }


    public ArrayList<String> getSuits() {
        return suits;
    }

    public void setSuits(ArrayList<String> suits) {
        this.suits = suits;
    }

    public ArrayList<String> getRanks() {
        return ranks;
    }

    public void setRanks(ArrayList<String> ranks) {
        this.ranks = ranks;
    }

    public Card getNewCard() {
        return newCard;
    }

    public void setNewCard(Card newCard) {
        this.newCard = newCard;
    }
}
