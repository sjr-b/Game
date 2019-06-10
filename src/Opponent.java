import java.awt.event.KeyEvent;

public class Opponent extends Player {

    public Opponent(){
        x = 250;
        y = 50;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = standardXaOrYa * -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = standardXaOrYa;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            ya = standardXaOrYa * -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            ya = standardXaOrYa;
        }
        if (e.getKeyCode() == KeyEvent.VK_PLUS || e.getKeyCode() == KeyEvent.VK_EQUALS && standardXaOrYa < 10){
            standardXaOrYa++;
        }
        if (e.getKeyCode() == KeyEvent.VK_MINUS && standardXaOrYa > 1){
            standardXaOrYa--;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            ya = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            ya = 0;
        }
    }

}
