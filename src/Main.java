import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Player player = new Player();
        Opponent opp = new Opponent();
        Ball ball = new Ball(player);
        Ball second = new Ball (player, 10);
        Game game = new Game(ball, second, player, opp);
        JFrame frame = new JFrame("Our Game");
        frame.add(game);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }
    }

}
