import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class GamePanel extends JPanel implements Runnable {

    private Bird bird;
    private Game game;
    private ArrayList<Tube> tubes;
    public Background bg;
    public GamePanel () {
        game = new Game();
        bird = game.bird;
        bg = new Background();
        tubes = new ArrayList<Tube>();
        tubes.add(new Tube());
        new Thread(this).start();
    }

    public void update () {
        
        game.update();
        if(!bird.collision){
            for (int i=0; i < tubes.size(); i++) {
                tubes.get(i).update();
            }    
        }
        
        repaint();
    }

    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.drawImage(bg.getImage(), 0,0, null);
        
        for (int i=0; i < tubes.size(); i++) {
            g.drawImage(tubes.get(i).getImage(), tubes.get(i).x, tubes.get(i).y, null);
            if(tubes.get(i).spawnedOneTube==0 && tubes.get(i).x<300){
                        tubes.add(new Tube());
                        tubes.get(i).spawnedOneTube=1;
            }
            if(tubes.get(i).x<-100){
                tubes.remove(i);
            }
        }

        g.drawImage(bird.getImage(), bird.x, bird.y, null);
        g.drawOval(bird.x,bird.y,45,35);
    }
    
    public void run () {
        try {
            while (true) {
                update();
                Thread.sleep(23);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
