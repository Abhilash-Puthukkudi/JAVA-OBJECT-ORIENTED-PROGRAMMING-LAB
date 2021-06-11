//binary search

import java.util.Scanner;
import java.util.Arrays;

class RecurssiveBinary{
   
static int RBSearch(int array[], int first, int last , int search  )
    {     
            
         int mid = (first + last) / 2; 
         
         if(first <= last){
                
             if( array[mid] == search )  
               return mid;         
             else if(array[mid] < search)
               return RBSearch(array,mid+1,last,search);
             else 
               return RBSearch(array,first,mid-1,search);
         }
         return -1;       
     }

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
      System.out.print((i+1)+") ");
       array[i]=in.nextInt();
    
    }
    
      //sorting array
      Arrays.sort(array);

     //displaying array
    System.out.println("\nENTERD ELEMENTS AFTER SORTING"); 
    for(i=0;i<noOfElements;i++){
       System.out.print((i+1)+") "); 
       System.out.println(array[i]);
    
    }

      // reading element to search
      System.out.print("\nENTER ELEMENT TO SEARCH  : ");
      int search =in.nextInt();
  

       int first = 0, last =array.length-1;
         
       int returnValue = RBSearch(array,first,last,search); // calling RBsearch
       
       if(returnValue>=0)
        System.out.println(search+" FOUND AT "+(returnValue+1)+" POSITION");
       else
         System.out.println(search+" NOT FOUND IN ARRAY ");   
          
}}



    




