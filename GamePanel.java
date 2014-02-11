import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    private Bird bird;

    public GamePanel () {
        Game game = new Game();
        bird = game.bird;

        new Thread(this).start();
    }

    public void update () {
        repaint();
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);
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
