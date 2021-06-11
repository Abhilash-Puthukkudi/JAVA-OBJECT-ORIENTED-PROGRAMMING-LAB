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
  
   int first = 0, last =array.length-1;
   int mid = (first + last)/2;  
           
    while( first <= last )
       {                 
         if ( array[mid] < search )
         {  
            first = mid + 1;     
         }
         else if ( array[mid] == search )
         {  
             System.out.print("ELEMENT "+search+" FOUND AT LOCATION : " + (mid+1));  
             break;  
         }
         else
         {  
            last = mid - 1;  
         }  
            mid = (first + last)/2;  
       }  
      
      if ( first > last )  
      System.out.println(" ELEMENT NOT FOUND ");  
     

   


}


}



/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1$ javac BinarySearch.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/1$ java BinarySearch
ENTER NUMBER OF ELEMENTS : 10
ENTER ELEMENTS : 
1
2
3
9
8
7
5
6
4
10

ENTERD ELEMENTS AFTER SORTING
1
2
3
4
5
6
7
8
9
10

ENTER ELEMENT TO SEARCH  : 8
ELEMENT 8 FOUND AT LOCATION : 8



*/




/*
ALGORITHAM
----------
STEP 1 : START
STEP 2 : READ NO OF ELEMENTS 
STEP 3 : CREATE ARRAY 'array' OF SIZE NO OF ELEMENTS
STEP 4 : ENTER ARRAY ELEMENTS
STEP 5 : SORT ARRAY USING Array.sort()
STEP 6 : DISPLAY SORTED ARRAY
STEP 7 :  SET first AS STARTING INDEX AND last AS LAST INDEX { first =0 , last = Array.length-1  } AND FIND MID POINT OF THE SORTED ARRAY { mid=(first+last)/2 
STEP 8 : 1 ) COMPARE THE MID VALUE TO THE SEARCH VALUE
              1)IF THE MID VALUE IS SMALER THAN PERFORM BINARY SEARCH ON THE LET HALF OF THE ARRAY BY BY INCRESING THE VALUE OF first AS mid+1 and AND mid as (first+last)/2   
              2)IF MID VALUE IS EQUAL TO SEARCH VALUE PRINT FOUND
              3)IF THE MID VALUE IS LARGER THAN THE SEARCH VALUE , PERFORM BINARY SEARCH ON THE RIGHT HALF OF THE ARRAY BY DECRESING THE VALUE OF last AS mid-1 AND mid as (first+last)/2    
STEP 9:  REPEAT STEP 8  UNTIL MID VALUE IS EQUAL TO SEARCH VALUE , THE VALUE IS NOT IN THE ARRAY IF first>last IS TRUE 
         



*/





