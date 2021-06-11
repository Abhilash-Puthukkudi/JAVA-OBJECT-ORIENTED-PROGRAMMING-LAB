//binary search

import java.util.Scanner;
import java.util.Arrays;

class BinarySearch{


public static void main(String args[]){

 Scanner in = new Scanner(System.in);
   //reading number of elements
    System.out.print("ENTER NUMBER OF ELEMENTS : ");
    int noOfElements =in.nextInt();
    //array created  
    int array[] = new int[noOfElements];
    //reading elements
    System.out.println("ENTER ELEMENTS : ");
    int i;
    for(i=0;i<noOfElements;i++){
      
       array[i]=in.nextInt();
    
    }
    
      //sorting array
      Arrays.sort(array);
     
    //displaying array
    System.out.println("\nENTERD ELEMENTS AFTER SORTING"); 
    for(i=0;i<noOfElements;i++){
      
       System.out.println(array[i]);
    
    }
    // reading element to search
     System.out.print("\nENTER ELEMENT TO SEARCH  : ");
     int search =in.nextInt();
   
    //calling Array.BinarySearch() 
    int Returnvalue = Arrays.binarySearch(array,search);

  //printing result
   if(Returnvalue<0)
    System.out.println("\nELEMENT NOT FOUND");
  else
      System.out.println("\nELEMENT FOUND AT POSITION "+(Returnvalue+1));
      
   

}}


/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1/Array.BinarySearch$ javac BinarySearch.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1/Array.BinarySearch$ java BinarySearch
ENTER NUMBER OF ELEMENTS : 10
ENTER ELEMENTS : 
100
22
55
44
88
1
2
3
4
5

ENTERD ELEMENTS AFTER SORTING
1
2
3
4
5
22
44
55
88
100

ENTER ELEMENT TO SEARCH  : 88

ELEMENT FOUND AT POSITION 9
 
 

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1/Array.BinarySearch$ javac BinarySearch.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1/Array.BinarySearch$ java BinarySearch
ENTER NUMBER OF ELEMENTS : 5
ENTER ELEMENTS : 
3
9
7
45
2

ENTERD ELEMENTS AFTER SORTING
2
3
7
9
45

ENTER ELEMENT TO SEARCH  : 100

ELEMENT NOT FOUND



*/



