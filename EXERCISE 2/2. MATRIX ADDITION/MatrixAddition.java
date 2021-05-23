import java.util.Scanner;

class MatrixAddition{

public static void main(String args[]){

 
 Scanner input =new Scanner(System.in);
 
  int row1,column1,row2,column2;

 System.out.print("ENTER ROWS OF MATRIX 1    : ");
 row1=input.nextInt();
 System.out.print("ENTER COLUMN OF MATRIX 1  : ");
 column1=input.nextInt();  

 System.out.print("ENTER ROWS OF MATRIX 2    : ");
 row2=input.nextInt();
 System.out.print("ENTER COLUMN OF MATRIX 2  : ");
 column2=input.nextInt();

 if(row1==row2 && column1==column2)
 {
    System.out.println("ADDITION POSSIBLE");
     int matrix1[][]=new int[row1][column1];
     int matrix2[][]=new int[row1][column2];
     
    int row,col;
//reading matrix 1
    System.out.println("ENTER ELEMENTS OF 1ST MATRIX ");
 
    for(row=0; row < row1 ; row++)
    {
       for(col=0 ; col < column1 ; col++)
       {
         matrix1[row][col]=input.nextInt();
       
        } 

      }  
//Displaying matrix 1
    System.out.println("ENTERD 1ST MATRIX ");
 
    for(row=0; row < row1 ; row++)
    {
       for(col=0 ; col < column1 ; col++)
       {
         System.out.print(matrix1[row][col]+" ");   
       
        } 
          System.out.println(); // printing next line
      }  

//reading matrix 2
   System.out.println("ENTER ELEMENTS OF 2ND MATRIX ");
 
    for(row=0; row < row2 ; row++)
    {
       for(col=0 ; col < column2 ; col++)
       {
         matrix2[row][col]=input.nextInt();
       
        } 

      }  
  
//Displaying matrix 2
    System.out.println("ENTERD 2ND MATRIX ");
 
    for(row=0; row < row2 ; row++)
    {
       for(col=0 ; col < column2 ; col++)
       {
         System.out.print(matrix2[row][col]+" ");   
       
        } 
          System.out.println(); // printing next line
      }  


// Addition of mattrix 
  
 int matrix3[][]=new int[row1][column1]; // resultant matrix
 
  for(row=0 ; row<row1; row++)
  {
   for(col=0; col<column1; col++)
    {  
       matrix3[row][col] = matrix1[row][col] + matrix2[row][col];
    }  
   }
  
   
//Displaying matrix 3
    System.out.println(" RESULT MATRIX ");
 
    for(row=0; row < row2 ; row++)
    {
       for(col=0 ; col < column2 ; col++)
       {
         System.out.print(matrix3[row][col]+" ");   
       
        } 
          System.out.println(); // printing next line
      }  


 }
 else
  { 
    System.out.println("ADDITION NOT POSSIBLE");
    }
  
}
}


/*

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/2. MATRIX ADDITION$ javac MatrixAddition.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/2. MATRIX ADDITION$ java MatrixAddition
ENTER ROWS OF MATRIX 1    : 2
ENTER COLUMN OF MATRIX 1  : 2
ENTER ROWS OF MATRIX 2    : 2
ENTER COLUMN OF MATRIX 2  : 2
ADDITION POSSIBLE
ENTER ELEMENTS OF 1ST MATRIX 
1
1
1
1
ENTERD 1ST MATRIX 
1 1 
1 1 
ENTER ELEMENTS OF 2ND MATRIX 
2
2
2
2
ENTERD 2ND MATRIX 
2 2 
2 2 
 RESULT MATRIX 
3 3 
3 3 

*/
