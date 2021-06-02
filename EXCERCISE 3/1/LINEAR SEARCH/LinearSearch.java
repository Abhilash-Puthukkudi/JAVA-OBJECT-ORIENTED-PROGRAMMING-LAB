import java.util.Scanner;

class LinearSearch{

public static void main(String args[]){

Scanner in =new Scanner(System.in);

System.out.print("ENTER NUMBER OF ELEMENTS : ");
int size=in.nextInt(); //reading number of numbers(size of array)

int Array[]= new int[size]; // array of size 'size ' declared

int i,j;

    for (i=0;i<size;i++) // reading elements
    {
        System.out.print("ENTER ELEMENT "+(i+1)+" : " );
        Array[i]=in.nextInt();

    }
  
  System.out.println("ENTERD ELEMENTS ARE" );// displaying entred elements

     for (i=0;i<size;i++)
     {
        
        System.out.println(Array[i]);
     }

  int flag=0;
 
  System.out.print("ENTER ELEMENT TO BE SEARCHED : " ); // reading element to be searched
  int SEARCH=in.nextInt();

  for(i=0;i<size;i++){
   
      if (Array[i]==SEARCH) // checking
      {
       System.out.println("NUMBER "+SEARCH+" FOUND AT "+(i+1)+" POSITION");
       flag=0; 
      }
      else
      {
        flag=1;// flag is set to false every time if there no match found
        continue;
      } 

   }
  
 if(flag==1)// checking flag status
 System.out.println(SEARCH+" NOT FOUND ");

  
}

}


/*

OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3$ javac LinearSearch.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3$ java LinearSearch
ENTER NUMBER OF ELEMENTS : 10
ENTER ELEMENT 1 : 1
ENTER ELEMENT 2 : 2
ENTER ELEMENT 3 : 3
ENTER ELEMENT 4 : 4
ENTER ELEMENT 5 : 5
ENTER ELEMENT 6 : 6
ENTER ELEMENT 7 : 7
ENTER ELEMENT 8 : 8
ENTER ELEMENT 9 : 9
ENTER ELEMENT 10 : 10
ENTERD ELEMENTS ARE
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
ENTER ELEMENT TO BE SEARCHED : 10
NUMBER 10 FOUND AT 10 POSITION


*/



