package jp.ac.uryukyu.ie.e225421;

import java.util.ArrayList;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.t;

public class Game {
    Deck deck = new Deck();
    Card drawedCard;
    ArrayList<Card> cards = new ArrayList<>();
    int number = 0;

    // ゲーム開始時にプレイヤーにカードを２枚渡す
    public Game() {
        drawedCard = deck.drawCard();
        cards.add(drawedCard);
        drawedCard = deck.drawCard();
        cards.add(drawedCard);
        number = deck.calcScore(cards);
    }

    // 手札、点数を表示
    public void show() {
        System.out.print("あなたの手札: ");
        for (Card card : cards) {
            System.out.print(card.getCardName() + ", ");
        }
        System.out.println("点数:" + number);
    }

    // 1ターンの動作
    public void turn() {
        drawedCard = deck.drawCard();
        cards.add(drawedCard);
        number = deck.calcScore(cards);
    }

    // カードを引くか選択
    public boolean selectDraw() {
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            while (true) {
                System.out.print("カードを引きますか？[y/n]:");
                input = scanner.nextLine();
                if (input.equals("n") || input.equals("y")) {
                    break;
                }
                System.out.println("y(yes)またはn(no)を入力してください");
            }
            if (input.equals("y")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean judge() {
        if (number > 21) {
            System.out.println("21を超えたのであなたの負けです");
            return true;
        } else {
            return false;
        }

    }
}
