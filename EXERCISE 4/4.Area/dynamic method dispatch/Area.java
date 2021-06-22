import java.util.Scanner;

class Shape{

  Shape()
  {}
  

  void area()
  {
   System.out.println("Area Of Shapes");
  }


}

class Square extends Shape{
  int side;
  Square(int side){
    this.side = side ;
  } 
  
  void area()
  {
   System.out.println("AREA OF SQUARE : "+(side*side));
  }

}

class Rectangle extends Shape{
  
  int width , length ;

  Rectangle(int width, int length){
    this.width  =  width ;
    this.length =  length ;
  }  

  void area(){
 
   System.out.println("AREA OF SQUARE : "+(width*length));

  }

}

//main class
class Area{

    public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);

    Shape shape = new Shape();               // shape object created


    Shape objectRef;         // created object reference  varible
    
    objectRef = shape ;      // assiging shape object to object referance varible 
    objectRef.area();        // displaying area
 
    System.out.print("ENTER RECTANGLE WIDTH  : ");
    int width  = in.nextInt();
    System.out.print("ENTER RECTANGLE HEIGHT : ");
    int height = in.nextInt();  

    Rectangle rectangle = new Rectangle( width , height );  // Rectangle object created
    
    objectRef  = rectangle ; // assiging rectangle object to referance varible 
    objectRef.area();        // displaying area   
 
    System.out.print("ENTER SQAURE SIDE      : ");
    int side = in.nextInt();
 
    Square square = new Square(side);        // Square object created
    
    objectRef = square ;     // assiging square object to referance varible
    objectRef.area();        // displaying area

    }

}


/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/4.Area$ javac Area.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/4.Area$ java Area
Area Of Shapes
ENTER RECTANGLE WIDTH  : 10
ENTER RECTANGLE HEIGHT : 5 
AREA OF SQUARE : 50
ENTER SQAURE SIDE      : 5
AREA OF SQUARE : 25

*/

