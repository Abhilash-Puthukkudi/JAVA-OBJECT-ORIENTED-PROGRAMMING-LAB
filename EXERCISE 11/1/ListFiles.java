//1. Program to list the sub directories and files in a given directory
//and also search for a file name.

import java.io.File;
import java.util.Scanner;
class ListFiles {
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);

    System.out.print("Enter path to  Directory : "); 
    String dirname = in.nextLine(); //reading file path 
    
    
    File f1 = new File(dirname);   // file object creation 
    
    if (f1.isDirectory()) { // checking directory or not
    System.out.println("Directory of " + dirname);

    String s[] = f1.list(); // listing directories and folders 
    String files[] = new String[s.length]; // array to store filenames 
    int j=0;
    for (int i=0; i < s.length; i++) 
    {
     File f = new File(dirname + "/" + s[i]); // creating file object of each item
    
     if (f.isDirectory()) 
     {
       System.out.println(s[i] + " [ directory ]");
     } 
     else 
     { 
       files[j]=s[i]; // adding to file array
        j=j+1;
       System.out.println(s[i] + " [ file ]");
     }
    }

// searching
 System.out.print("Enter File Name to Search : "); 
    String filename = in.nextLine();
    boolean flag=false;
    for(int i =0;i<(files.length);i++)
    {
       if( files[i].equals(filename) ){
          flag=true;
          break;}   
      
    }
    if(flag)
    System.out.println("FILE FOUND!!");
    else
    System.out.println("FILE NOT FOUND!!"); 


    } 
    else
   {
      System.out.println(dirname + " is not a  directory");
    } }
}



//OUTPUT
//------
//abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/1$ java ListFiles
//Enter path to  Directory : ./
//Directory of ./
//ListFiles.java [ file ]
//ListFiles.class [ file ]
//Enter File Name to Search : ListFiles.java
//FILE FOUND!!
//
//
//abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 11/1$ java ListFiles
//Enter path to  Directory : ./
//Directory of ./
//ListFiles.java [ file ]
//ListFiles.class [ file ]
//Enter File Name to Search : invalidfile.txt
//FILE NOT FOUND!!
//

