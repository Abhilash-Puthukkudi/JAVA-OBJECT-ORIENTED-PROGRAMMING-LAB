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
    
     
     while(true)
     {


          System.out.print("ENTER NUMBER OF WORDS : ");
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
      
      int option;//option varible
          //displaying menu
          System.out.println("\nCHOOSE YOUR OPTION\n----------------- ");
          System.out.println("1. BUILT IN METHOD \n2. USER DEFINED METHOD\n3.EXIT\n");
          System.out.print("ENTER YOUR OPTION : ");
          option=in.nextInt(); //rading option varible
          
           switch(option){//switching option
            case 1: sort.BuiltInSorting(StringArray,noOfWords); 
                    break;
            case 2: sort.UserDefinedSorting(StringArray,noOfWords);
                    break;
            case 3: break;
            default: System.out.println("\n INVALID OPTION "); 

            }
     }

   
      
 }
}




