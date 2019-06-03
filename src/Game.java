import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;

public class Game extends JPanel {

    public static Ball theBall;
    public static Ball second;
    public static Player ourPlayer;
    public static Opponent ourOpponent;

    public Game(Ball ball, Ball ball2, Player player, Opponent opp) {
        theBall = ball;
        second = ball2;
        ourPlayer = player;
        ourOpponent = opp;

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                ourPlayer.keyReleased(e);
                ourOpponent.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ourPlayer.keyPressed(e);
                ourOpponent.keyPressed(e);
            }
        });
        setFocusable(true);
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setBackground(Color.GREEN); // CHECK THIS CHECK THIS
        g2d.setColor(Color.ORANGE);
        ourPlayer.paint(g2d);
        ourOpponent.paint(g2d);
        g2d.setColor(Color.PINK);
        theBall.paint(g2d);
        second.paint(g2d);
    }

    public void move(){
        theBall.move();
        second.move();
        ourPlayer.move();
        ourOpponent.move();
    }

}
