/*4. Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/

import java.util.Scanner;

class Number{

    public static void main(String[] args) {

    //creating scanner object
    Scanner in = new Scanner (System.in);

    int a,b,c;
    //reading three numbers
    System.out.println("ENTER THREE NUMBERS");
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    if(c>b){
        if(b>a)
        System.out.println("INCREASING ORDER");
        else
        System.out.println("NEITHER INCREASING OR DECREASING ORDER");     
    }
    else if(a>b){
             if(b>c) 
             System.out.println("DECREASING ORDER");
             else
             System.out.println("NEITHER INCREASING OR DECREASING ORDER"); 
    }
    else
       System.out.println("NEITHER INCREASING OR DECREASING ORDER");



}
}



/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/4.numbers$ javac Number.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/4.numbers$ java Number
ENTER THREE NUMBERS
1
2
3
INCREASING ORDER

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/4.numbers$ java Number
ENTER THREE NUMBERS
50
40
10
DECREASING ORDER

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/4.numbers$ java Number
ENTER THREE NUMBERS
32
100
5
NEITHER INCREASING OR DECREASING ORDER


*/

