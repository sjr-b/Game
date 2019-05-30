import java.awt.event.KeyEvent;

public class Opponent extends Player {

    public Opponent(){
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
        if (e.getKeyCode() == KeyEvent.VK_1 && standardXaOrYa < 10){
            standardXaOrYa++;
        }
        if (e.getKeyCode() == KeyEvent.VK_2 && standardXaOrYa > 1){
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
