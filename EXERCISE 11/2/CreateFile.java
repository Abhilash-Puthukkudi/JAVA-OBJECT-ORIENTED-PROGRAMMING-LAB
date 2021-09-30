//2. Write a program to write to a file, then read from the file and
//display the contents on the console.


import java.io.*;
import java.util.Scanner;
class CreateFile {
public static void main(String args[]) {

Scanner in= new Scanner(System.in);

System.out.print("Enter filename  : ");
String filename =in.nextLine();

System.out.println("Enter Text To Write to file\n------------------------");
String source = in.nextLine(); 

byte buf[] = source.getBytes();

// Use try-with-resources to close the files.
    try (FileOutputStream file = new FileOutputStream(filename);)
    {
    // write to file
    file.write(buf);

    int content;
        System.out.println("CONTENT OF FILE : '"+filename+"''\n---------------");
        try( FileInputStream fin = new FileInputStream(filename);) {

            do {
                content = fin.read();
                if(content != -1)
                    System.out.print((char) content);
                } while(content != -1);
           } 
           catch(FileNotFoundException e) {
                    System.out.println("File Not Found");
                    return;
             } catch(Exception e) {System.out.println("ERROR : "+e);}



    } catch(IOException e) 
    {
        System.out.println("An I/O Error Occured");
    }

   }
 }


/*
output
------
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/2$ javac  CreateFile.java
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/2$ java  CreateFile
Enter filename  : output.txt
Enter Text To Write to file
------------------------
this is a sample text wrriten using createfile.java program     
CONTENT OF FILE : 'output.txt''
---------------
this is a sample text wrriten using createfile.java program

*/
