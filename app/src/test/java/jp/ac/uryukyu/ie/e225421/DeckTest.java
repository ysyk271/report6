package jp.ac.uryukyu.ie.e225421;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.checkerframework.checker.units.qual.degrees;

/**
 * DeckTest
 * デッキからカードがちゃんと引かれているか確認する
 * 52枚のデッキからカードを３枚引いて残りの枚数を確かめる
 * つまり残りは49枚であることを期待。
 */
public class DeckTest {
    @Test
    void drawTest() {
        Deck demoDeck = new Deck();
        Card demoCard = demoDeck.drawCard();
        demoCard = demoDeck.drawCard();
        demoCard = demoDeck.drawCard();
        ArrayList<Card> cards = new ArrayList<>();
        cards = demoDeck.getCards();
        int decksize = cards.size();
        assertEquals(decksize, 49);
    }

}