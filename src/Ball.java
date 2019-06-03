import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;

public class Ball {

    int x = 250;
    int y = 20;
    int xa = 2;
    int ya = 2;
    private Player ourPlayer;
    private Player opponent;

    public Ball(Player player, Player opp){
        ourPlayer = player;
        opponent = opp;
    }

    public Ball(Player player, Player opp, int adjustment){
        ourPlayer = player;
        opponent = opp;
        x -= 5 * adjustment;
        y = 80;
    }

    public void paint(Graphics2D g) {
        g.fillOval(x,y,20,20);
    }

    public void move() {
        checkCollisions();
        x = x + xa;
        y = y + ya;
    }

    public void checkCollisions(){
        if(x == 680 || x == 0){
            xa = -xa;
        }
        if(y == 0){
            ya = -ya;
        }
        if(new Rectangle(x,y,20,20).intersects(ourPlayer.getRectangle()) || new Rectangle(x, y, 20, 20).intersects(opponent.getRectangle())){
            ya = -ya;
        }
        if(y == 670){
            ya = -ya;
        }
    }

}
