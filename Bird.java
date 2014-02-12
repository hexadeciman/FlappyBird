public class Bird {

    public int x;
    public int y;
    public int width;
    public int height;
    public int gravity;

    public Bird () {
        x = 100;
        y = 300;
        width = 40;
        height = 40;
        gravity = 2;
    }

    //method that causes bird to fall
    public void update() {
        y += gravity;
    }
}
