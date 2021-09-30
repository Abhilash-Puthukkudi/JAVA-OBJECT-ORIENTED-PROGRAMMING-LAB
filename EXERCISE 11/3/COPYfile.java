//3. Write a program to copy one file to another.//

import java.io.*;
import java.util.Scanner;
class COPYfile {
public static void main(String args[]) {

Scanner in= new Scanner(System.in);

System.out.print("Enter filename to copy from : ");
String filename =in.nextLine();

System.out.print("Enter filename to copy to : ");
String copyfile =in.nextLine();


int content;
try( FileInputStream fin = new FileInputStream(filename); FileOutputStream fout = new FileOutputStream(copyfile);) {

            do {
                content = fin.read();
                if(content != -1)
                    fout.write(content);  
                } while(content != -1);
            System.out.println(filename+" COPYED TO "+copyfile);
           } 
           catch(FileNotFoundException e) {
                    System.out.println("File Not Found");
                    return;
             } catch(Exception e) {System.out.println("ERROR : "+e);}

}}

/*
output
------
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/3$ javac COPYfile.java
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/3$ java COPYfile
Enter filename to copy from : COPYfile.java
Enter filename to copy to : output.txt
COPYfile.java COPYED TO output.txt

*/
