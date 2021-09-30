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
               
            do {
                content = fin.read();
                if(content != -1){
                    
                    char value =(char)content;
                    String svalue = String.valueOf(value);
                    int ivalue =Integer.parseInt(svalue);
                 
                    if(ivalue%2==0){
                      foutEven.write(content);
                    }
                    else{
                      foutOdd.write(content);
                    }
                }
                } while(content != -1);
                
           } 
           catch(FileNotFoundException e) {
                    System.out.println("File Not Found");
                    return;
             } catch(Exception e) {System.out.println(" 'ODD.txt' and 'EVEN.txt' created and numbers copyed successfully!..");}

}}



/*
output
-------
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ javac Oddeven.java
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/4$ java Oddeven
Enter input file : num.txt
 'ODD.txt' and 'EVEN.txt' created and numbers copyed successfully!..


*/
