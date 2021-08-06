// 4. Create a Graphics package that has classes and interfaces for figures
// Rectangle, Triangle, Square and Circle. Test the package by finding the
// area of these figures.
import Graphics.*; //package graphics imported
import java.util.Scanner;

class PackageMain{
   public static void main(String[] args) {

    Scanner in= new Scanner(System.in); 
    
    //reading length and width
     System.out.print("ENTER LENGTH OF RECTANGLE : ");
     int length = Integer.parseInt(in.nextLine());
     System.out.print("ENTER LENGTH OF RECTANGLE : ");
     int width = Integer.parseInt(in.nextLine());
    //object creation and calling area function
     Rectangle R = new Rectangle(length,width);
     R.area();
    //reading side 
     System.out.print("ENTER SIDE OF SQUARE : ");
     int side = Integer.parseInt(in.nextLine());
     //object creation and calling area function
     Square S = new Square(side);
     S.area();
     //reading base and height
     System.out.print("ENTER BASE OF TRIANGLE : ");
     double base = Double.parseDouble(in.nextLine());
     System.out.print("ENTER HEIGHT OF TRIANGLE : ");
     double height = Double.parseDouble(in.nextLine());
     //object creation and calling area function
     Triangle T = new Triangle(base,height);
     T.area();
     //reading radious
     System.out.print("ENTER RADIOUS OF SQUARE : ");
     int radious = Integer.parseInt(in.nextLine());
     //object creation and calling area function
     Circle C = new Circle(radious);
     C.area();



        
    } 
        
    
}


/*

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/4.package graphics$ javac PackageMain.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/4.package graphics$ java PackageMain
ENTER LENGTH OF RECTANGLE : 10
ENTER LENGTH OF RECTANGLE : 2
Area : 20
ENTER SIDE OF SQUARE : 5
Area : 25
ENTER BASE OF TRIANGLE : 12
ENTER HEIGHT OF TRIANGLE : 5
Area : 30.0
ENTER RADIOUS OF SQUARE : 2
Area : 12.566



*/


