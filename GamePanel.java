import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Bird bird;

    public GamePanel () {
        Game game = new Game();
        bird = game.bird;
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);
    }
}
