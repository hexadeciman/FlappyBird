import java.awt.Image;
import java.awt.event.KeyEvent;

public class Tube {

    public int x;
    public int y;
    public boolean currentEnnemy;
    public int spawnedOneTube;

    private Image image;
    
    public Tube () {
        x=500;
        y = 0;
        spawnedOneTube=0;
    }

    public void update () {
        x = x-2;
    }

    public Image getImage () {

        if (image == null) {
            image = Util.loadImage("lib/tube.png");     
        }
        
        return image;
    }
}
