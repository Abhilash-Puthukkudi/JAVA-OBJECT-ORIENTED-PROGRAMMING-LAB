// Program to check for command line arguments
class CommandLine {

public static void main ( String[] args )
{

// check if length of args array is
// greater than 0
if (args.length>0) 
 {
   System.out.println("The command line arguments are: " ) ;
     // iterating the args array 
   for ( String val : args )
   System.out.println(val);
}
else
 System.out.println("No command line " + " arguments found . ") ;

 } 
}


/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/CommandLine$ javac CommandLine.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/CommandLine$ java CommandLine HELLO WORLD
The command line arguments are: 
HELLO
WORLD


*/