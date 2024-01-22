package jp.ac.uryukyu.ie.e225421;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    // コンストラクタ
    public Deck() {
        initializeDeck();
        initializeDeck();
        initializeDeck();
        initializeDeck();
        shuffle();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // カードを追加する
    public void initializeDeck() {
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        for (String rank : ranks) {
            cards.add(new Card(rank));
        }

    }

    // デッキをシャッフルするメソッド
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // カードを引くメソッド
    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.println("デッキが空です。");
            return null;
        }
        return cards.remove(0);
    }

    // 手札のカードの数の合計
    public int calcScore(ArrayList<Card> cards) {
        int sum = 0;
        for (var i : cards) {
            int num = i.getNumber();
            sum += num;
        }
        return sum;
    }
}
