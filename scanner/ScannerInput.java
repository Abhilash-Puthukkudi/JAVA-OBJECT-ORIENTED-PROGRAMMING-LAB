							// demonstrate Scanner 

// importing scanner class
import java .util.Scanner ;

class ScannerInput {

public static void main ( String args[ ] )
{


//creating scanner object
Scanner in = new Scanner (System.in ) ;

//reading string : nextLine()
System.out.print("Enter a string : ") ;

String s = in.nextLine() ;
System.out.println("You entered string : " + s ) ;

//reading int : nextInt()

System.out.print("Enter an Integer : ") ;
int a = in.nextInt( ) ;

System.out.println("You entered integer : "+ a ) ;

//reading Float :nextFloat 

System.out.print("Enter a Float Value : ") ;
float b = in.nextFloat( ) ;

System.out.println("You entered float : " + b ) ;

} }


/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/scanner$ javac ScannerInput.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/scanner$ java ScannerInput
Enter a string : ABHILASH
You entered string : ABHILASH
Enter an Integer : 2255
You entered integer : 2255
Enter a Float Value : 3.14
You entered float : 3.14


*/