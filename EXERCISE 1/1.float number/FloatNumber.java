/*1. Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000*/



// importing scanner class
import java .util.Scanner ;

class FloatNumber{

  public static void main(String[] args) {
  	 
  	 //creating scanner object
     Scanner in = new Scanner(System.in);
     
     Float number; //varible declared

     System.out.println("ENTER A NUMBER : ");
     number=in.nextFloat();

     if(number==0){
     	System.out.println("ZERO\n");
     }
     else if (number>0) {
     	if (number<1){
     		System.out.print("SMALL ");
     	}
     	else if(number>100000){
     		System.out.print("LARGE ");
     	}
    
     	System.out.println("POSITIVE\n");
     	
     }
     else if(number<0){
     	System.out.println("NEGATIVE\n");
     }
     	}


  }


/*
OUTPUT
------

LARGE POSITIVEablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1$ javac FloatNumber.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1$ java FloatNumber
ENTER A NUMBER : 
0
ZERO

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1$ java FloatNumber
ENTER A NUMBER : 
0.22
SMALL POSITIVE

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1$ java FloatNumber
ENTER A NUMBER : 
-3
NEGATIVE

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1$ java FloatNumber
ENTER A NUMBER : 
100016
LARGE POSITIVE



*/