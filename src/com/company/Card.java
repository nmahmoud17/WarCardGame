package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {

    private String suit;
    private String rank;
    private int weightOfCard;


    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
//        this.weightOfCard = getWeightOfCard();
    }

    public void printCardDetails() {
        System.out.println(getRank());
        System.out.println(getSuit());
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getWeightOfCard() {
        return weightOfCard;
    }

    public void setWeightOfCard(int weightOfCard) {
        this.weightOfCard = weightOfCard;
    }
}

