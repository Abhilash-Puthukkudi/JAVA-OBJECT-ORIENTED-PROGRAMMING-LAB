//1. Program to draw Circle, Rectangle, Line

import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo extends Frame {

	public GraphicsDemo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}


	public void paint(Graphics g) {

		// Draw line
		g.setColor(Color.green);
		g.drawLine(20, 40, 100, 100);
		
		// Draw Rectangle
		g.setColor(Color.blue);
		g.fillRect(20, 150, 60, 50);

		
		// Draw Circle
		g.setColor(Color.red);
		g.drawOval(20, 250, 50, 50);


	}

	public static void main(String[] args) {
		GraphicsDemo appwin = new GraphicsDemo();

		appwin.setSize(new Dimension(340, 260));
		appwin.setTitle("GraphicsDemo");
		appwin.setVisible(true);
	}
}

