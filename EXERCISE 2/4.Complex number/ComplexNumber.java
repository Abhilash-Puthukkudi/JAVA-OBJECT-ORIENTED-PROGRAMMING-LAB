//4. Add complex numbers

import java.util.Scanner;

class Complex{//class Complex

int REAL,IMG;


    Complex() //default constructor
    {
        REAL = 0;
        IMG  = 0;
    }

    Complex(int real , int img)
    { // constructor overloaded for passing values

         REAL = real;
         IMG  = img;
        
    }


    void display(){// printing complex number 
 
         if(IMG<0)    // displaying +/- sign
          System.out.print(REAL+""+IMG+"i\n\n");
         else
          System.out.print(REAL+" + "+IMG+"i\n\n");
   }



 Complex add(Complex O1, Complex O2){ //add function of Complex type will return Complex class object
     Complex result =new Complex();

     result.REAL = O1.REAL + O2.REAL ;
     result.IMG  = O1.IMG + O2.IMG ;

   return result;
   }

}

//main
class ComplexNumber{

 public static void main(String args[]){
 
    Scanner in = new Scanner(System.in);
 
    // reading first complex number
    System.out.print("ENTER REAL PART OF 1ST COMPLEX NUMBER       : ");
    int real1 = in.nextInt();

    System.out.print("ENTER IMAGINARY PART OF 1ST COMPLEX NUMBER  : ");
    int img1 = in.nextInt();


    //1st complex number object created
    Complex NUMBER1 = new Complex(real1,img1);

    System.out.print("\nENTERD COMPLEX NUMBER : ");
    NUMBER1.display(); //displaying 1st complex number

    // reading second complex number
    System.out.print("ENTER REAL PART OF 2nd COMPLEX NUMBER        : ");
    int real2 = in.nextInt();

    System.out.print("ENTER IMAGINARY PART OF 2nd COMPLEX NUMBER   : ");
    int img2 = in.nextInt();
  

    //2nd complex number object created
    Complex NUMBER2 = new Complex(real2,img2);

    System.out.print("\nENTERD COMPLEX NUMBER : ");
    NUMBER2.display(); 


    //created a RESULT object to call add function and then store the returning object

    Complex RESULT=new Complex(); 

    RESULT=RESULT.add(NUMBER1,NUMBER2);//returning object assigned to result object
  
    System.out.print("\nSUM = ");
    RESULT.display();//printing result

 
}


}


/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/4.Complex number$ javac ComplexNumber.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/4.Complex number$ java ComplexNumber
ENTER REAL PART OF 1ST COMPLEX NUMBER       : 10
ENTER IMAGINARY PART OF 1ST COMPLEX NUMBER  : 20

ENTERD COMPLEX NUMBER : 10 + 20i

ENTER REAL PART OF 2nd COMPLEX NUMBER        : 5
ENTER IMAGINARY PART OF 2nd COMPLEX NUMBER   : -8  

ENTERD COMPLEX NUMBER : 5-8i


SUM = 15 + 12i



*/



