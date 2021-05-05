// demonstrate BufferedReader
//importing classes

import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.InputStreamReader ;

class BufferReaderinput {
public static void main (String args[]) throws IOException
{

// creating reader object
BufferedReader reader = new BufferedReader (new InputStreamReader(System.in)) ;

System.out.print( "ENTER YOUR NAME : ");
String name = reader.readLine();

System.out.println( "HELLO..! " +name );


} 
}


/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Bufferdreader$ javac BufferReaderinput.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Bufferdreader$ java BufferReaderinput
ENTER YOUR NAME : ABHILASH
HELLO..! ABHILASH



*/