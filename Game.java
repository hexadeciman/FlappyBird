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

        if (keyboard.isDown(KeyEvent.VK_SPACE)) {
            System.out.println("space is down!");
        }
    }
}
