import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;

public class Player {

    int x = 250;
    int y = 600;
    int xa = 0;
    int ya = 0;
    int standardXaOrYa = 3;
    int width = 100;
    int height = 10;

    public Player() {
    }

    public void move() {
        x = x + xa;
        // y = y + ya; in case you want to be able to go up and down
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, y, width,height);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && x + xa > 0) {
            xa = standardXaOrYa * -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.xa = standardXaOrYa;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            ya = standardXaOrYa * -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ya = standardXaOrYa;
        }
        if (e.getKeyCode() == KeyEvent.VK_1 && standardXaOrYa < 10){
            standardXaOrYa++;
        }
        if (e.getKeyCode() == KeyEvent.VK_2 && standardXaOrYa > 1){
            standardXaOrYa--;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            ya = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ya = 0;
        }
    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);
    }

}
