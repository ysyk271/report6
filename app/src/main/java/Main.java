import jp.ac.uryukyu.ie.e225421.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // カードを一枚引いて表示
        Card drawnCard = deck.drawCard();
        System.out.println("引いたカード: " + drawnCard.getCardName());

    }
}
