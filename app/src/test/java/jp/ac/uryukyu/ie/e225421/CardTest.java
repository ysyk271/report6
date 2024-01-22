package jp.ac.uryukyu.ie.e225421;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 * カードの数字を変換できてるか確認
 * ２から１０までのカードを１枚ずつ足すので54になる
 * J、Q、Kはそれぞれ１０なので３０になる
 */
public class CardTest {
    @Test
    void convTest() {
        Deck demoDeck = new Deck();
        ArrayList<Card> demoCards = new ArrayList<>();
        ArrayList<Card> demoCards2 = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            String cardName = Integer.toString(i);
            Card card = new Card(cardName);
            demoCards.add(card);
        }
        int demoScore = demoDeck.calcScore(demoCards);
        assertEquals(demoScore, 54);

        Card j = new Card("J");
        demoCards2.add(j);
        Card q = new Card("Q");
        demoCards2.add(q);
        Card k = new Card("K");
        demoCards2.add(k);
        int demoScore2 = demoDeck.calcScore(demoCards2);
        assertEquals(demoScore2, 30);
    }

}
