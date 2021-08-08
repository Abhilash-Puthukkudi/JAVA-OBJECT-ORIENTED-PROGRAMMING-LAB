//5. Create an Arithmetic package that has classes and interfaces for the
//4 basic arithmetic operations. Test the package by implementing all
//operations on two given numbers

import java.util.Scanner;
import Operation.*; // importing package Operation

class ArithmeticMain{

    public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("ENTER NUMBER 1 : ");
    int number1 = in.nextInt();
    System.out.print("ENTER NUMBER 2 : ");
    int number2 = in.nextInt();
    
    // object of opertaion classes declared
    Add A = new Add();
    Mul M = new Mul();
    Div D = new Div();
    Sub S = new Sub();
    
    //calculation printed
    System.out.println(number1+" + "+number2+" = "+A.addition(number1,number2));
    System.out.println(number1+" - "+number2+" = "+S.substraction(number1,number2));
    System.out.println(number1+" / "+number2+" = "+D.division(number1,number2));
    System.out.println(number1+" x "+number2+" = "+M.multiplication(number1,number2));
        
    }
}



/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5/Operation$ javac -d . opration.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5/Operation$ javac -d . Mul.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5/Operation$ javac -d . Sub.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5/Operation$ javac -d . Div.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5/Operation$ javac -d . Add.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5$ javac ArithmeticMain.java 
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/5$ java ArithmeticMain
ENTER NUMBER 1 : 100
ENTER NUMBER 2 : 20
100 + 20 = 120
100 - 20 = 80
100 / 20 = 5
100 x 20 = 2000




*/
//Verified
