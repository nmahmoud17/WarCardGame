package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //instantiate generator object
        DeckGenerator generator = new DeckGenerator();

        //make a new list of cards from the generator
        ArrayList<Card> cards = generator.makeDeck();

        //Call cardDeck Object, and set it with the list of cards we made above
        CardDeck cardDeck = new CardDeck();
        cardDeck.setCardDeck(cards);

        cardDeck.showCardDeck(cards);
        cardDeck.shuffleDeck(cards);
        System.out.println("---------");
        cardDeck.showCardDeck(cards);

        System.out.println("---------------");




    }
}
