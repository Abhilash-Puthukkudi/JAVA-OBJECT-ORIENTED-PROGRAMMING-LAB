/*
1.Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations.
*/
import java.util.*;
class ArrayListDemo {
    public static void main(String args[]) {
    // Create an array list.
    ArrayList<String> al = new ArrayList<String>();

    System.out.println("Initial size of al: " + al.size());

    // Add elements to the array list.
    al.add("A");
    al.add("B");
    al.add("H");
    al.add("I");
    al.add("L");
    al.add("A");
    al.add("S");
    al.add("H");
    al.add(".");
    al.add(9, "P");

    System.out.println("Size of al after additions: " + al.size());

    // Display the array list.
    System.out.println("Contents of al: " + al);

    // Remove elements from the array list.
    al.remove("P");
    al.remove(8);

    System.out.println("Size of al after deletions: " + al.size());
    System.out.println("Contents of al: " + al);
    }
}



/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 8/1$ javac ArrayListDemo.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 8/1$ java ArrayListDemo
Initial size of al: 0
Size of al after additions: 10
Contents of al: [A, B, H, I, L, A, S, H, ., P]
Size of al after deletions: 8
Contents of al: [A, B, H, I, L, A, S, H]








*/

