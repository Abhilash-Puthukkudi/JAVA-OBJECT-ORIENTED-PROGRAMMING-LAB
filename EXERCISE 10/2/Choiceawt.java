/*2. Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s choice.
*/

import java.awt.*;
import java.awt.event.*;

public class Choiceawt extends Frame
implements ItemListener {
	Choice shapes;
	String msg = "";
	String shape;

	public Choiceawt() {

	// Use a flow layout.
	setLayout(new FlowLayout());
	// Create choice lists.
	shapes = new Choice();

	// Add items to shapes list.
	shapes.add("Select a Shape");
	shapes.add("Rectangle");
	shapes.add("Triangle");
	shapes.add("Square");
	shapes.add("Circle");

	// Add choice lists to window.
	add(shapes);

	// Add item listeners.
	shapes.addItemListener(this);

	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

public void itemStateChanged(ItemEvent ie) {
	shape=shapes.getSelectedItem();
	repaint();
}

// Display current selections.
public void paint(Graphics g) {

	msg="SELECTED SHAPE : ";
	msg += shapes.getSelectedItem();
  
	if(shape == "Rectangle") {
		g.drawString(msg, 20, 120);
		g.drawRect(80, 150, 80, 50); //draw rectangle
	}
	else if(shape == "Triangle") {
		g.drawString(msg, 20, 120);
		int x[]={150,40,240};
		int y[]={150,200,200};
		g.drawPolygon(x,y,3);	
    }  //draw triangle
	else if(shape == "Square") {
		g.drawString(msg, 20, 120);
		g.drawRect(100, 150, 50, 50); //draw square
	}
	else if(shape == "Circle") {
		g.drawString(msg, 20, 120);
		g.drawOval(100, 150, 50, 50); //draw circle
	}
}

public static void main(String[] args) {
	Choiceawt appwin = new Choiceawt();

		appwin.setSize(new Dimension(280, 280));
		appwin.setTitle("Shape Choice");
		appwin.setVisible(true);
	}
}
