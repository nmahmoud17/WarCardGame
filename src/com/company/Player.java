package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> playerOneHand;
    private List<Card> playerTwoHand;
    private List<Card> centralDeck = new ArrayList<>();


    public void splitCardDeck(CardDeck deck) {
        playerOneHand = deck.getCards().subList(0,26);
//        System.out.println("---------");
//        System.out.println("Computer hand");
////        for (Card cards : playerOneHand) {
//            cards.printCardDetails();
//        }

        playerTwoHand = deck.getCards().subList(27,52);
//        System.out.println("---------");
//        System.out.println("Player2 hand");
//        for (Card cards : playerTwoHand) {
//            cards.printCardDetails();
//        }
    }

    public Card getComputersFirstCard() {
        Card firstCardPlayer1 = playerOneHand.get(0);
//        System.out.println("Computer's card is: ");
//            firstCardPlayer1.printCardDetails();

        return firstCardPlayer1;
    }

    public Card getPlayerTwoFirstCard() {
        Card firstCardPlayer2 = playerTwoHand.get(0);
//        System.out.println("Your card is: ");
//                firstCardPlayer2.printCardDetails();
        return firstCardPlayer2;
    }


    public void removePlayedCard(Card card1, Card card2) {
        playerOneHand.remove(card1);
        playerTwoHand.remove(card2);

    }

    public void addToCentralDeck(Card card1, Card card2) {
        centralDeck.add(card1);
        centralDeck.add(card2);

    }

    public List<Card> addCentralDeckToComputerHand(){
        playerOneHand.addAll(centralDeck);

        return centralDeck;

    }


    public void addCardtoPlayerTwoHand(ArrayList<Card> centralDeck){
        playerTwoHand.addAll(centralDeck);
    }

    public void compareCards(Card card1, Card card2){
        if (getComputersFirstCard().getWeight() > getPlayerTwoFirstCard().getWeight()) {
            addToCentralDeck(card1,card2);
            addCentralDeckToComputerHand();
            printComputerHand();
        }

    }

    public void printComputerHand(){
        System.out.println(" Full Computer Hand: \n");
        for (Card compHand: playerOneHand){
            compHand.printCardDetails();
        }
    }

    public void printCentralDeck(){
        System.out.println("Central Deck: ");
        for (Card centralDeck: centralDeck){
            centralDeck.printCardDetails();
        }
    }

    public List<Card> getCentralDeck() {
        return centralDeck;
    }

    public void setCentralDeck(List<Card> centralDeck) {
        this.centralDeck = centralDeck;
    }
}
