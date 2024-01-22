
import jp.ac.uryukyu.ie.e225421.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            game.show();
            if (game.selectDraw() == false) {
                System.out.println("終了");
                game.show();
                break;
            }
            game.turn();
            if (game.judge()) {
                game.show();
                break;
            }
        }
    }
}
