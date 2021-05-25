

import java.util.Scanner;

class SymmertricsMatrix
{
public static void main(String args[])
{
 Scanner input =new Scanner(System.in);

 int rows , columns;
 //reading order of matrix
 System.out.print("ENTER ROWS OF MATRIX      : ");
 rows = input.nextInt();
 System.out.print("ENTER COLUMNS OF MATRIX   : ");
 columns = input.nextInt();  

  if(rows==columns)//checking square matrix
 {
   int matrix[][]=new int[rows][columns]; //matrix array created
   int row,col,flag=0; //  varibles
   
     System.out.println("ENTER ELEMENTS  OF  MATRIX ");
   //reading matrix elements
    for(row=0; row < rows ; row++)
    {
       for(col=0 ; col < columns ; col++)
       {
         matrix[row][col]=input.nextInt();
       
        } 

      } 


  System.out.println("ENTERD MATRIX ");
   
   for(row=0 ; row<rows; row++)
  {
   for(col=0; col<columns; col++)
    { 
        System.out.print(matrix[row][col]+" ");
     
    }
    System.out.println();//for next row
  }


//transpose 

  int Tmatrix[][]=new int[columns][rows]; 
 
  for(row=0 ; row<rows; row++)
  {
   for(col=0; col<columns; col++)
    {  
       Tmatrix[row][col] = matrix[col][row];
    }  
   }
  
//transpose of matrix
  System.out.println("TRANSPOSE OF MATRIX ");
   
   for(row=0 ; row<rows; row++)
  {
   for(col=0; col<columns; col++)
    { 
        System.out.print(Tmatrix[row][col]+" ");
     
    }
    System.out.println();
  }

 //cheking tranpose

     for(row=0 ; row<rows; row++)
    {
   for(col=0; col<columns; col++)
    { 
        
       if(Tmatrix[row][col]==matrix[row][col])
             flag=1;
       else{
             flag=0;
             break;
            }
       
    }
  }

    if(flag==1)
     System.out.println("SYMMETRIC MATIRX"); 
   else
     System.out.println("NOT A SYMMETRIC MATIRX");
     
 
 }
 else
 {
  System.out.println("NOT A SYMMERTRIC MATRIX");
  }



}

}



/*
  OUTPUT
  ------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/3 .SYMMERTRICS MATRIX$ javac SymmertricsMatrix.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/3 .SYMMERTRICS MATRIX$ java SymmertricsMatrix
ENTER ROWS OF MATRIX      : 3
ENTER COLUMNS OF MATRIX   : 3
ENTER ELEMENTS  OF  MATRIX 
1
1
1
1
2
0
1 
0
5
ENTERD MATRIX 
1 1 1 
1 2 0 
1 0 5 
TRANSPOSE OF MATRIX 
1 1 1 
1 2 0 
1 0 5 
SYMMETRIC MATIRX





*/
