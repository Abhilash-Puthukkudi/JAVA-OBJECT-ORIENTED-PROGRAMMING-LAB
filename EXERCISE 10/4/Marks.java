// 4. Find the percentage of marks obtained by a student in 5 subjects.
// Display a happy face if he secures above 50% or a sad face if
// otherwise.


import java.awt.*;
import java.awt.event.*;

 class Marks extends Frame implements ActionListener {
	TextField m1,m2,m3,m4,m5,mt;
	int M1,M2,M3,M4,M5;
    Double PERCENTAGE,MT;
    Button calculate;
    
	
	public Marks() {
       
        setLayout(new FlowLayout());
         setBackground(Color.LIGHT_GRAY);

// Create controls.
    Label totalmarklabel = new Label(" Maximum Mark of Each Subject : ",Label.RIGHT);
    Label mark1label = new Label("Enter Marks obtaind in Subject 1 : ",Label.RIGHT);
    Label mark2label = new Label("Enter Marks obtaind in Subject 2 : ",Label.RIGHT);
    Label mark3label = new Label("Enter Marks obtaind in Subject 3 : ",Label.RIGHT);
    Label mark4label = new Label("Enter Marks obtaind in Subject 4 : ",Label.RIGHT);
    Label mark5label = new Label("Enter Marks obtaind in Subject 5 : ",Label.RIGHT);

    mt = new TextField(4); 
    m1 = new TextField(4);
    m2 = new TextField(4);
    m3 = new TextField(4);
    m4 = new TextField(4);
    m5 = new TextField(4);

    calculate = new Button("calculate");

// Add the controls to the frame.
   
    add(totalmarklabel);
    add(mt);
    add(mark1label);
    add(m1);
    add(mark2label);
    add(m2);
    add(mark3label);
    add(m3);
    add(mark4label);
    add(m4);
    add(mark5label);
    add(m5);
    add(calculate);

// Add action event handlers.
    calculate.addActionListener(this);

	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

// Handle button action events.
public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if(str.equals("calculate")) {
       
        M1=Integer.parseInt(m1.getText());
        M2=Integer.parseInt(m2.getText());
        M3=Integer.parseInt(m3.getText());
        M4=Integer.parseInt(m4.getText());
        M5=Integer.parseInt(m5.getText());
        MT=Double.parseDouble(mt.getText());
        
        PERCENTAGE = (M1+M2+M3+M4+M5)/ (MT*5) * 100; //percentage calculation

        repaint();

    }
    
    }

    // Display current selections.
public void paint(Graphics g) {

	if(PERCENTAGE>50) {
        
        g.setFont(new Font("default", Font.BOLD, 19));
        g.setColor(Color.GREEN);
        g.drawString("PASS",80,200);
        g.setFont(new Font("default", Font.BOLD, 15));
		g.drawString("PERCENTAGE : "+PERCENTAGE,80,220);
        // Oval for face outline
        g.setColor(Color.YELLOW);
        g.fillOval(260, 240, 200, 200);
  
        // Ovals for eyess
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(380, 300, 15, 15);
        g.fillOval(320, 300, 15, 15);
  
        // Arc for the smile
        g.setColor(Color.WHITE);
        g.fillArc(300, 350, 120, 60, 180, 180);

	}
    else if(PERCENTAGE<=50){
      
        g.setFont(new Font("default", Font.BOLD, 19));
        g.setColor(Color.RED);
        g.drawString("FAILED",80,200);
        g.setFont(new Font("default", Font.BOLD, 15));
		g.drawString("PERCENTAGE : "+PERCENTAGE,80,230);
        // Oval for face outline
        g.setColor(Color.YELLOW);
        g.fillOval(260, 240, 200, 200);
  
        // Ovals for eyess
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(380, 300, 15, 15);
        g.fillOval(320, 300, 15, 15);
  
        // Arc for the smile
        g.setColor(Color.BLACK);
        g.drawArc(300, 350, 120, 60, 0, 180);

    }
}

public static void main(String[] args) {
	Marks maxapp = new Marks();

		maxapp.setSize(new Dimension(500, 500));
		maxapp.setTitle("Maximum");
		maxapp.setVisible(true);
	}
}