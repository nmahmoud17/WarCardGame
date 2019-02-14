package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DeckGenerator {

    private ArrayList<String> suits = new ArrayList<>(Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));
    private ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Club", "Spade","Hearts","Diamonds"));
    private Card newCard;

    public Card makeCard() {
        for (String suit: suits) {
            for (String rank: ranks) {
               newCard = new Card(suit, rank);
            }

        }

        return newCard;
    }

    public CardDeck generateCardDeck() {


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
