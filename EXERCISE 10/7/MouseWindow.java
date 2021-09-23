/*
7. Develop a program to handle all mouse events and window events
8*/

import java.awt.*;
import java.awt.event.*;

public class MouseWindow extends Frame implements MouseListener, MouseMotionListener,WindowListener {

String msg,Wmsg="WINDOW EVENTS : ";
int mouseX = 0, mouseY = 0; // coordinates of mouse at first

public MouseWindow() {
    addWindowListener(this);  
    addMouseListener(this);
    addMouseMotionListener(this);
    
}


 //window activated
public void windowActivated(WindowEvent arg0) {  
    Wmsg= Wmsg+ " activated ";  
    repaint();
}  //window closed
public void windowClosed(WindowEvent arg0) {  
     Wmsg= Wmsg+ " closed ";  
    repaint();
}  // window closing
public void windowClosing(WindowEvent arg0) {  
     Wmsg= Wmsg+ " closing ";  
    dispose();  
    repaint();
}  
//window
public void windowDeactivated(WindowEvent arg0) {  
    Wmsg= Wmsg+ " deactivated "; 
   repaint(); 
}  
public void windowDeiconified(WindowEvent arg0) {  
    Wmsg= Wmsg+ " deiconified "; 
    repaint(); 
}  
public void windowIconified(WindowEvent arg0) {  
     Wmsg= Wmsg+ " iconified ";  
    repaint();
}  
public void windowOpened(WindowEvent arg0) {  
    Wmsg= Wmsg+ " opened ";  
    repaint();
}  





// Handle mouse clicked.
public void mouseClicked(MouseEvent me) {
msg = msg + " click received";
repaint();
}
// Handle mouse entered.
public void mouseEntered(MouseEvent me) {
mouseX = 100;
mouseY = 100;
msg = "Mouse entered.";
repaint();
}
// Handle mouse exited.
public void mouseExited(MouseEvent me) {
mouseX = 100;
mouseY = 100;
msg = "Mouse exited.";
repaint();
}

// Handle button pressed.
public void mousePressed(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "Button down";
repaint();
}
// Handle button released.
public void mouseReleased(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "Button Released";
repaint();
}
// Handle mouse dragged.
public void mouseDragged(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "*" + " mouse at " + mouseX + ", " + mouseY;
repaint();
}
// Handle mouse moved.
public void mouseMoved(MouseEvent
me) {
msg = "Moving mouse at " + me.getX()
+ ", " + me.getY();
repaint();
}
// Display msg in the window at current X,Y location.
public void paint(Graphics g) {
g.drawString(Wmsg,20, 90);
g.drawString(msg, mouseX, mouseY);
}
public static void main(String[] args) {
MouseWindow windowmosue = new MouseWindow();

windowmosue.setSize(new Dimension(300, 300));
windowmosue.setTitle("Mouse&Window Events");
windowmosue.setVisible(true);
}
}
Verified
