/*
6. Using 2D graphics commands in an Applet, construct a house.
On mouse click event, change the color of the door from blue to
red.
*/



import java.awt.*;
import java.awt.event.*;

 class HomeDraw extends Frame implements MouseListener, MouseMotionListener {

	
	
       Color color = Color.BLUE;	
      	public HomeDraw() {
		addMouseListener(this);
		addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		  }
	     });
       
       
		
	}
										       
    // Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
       if(color==Color.BLUE)  //switching colors
         color =Color.RED;	
       else
         color=Color.BLUE;						
		repaint();
	}

									         
	public void mouseEntered(MouseEvent me) {
	  // Handle mouse entered.
	}

									
	public void mouseExited(MouseEvent me) {
		// Handle mouse exited.
		
	}

			                        
	public void mousePressed(MouseEvent me) {
		// Handle button pressed.
	}

						     		
	public void mouseReleased(MouseEvent me) {
		// Handle button released.
	}
	
									
	public void mouseDragged(MouseEvent me) {
		// Handle mouse dragged.

	}

								   
	public void mouseMoved(MouseEvent me) {
		// Handle mouse moved.
	}
					
	public void paint(Graphics g) {
		
            g.setColor(Color.LIGHT_GRAY);
			g.fillRect(240, 200, 250, 250); //walls

	        g.setColor(Color.YELLOW); //WINDOW1
            g.fillRect(260, 240, 50, 50);

            g.setColor(Color.YELLOW); //WINDOW2
            g.fillRect(420, 240, 50, 50);

			g.setColor(color);				
  			g.fillRect(330, 300, 70, 140); //door
			                               
			g.setColor(Color.DARK_GRAY);  // roof
			int x[]={350,190,540};
			int y[]={80,200,200};
			g.fillPolygon(x,y,3);
	}


	public static void main(String[] args) {
		HomeDraw Homeapp = new  HomeDraw();

		Homeapp.setSize(new Dimension(700,500));
		Homeapp.setTitle("HOME");
		Homeapp.setVisible(true);
	}
}
Verified


