/*5. Implement a simple calculator using AWT components.*/



import java.awt.*;
import java.awt.event.*;

 class Calculator extends Frame implements ActionListener {
	TextField disply;
	int value1=0,value2=0,ans;
    String operator;
    Button bplus,bmin,bmul,bdiv,beq,bclear;
    Label screen;
    
	public Calculator() {

        this.setLayout(new GridLayout(7,1));
        //crating buttons
        bplus = new Button("+");
        bmin  = new Button("-");
        bmul  = new Button("x");
        bdiv  = new Button("/");
        beq   = new Button("=");
      
        //seting font of disply
        disply = new TextField(10);
        Font font = new Font("SansSerif", Font.BOLD, 25);
        disply.setFont(font);
        disply.setText("0");

        //to show enterd values and choosen opertor
        screen = new Label("0", Label.RIGHT); 
        Font font1 = new Font("SansSerif", Font.BOLD, 15);
        screen.setFont(font1);

        // adding to window
        add(disply); // text filed to enter values and disply answer
        add(screen); // label to show enterd values and operation
        add(bplus);  // buttons
        add(bmin);
        add(bdiv);
        add(bmul);
        add(beq);

// Add action event handlers.
    bplus.addActionListener(this);
    bmin.addActionListener(this);
    bdiv.addActionListener(this);
    bmul.addActionListener(this);
    beq.addActionListener(this);

 	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}



// Handle button action events.
public void actionPerformed(ActionEvent ae) {
     String btn = ae.getActionCommand();

     if(btn=="+"){
         value1=Integer.parseInt(disply.getText()); // storing first value
         operator="+"; //storing operator
         screen.setText(value1+" + "); // opertion screen updating
         disply.setText("0");//clearing screen
        
     }
     else if(btn=="-"){
        value1=Integer.parseInt(disply.getText()); // storing first value
        operator="-"; //storing operator
        screen.setText(value1+" - ");
        disply.setText("0");//clearing screen
       
    }
    else if(btn=="x"){
        value1=Integer.parseInt(disply.getText()); // storing first value
        operator="x"; //storing operator
        screen.setText(value1+" x ");
        disply.setText("0"); //clearing screen
       
    }
    else if(btn=="/"){
        value1=Integer.parseInt(disply.getText()); // storing first value
        operator="/";//storing operator
        screen.setText(value1+" / ");
        disply.setText("0"); //clearing screen
       
    }
    else if(btn =="="){
        value2=Integer.parseInt(disply.getText()); //stroing second value
        disply.setText("");//clearing screen
        screen.setText(value1+""+operator+""+value2);

        // switching based on opertor and calculating answer
        switch(operator){
            case "+":ans=value1+value2; 
                     disply.setText(String.valueOf(ans));
                     break;
            case "-":ans=value1-value2;
                     disply.setText(String.valueOf(ans));
                     break;
            case "x":ans=value1*value2;
                     disply.setText(String.valueOf(ans));
                     break;
            case "/":ans=value1/value2;
                     disply.setText(String.valueOf(ans));
                     break;                           
            }
       }
    }

public static void main(String[] args) {
	Calculator Calcuapp = new Calculator();
    Calcuapp.setSize(new Dimension(300, 300));
    Calcuapp.setTitle("Calculator");
    Calcuapp.setVisible(true);
	}
}




