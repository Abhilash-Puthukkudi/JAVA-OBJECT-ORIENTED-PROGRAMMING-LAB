//3. Write a menu driven program that would choose either in-built
//method or call a user defined method to sort an array of strings.

import java.util.Scanner;
import java.util.Arrays;

class Sort{
 int i,j;//loop varibles
//userDefind method for sorting 
 void UserDefinedSorting(String array[],int length)
 {
    int i,j;
    String temp;
     
    //sorting
    for(i=0; i < length ; i++)
    { for(j=i+1;j<length;j++)
      {   
        if(array[i].compareTo(array[j])>0)
        { 
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        } 
       }
     }
    //printing sorted array
    System.out.println("\nSORTED ARRAY ");
    for(i=0;i<length;i++)
    { System.out.print((i+1)+") ");
      System.out.println(array[i]);
    } 
    
 
 }//end 

 void BuiltInSorting(String array[],int length)
 {     
       //calling builtinsorting method
       Arrays.sort(array);
       
    System.out.println("\nSORTED ARRAY ");
    for(i=0;i<length;i++)
    { System.out.print((i+1)+") ");
      System.out.println(array[i]);
    } 
 }


}

//main class
class StringSort{
    public static void main(String args[])  
    {
      Sort sort = new Sort(); //sort class object
      Scanner in = new Scanner(System.in);   
    
      int option;//option varible

        //displaying menu
          System.out.println("\nCHOOSE YOUR OPTION\n----------------- ");
          System.out.println("1. BUILT IN METHOD \n2. USER DEFINED METHOD\n3.EXIT\n");
          System.out.print("ENTER YOUR OPTION : ");
          option=in.nextInt(); //rading option varible
     while(option!=3)
     {


          System.out.print("\nENTER NUMBER OF WORDS : ");
            int noOfWords = in.nextInt();


        String StringArray[] = new String[noOfWords];
      
          System.out.println("ENTER WORDS ");
            int i; //loop varible

             //reading words
             for(i=0 ; i < noOfWords ; i++)
             {   
                 System.out.print((i+1)+") ");
                  StringArray[i]= in.next();
             }   
     
              //printing entred words
           System.out.println("ENTERD WORDS : "); 
             for(i=0 ; i < noOfWords ; i++)
             {
                 System.out.print((i+1)+") ");
                 System.out.println(StringArray[i]);
             } 
      
            switch(option)
            {  //switching option
                case 1: sort.BuiltInSorting(StringArray,noOfWords); 
                    break;
                case 2: sort.UserDefinedSorting(StringArray,noOfWords);
                    break;
                default: System.out.println("\n INVALID OPTION "); 

            }
          //displaying menu
          System.out.println("\nCHOOSE YOUR OPTION\n----------------- ");
          System.out.println("1. BUILT IN METHOD \n2. USER DEFINED METHOD\n3.EXIT\n");
          System.out.print("ENTER YOUR OPTION : ");
          option=in.nextInt(); //rading option varible
          
          
     }

   System.out.println("EXITING...");
      
 }
}

/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/3$ javac StringSort.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/3$ java StringSort

CHOOSE YOUR OPTION
----------------- 
1. BUILT IN METHOD 
2. USER DEFINED METHOD
3.EXIT

ENTER YOUR OPTION : 1

ENTER NUMBER OF WORDS : 5
ENTER WORDS 
1) apple
2) juice
3) cat
4) ball
5) zeebra
ENTERD WORDS : 
1) apple
2) juice
3) cat
4) ball
5) zeebra

SORTED ARRAY 
1) apple
2) ball
3) cat
4) juice
5) zeebra

CHOOSE YOUR OPTION
----------------- 
1. BUILT IN METHOD 
2. USER DEFINED METHOD
3.EXIT

ENTER YOUR OPTION : 3
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/3$ javac StringSort.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/3$ java StringSort

CHOOSE YOUR OPTION
----------------- 
1. BUILT IN METHOD 
2. USER DEFINED METHOD
3.EXIT

ENTER YOUR OPTION : 2

ENTER NUMBER OF WORDS : 4
ENTER WORDS 
1) apple
2) dog
3) cat
4) orange 
ENTERD WORDS : 
1) apple
2) dog
3) cat
4) orange

SORTED ARRAY 
1) apple
2) cat
3) dog
4) orange

CHOOSE YOUR OPTION
----------------- 
1. BUILT IN METHOD 
2. USER DEFINED METHOD
3.EXIT

ENTER YOUR OPTION : 3

EXITING...



*/


