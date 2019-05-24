import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;

public class Game extends JPanel {

    public static Ball theBall;
    public static Ball second;
    public static Player ourPlayer;

    public Game(Ball ball, Ball ball2, Player player) {
        theBall = ball;
        second = ball2;
        ourPlayer = player;

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                ourPlayer.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ourPlayer.keyPressed(e);
            }
        });
        setFocusable(true);
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.DARK_GRAY);
        ourPlayer.paint(g2d);
        g2d.setColor(Color.LIGHT_GRAY);
        theBall.paint(g2d);
        g2d.setColor(Color.GRAY);
        second.paint(g2d);
    }

    public void move(){
        ourPlayer.move();
        theBall.move();
        second.move();
    }

}
