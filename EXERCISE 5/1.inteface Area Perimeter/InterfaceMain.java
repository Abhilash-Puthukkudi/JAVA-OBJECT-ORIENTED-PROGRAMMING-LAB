//Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle 
//and Rectangle which implements the above interface. Create a menu driven program to find area and
//perimeter of objects.

import java.util.Scanner;

interface CalculateInterface {
    
    //constant varible
    static double PI = Math.PI;
    
    //methods
    void area();
    void perimeter();
}


class Rectangle implements CalculateInterface{
    //class varibles
    int length, width;
    
    //constructor
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    //implementing methods
    public void area(){ 
        System.out.println("AREA : "+(length*width));
    }
    
    public void perimeter(){
        System.out.println("PERIMETER : "+(2*(length+width)));
        }

} 

class Circle implements CalculateInterface{
    //class varibles
    double radius;

    //constructor
    Circle(double radius){
        this.radius = radius;
    }

    //implementing methods
    public void area(){
        System.out.format("AREA : %.3f \n",(PI*(radius*radius)));
    }
    public void perimeter(){
        System.out.format("PERIMETER : %.3f \n",(2*PI*radius));
    }

}

//main class
class InterfaceMain{
    public static void main(String args[]) {
        //Scanner object creation
        Scanner in = new Scanner(System.in);

        //reading length and width
        System.out.print("ENTER LENGTH OF RECTANGLE : ");
        int length =Integer.parseInt(in.nextLine()); 
        System.out.print("ENTER WIDTH OF RECTANGLE : ");
        int width = Integer.parseInt(in.nextLine());
        //object creation
        Rectangle R = new Rectangle(length,width);
        //calling methods
        R.area();
        R.perimeter();

        // reading radius
        System.out.print("ENTER RADIUS : ");
        double radius = Double.parseDouble(in.nextLine());
        //object creation
        Circle C = new Circle(radius);
        //calling methods
        C.area();
        C.perimeter();

    }

}


/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5$ java InterfaceMain
ENTER LENGTH OF RECTANGLE : 10
ENTER WIDTH OF RECTANGLE : 5
AREA : 50
PERIMETER : 30
ENTER RADIUS : 1.3
AREA : 5.309 
PERIMETER : 8.168 

*/
//Verified
