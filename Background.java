import java.awt.Image;
import java.awt.event.KeyEvent;

public class Background {
    private Image image;
    Background(){
    	
    }
    public Image getImage () {

        if (image == null) {
            image = Util.loadImage("lib/bg.png");     
        }
        
        return image;
    }
}
