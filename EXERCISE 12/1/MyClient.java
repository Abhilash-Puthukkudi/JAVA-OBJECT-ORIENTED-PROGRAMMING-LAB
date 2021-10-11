//1. Client server communication using Socket – TCP/IP


import java.io.*;
import java.net.*;
public class MyClient {

public static void main(String[] args) {
try{

Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hello Server");
dout.flush();
dout.close();
s.close();

}catch(Exception e){System.out.println(e);}
}

}


/*
OUTPUT
------


abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 12$ java MyClient

abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 12$ java MyServer
message= Hello Server






*/
