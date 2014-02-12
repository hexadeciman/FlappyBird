public class Game {
    
    public Bird bird;

    public Game () {
        bird = new Bird();
    }

    public void update(){
    	bird.update();
    }
}
