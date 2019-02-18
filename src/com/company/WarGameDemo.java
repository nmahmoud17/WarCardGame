package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WarGameDemo {

    public static void main(String[] args) {

        boolean playAgain = false;
        Scanner myScanner = new Scanner(System.in);

        //instantiate generator object
        DeckGenerator generator = new DeckGenerator();

        //make a new list of cards from the generator
        ArrayList<Card> cards = generator.makeDeck();

        //Call cardDeck Object, and set it with the list of cards we made above
        CardDeck cardDeck = new CardDeck();

        Player player = new Player();

        System.out.println("Welcome to the card game: War\n" +
                "Press [1] Start game\n" +
                "Press [2] Exit\n");

        String userInput = myScanner.nextLine();

        switch (userInput) {

            case "1":
                cardDeck.setCards(cards);
                cardDeck.shuffleDeck(cards);
                player.splitCardDeck(cardDeck);

                Card card1 = player.getComputersFirstCard();
                Card card2 = player.getPlayerTwoFirstCard();

                player.compareCards(card1, card2);


                break;

            default:
                System.out.println("Make sure to choose 1 or 2");


        }


    }
}
