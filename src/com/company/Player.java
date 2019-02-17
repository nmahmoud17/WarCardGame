package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> playerOneHand;
    private List<Card> playerTwoHand;
    private List<Card> centralDeck;


    public void splitCardDeck(CardDeck deck) {
        playerOneHand = deck.getCards().subList(0,26);
        System.out.println("---------");
        System.out.println("Player1 hand");
        for (Card cards : playerOneHand) {
            cards.printCardDetails();
        }

        playerTwoHand = deck.getCards().subList(27,52);
        System.out.println("---------");
        System.out.println("Player2 hand");
        for (Card cards : playerTwoHand) {
            cards.printCardDetails();
        }
    }

    public Card getPlayer1FirstCard() {
        Card firstCardPlayer1 = playerOneHand.get(0);

        return firstCardPlayer1;
    }

    public Card getPlayer2FirstCard() {
        Card firstCardPlayer2 = playerTwoHand.get(0);
        return firstCardPlayer2;
    }


    public void removePlayedCard() {
        playerOneHand.remove(getPlayer1FirstCard());
        playerTwoHand.remove(getPlayer2FirstCard());
    }

    public List<Card> addToCentralDeck() {
        centralDeck.add(getPlayer1FirstCard());
        centralDeck.add(getPlayer2FirstCard());

        return centralDeck;
    }

    public void addCentralDeckToPlayerOneHand(ArrayList<Card> centralDeck){
        playerOneHand.addAll(centralDeck);

    }

    public void addCardtoPlayerTwoHand(ArrayList<Card> centralDeck){
        playerTwoHand.addAll(centralDeck);
    }


}
