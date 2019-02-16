package com.company;

import java.util.List;

public class Player {

    private List<Card> playerOneHand;
    private List<Card> playerTwoHand;


    public void splitCardDeck(CardDeck deck) {
        playerOneHand = deck.getCards().subList(0,27);
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
        Card hand1 = playerOneHand.get(0);
        return hand1;
    }

    public Card getPlayer2FirstCard() {
        Card hand2 = playerTwoHand.get(0);
        return hand2;
    }

    public void addCardToPlayerOneHand(Card card){
        playerOneHand.add(card);

    }

    public void addCardtoPlayerTwoHand(Card card){
        playerTwoHand.add(card);
    }


}
