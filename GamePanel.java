import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable {

    private Bird bird;
    private Game game;

    public GamePanel () {
        game = new Game();
        bird = game.bird;

        new Thread(this).start();
    }

    public void update () {
        game.update();
        repaint();
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.drawImage(bird.getImage(), bird.x, bird.y, null);
    }
    
    public void run () {
        try {
            while (true) {
                update();
                Thread.sleep(25);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
