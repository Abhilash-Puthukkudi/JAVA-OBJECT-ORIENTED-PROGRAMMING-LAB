import java.net.*;
public class DatagramReceiver{
public static void main(String[] args) throws Exception {
DatagramSocket ds = new DatagramSocket(3000);
byte[] buf = new byte[1024];
DatagramPacket dp = new DatagramPacket(buf, 1024);
ds.receive(dp);
String str = new String(dp.getData(), 0, dp.getLength());
System.out.println(str);
ds.close();
}
}

/*
OUTPUT
------
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 12/2$ java  DatagramSender

abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 12/2$ javac DatagramReceiver.java 
abhilashp@ablas:~/Desktop/Class Labs/JAVA-OBJECT-ORIENTED-PROGRAMMING-LAB/EXERCISE 12/2$ java DatagramReceiver
Welcome java

*/
