import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable {

    private Bird bird;
    private Game game;
    private int counter;
    public GamePanel () {
        game = new Game();
        bird = game.bird;
        counter = 50;
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
                
                //if we fly .. wait a bit before we fall again 
                //so just a counter decrementing..

                if(bird.gravity==-2){
                    counter--;
                }
                //if the counter reaches 0 start falling and reset the counter for the next time :)
                if(counter==0){
                    bird.gravity=2;
                    counter =50;
                }
                
                Thread.sleep(20);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
