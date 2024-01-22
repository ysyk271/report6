package jp.ac.uryukyu.ie.e225421;

public class Card {
    private String rank;
    private int number;

    // コンストラクタ
    public Card(String cardName) {
        this.rank = cardName;
        this.number = convCard(cardName);
    }

    // カードのランクを取得するメソッド
    public String getCardName() {
        return this.rank;
    }

    // カードの数字を取得する
    public int getNumber() {
        return this.number;
    }

    // カードを数に変換
    public int convCard(String name) {
        char c = name.charAt(0);
        if (Character.isDigit(c)) {
            return Integer.parseInt(name);
        } else {
            return 10;
        }
    }

    @Override
    public String toString() {
        return getCardName();
    }
}
