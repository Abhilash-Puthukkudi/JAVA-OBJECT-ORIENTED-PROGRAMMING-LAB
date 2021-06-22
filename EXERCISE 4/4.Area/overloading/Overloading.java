import java.util.Scanner;
import java.lang.Math;
class OverLoading
{
  //overloaded methods
  static double Area( double side ){ return ( side*side); }   //Square 

  static double Area( double length , double width ){ return ( length*width ); } //rectangle

  static double Area( double a, double b , double c){ //triangle
        //semiperimeter 
        double s = (a+b+c)/2;     
        return Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5); 
     }

    public static void main(String args[]){
    
         Scanner in = new Scanner(System.in);
     
      // area of square
         System.out.print("ENTER SIDE OF SQUARE        : ");
         double side = in.nextDouble();
         System.out.println("AREA OF SQUARE              : "+Area(side));
     
      //Area of Rectangle
         System.out.print("ENTER LENGTH OF RECTANGLE   : ");
         double length = in.nextDouble();
         System.out.print("ENTER WIDTH OF RECTANGLE    : ");
         double width  = in.nextDouble();
         System.out.println("AREA OF SQUARE            : "+Area(length , width));
         
      //Area of Triangle
         System.out.print("ENTER 1 SIDE OF TRIANGLE    : ");
         double side1 = in.nextDouble();
         System.out.print("ENTER 2 SIDE OF TRIANGLE    : ");
         double side2 = in.nextDouble();
         System.out.print("ENTER 3 SIDE OF TRIANGLE    : ");
         double side3 = in.nextDouble();
         System.out.println("AREA OF SQUARE            : "+Area( side1 , side2 , side3 ));
     
       

}
}



/*
output
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/4.Area/overloading/new$ javac Overloading.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/4.Area/overloading/new$ java OverLoading
ENTER SIDE OF SQUARE        : 5
AREA OF SQUARE              : 25.0
ENTER LENGTH OF RECTANGLE   : 10
ENTER WIDTH OF RECTANGLE    : 5
AREA OF SQUARE              : 50.0
ENTER 1 SIDE OF TRIANGLE    : 10
ENTER 2 SIDE OF TRIANGLE    : 10
ENTER 3 SIDE OF TRIANGLE    : 10
AREA OF SQUARE              : 43.30127018922193


*/
