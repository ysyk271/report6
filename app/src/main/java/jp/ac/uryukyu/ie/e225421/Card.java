package jp.ac.uryukyu.ie.e225421;

public class Card {
    private String rank;

    // コンストラクタ
    public Card(String cardName) {
        this.rank = cardName;
    }

    // カードのランクを取得するメソッド
    public String getCardName() {
        return rank;
    }
}
