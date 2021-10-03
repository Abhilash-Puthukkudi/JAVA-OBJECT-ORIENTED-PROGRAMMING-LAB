/*
4. Write a program that reads from a file having integers.
Copy even numbers and odd numbers to separate files.
*/

import java.io.*;
import java.util.Scanner;
class Oddeven {
public static void main(String args[]) {

Scanner in= new Scanner(System.in);

System.out.print("Enter input file : ");
String filename =in.nextLine();




int content;
try( 
    FileInputStream fin = new FileInputStream(filename); 
    FileOutputStream foutOdd = new FileOutputStream("ODD.txt");
    FileOutputStream foutEven = new FileOutputStream("EVEN.txt");
    ) {
            String svalue ="";
            do {
                content = fin.read();
                if(content != -1){ 
                    if((char)content != '\n'){ //checking nextline character
                    char value =(char)content; // reading each character
                    svalue =svalue+ String.valueOf(value); // concatinating if its a two or more digit number
                    
                    }else if((char)content=='\n'){ // next line
                      
                         int ivalue =Integer.parseInt(svalue); // converting number to integer
                         svalue=svalue+"\n"; // adding nextline character to number string
                                       if(ivalue%2==0){ //cheking even or odd
                                             byte bE[] = svalue.getBytes(); // writing to file
                                             foutEven.write(bE);
                                        }
                                        else{
                                             byte bO[] = svalue.getBytes();// writing to file
                                             foutOdd.write(bO);
                                        }
                      svalue=""; // clearing the number string
                     }
                }
                 
                } while(content != -1);
                System.out.println(" 'ODD.txt' and 'EVEN.txt' created and numbers copyed successfully!..");
           } 
           catch(FileNotFoundException e) {
                    System.out.println("File Not Found");
                    return;
             } catch(Exception e) {}

}}

/*
OUTPUT
------

abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ javac Oddeven.java
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ java Oddeven
Enter input file : num.txt
'ODD.txt' and 'EVEN.txt' created and numbers copyed successfully!..


abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ cat num.txt
10
21
31
4
5
6
7
8
9


abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ cat EVEN.txt
10
4
6
8


abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ cat ODD.txt
21
31
5
7
9




*/



Verified


