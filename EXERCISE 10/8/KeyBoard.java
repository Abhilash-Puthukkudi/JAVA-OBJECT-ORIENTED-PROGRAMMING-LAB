//8. Develop a program to handle Key events.

import java.awt.*;
import java.awt.event.*;

public class KeyBoard extends Frame implements KeyListener{

	String currentkey,keystatus; 
	
	public KeyBoard() {

		addKeyListener(this);

		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		  }
	     });
  }
	// Handle a key press.
	public void keyPressed(KeyEvent ke) {
		keystatus= " Event : Key pressed!!";
		repaint();
	}

	// Handle a key release.
	public void keyReleased(KeyEvent ke) {
		keystatus = "Event : Key Lifted!!";
		repaint();
	}
	// Handle key typed.
	public void keyTyped(KeyEvent ke) {
		currentkey= "Pressed KEY : "+ke.getKeyChar();
		repaint();
	}

	// Display keystrokes.
	public void paint(Graphics g) {
        
		g.drawString(keystatus, 20, 100);
		g.drawString(currentkey,20, 50);
	}

    

	public static void main(String[] args) {
		KeyBoard Keyapp = new KeyBoard();
		Keyapp.setSize(new Dimension(200, 150));
		Keyapp.setTitle("key press!!");
		Keyapp.setVisible(true);
	}
}


