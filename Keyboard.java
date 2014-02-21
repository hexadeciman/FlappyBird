import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	private static Keyboard instance;

	private boolean[] keys;
	
	private Keyboard() {
		keys = new boolean[256];
	}

	public static Keyboard getInstance() {

		if (instance == null) {
			instance = new Keyboard();
		}
		
		return instance;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() >= 0 && e.getKeyCode() < keys.length) {
			keys[e.getKeyCode()] = true;
		}
	}
	
	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvent e) {

	}

	public boolean isDown(int n) {
		//this will just check if we pressed any key
		if (n >= 0 && n < keys.length) {
			if(keys[n]){
				keys[n]=false;
				return true;
			}
		}
		return false;
	}
}
