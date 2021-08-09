//2. Find the average of N positive integers, raising a user defined exception for each negative input.

import java.util.Scanner;
import java.util.*;

//Exception class 
class NegativeException extends Exception
{

    NegativeException(String str)
    {
        super(str);
    }

}



class Negative{
    public static void main(String args[]) throws NegativeException{
     
     
        Scanner sc = new Scanner(System.in);
     
        System.out.println("ENTER NUMBER OF NUMBERS : ");
        int n = sc.nextInt();
        int sum=0;
     
        int[] numbers = new int[n]; // array created of size n
        int i=0;
        while(i<n)
            {
              System.out.print((i+1)+") ");
              int number=sc.nextInt();
              //try block inside loop
              try{
                    if(number<0)
                    throw new NegativeException("Negative Number Detected"); // throwing exception
                    else
                    {
                    numbers[i]=number;
                    i=i+1;
                    }        
                 }     
                 catch(Exception e)
                  {
                    System.out.println("WARNING! : "+e+"\nEnter new Number!");
                    
                    continue;
                  }
            }//end of loop
            
                   //calculatiing sum
                   for(i =0;i<n;i++)
                   {
                     sum=sum+numbers[i];
                   }
                   
                   //calculating avarage
                    double avg = sum/n;
                    System.out.println("AVERAGE : "+ avg);            
            }
         }


//output
//------
//ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/2.Negative Exception$ javac Negative.java
//ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/2.Negative Exception$ java Negative
//ENTER NUMBER OF NUMBERS : 
//5
//1) 1
//2) 2
//3) -9
//WARNING! : NegativeException: Negative Number Detected
//Enter new Number!
//3) -6
//WARNING! : NegativeException: Negative Number Detected
//Enter new Number!
//3) 3
//4) 4
//5) 5
//AVERAGE : 3.0
//


//Verified
