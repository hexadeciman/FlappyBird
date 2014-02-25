import java.awt.Image;
import java.awt.event.KeyEvent;

public class Bird {

    public int x;
    public int y;
    public int width;
    public int height;
    public boolean collision;
    // y velocity
    public double yvel;
    public double gravity;

    // delay between key presses
    private int jumpDelay;

    private Image image;
    private Keyboard keyboard;

    public Bird () {
        x = 100;
        y = 200;
        yvel = 0;
        width = 40;
        height = 40;
        gravity = 0.6;
        jumpDelay = 0;
        collision = false;
        keyboard = Keyboard.getInstance();
    }
    private void checkCollision(){
        //System.out.println(y);
        if(y > 380){
            collision = true;
        }
    }

    public void update () {
        yvel += gravity;

        if (jumpDelay > 0)
            jumpDelay--;

        if (keyboard.isDown(KeyEvent.VK_SPACE) && jumpDelay <= 0) {
            yvel = -10;
            jumpDelay = 10;
        }

        checkCollision();
        if(!collision){
            y += (int)yvel;
        }

            
    }

    public Image getImage () {

        if (image == null) {
            image = Util.loadImage("lib/bird.png");     
        }
        
        return image;
    }
}
