import java.awt.event.KeyEvent;

public class Game {
    
    public Keyboard keyboard;
    public Bird bird;

    public Game () {
        keyboard = Keyboard.getInstance();
        bird = new Bird();
    }

    public void update(){
    	bird.update();

        //if we press any key .. we fly
        if (keyboard.isDown(KeyEvent.VK_SPACE)) {
                    bird.gravity=-2;
                    System.out.println(bird.gravity);
        }
    }
}
