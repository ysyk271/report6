package jp.ac.uryukyu.ie.e225421;

import java.util.ArrayList;

public class Game {
    Deck deck = new Deck();
    Card drawedCard;
    ArrayList<Card> cards = new ArrayList<>();
    int number = 0;

    public Game() {
        drawedCard = deck.drawCard();
        cards.add(drawedCard);
        drawedCard = deck.drawCard();
        cards.add(drawedCard);
        number = deck.calcScore(cards);
    }

    public void turn() {

        System.out.print("あなたの手札: ");
        for (Card card : cards) {
            System.out.print(card.getCardName() + ", ");
        }
        System.out.println("点数:" + number);
    }
}
