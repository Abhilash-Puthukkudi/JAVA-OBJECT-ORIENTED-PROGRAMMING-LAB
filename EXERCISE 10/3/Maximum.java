// 3. Program to find maximum of three numbers using AWT.


import java.awt.*;
import java.awt.event.*;

 class Maximum extends Frame implements ActionListener {
	TextField num1,num2,num3;
	int NUM1,NUM2,NUM3,max;
    Button maximum;
    Label resultlabel;
	

	public Maximum() {

	// Use a flow layout.
    setLayout(new FlowLayout());

// Create controls.
    Label num1label = new Label("Enter number 1 : ",Label.RIGHT);
    Label num2label = new Label("Enter number 2 : ",Label.RIGHT);
    Label num3label = new Label("Enter number 3 : ",Label.RIGHT);
    resultlabel = new Label("",Label.RIGHT);

    num1 = new TextField(3);
    num2 = new TextField(3);
    num3 = new TextField(3);

    maximum = new Button("MAXIMUM");

// Add the controls to the frame.
    add(num1label);
    add(num1);
    add(num2label);
    add(num2);
    add(num3label);
    add(num3);
    add(maximum);
    add(resultlabel);

// Add action event handlers.
    maximum.addActionListener(this);

	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

// Handle button action events.
public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if(str.equals("MAXIMUM")) {
    
        NUM1=Integer.parseInt(num1.getText());
        NUM2=Integer.parseInt(num2.getText());
        NUM3=Integer.parseInt(num3.getText());

        if(NUM1 > NUM2 && NUM1 > NUM3){
              max = NUM1;
              resultlabel.setText("maximum is : "+max);
        }
        else if(NUM2 > NUM1 && NUM2 > NUM3){
              max = NUM2;
              resultlabel.setText("maximum is : "+max);
        }
        else{
              max = NUM3;
              resultlabel.setText("maximum is : "+max);
        }
    }
    
    }

public static void main(String[] args) {
	Maximum maxapp = new Maximum();

		maxapp.setSize(new Dimension(280, 280));
		maxapp.setTitle("Maximum");
		maxapp.setVisible(true);
	}
}
Verified
