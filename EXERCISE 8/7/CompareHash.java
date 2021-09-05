
//7. Write a Java program to compare two hash set


import java.util.*;

public class CompareHash {

    public static void main(String[] args) {

	// Creating 1st object of HashSet<
        HashSet<String> set1 = new HashSet<String>();

        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");


	// Creating 2nd object of HashSet
        HashSet<String> set2 = new HashSet<String>();

        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("D");
        set2.add("F");

       // Creating 3nd object of HashSet
        HashSet<String> set3 = new HashSet<String>();

        set3.add("A");
        set3.add("B");
        set3.add("C");
        set3.add("D");
        set3.add("E");
        
      // print set1
        System.out.print("First Hashset  : "  +set1);
     // print set2
        System.out.print("Second HashSet : "  +set2);
   	// print set1
        System.out.print("Third HashSet  : "  +set1);

	// comparing 2 sets using equals() method
        boolean isEquals = set1.equals(set2);
        System.out.println(" set 1 and set 2 equal  : "+isEquals);
        isEquals = set1.equals(set3);
        System.out.println(" set 1 and set 3 equal  : "+isEquals);
    }
}

/*
output
------

ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question7$ javac CompareHash.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question7$ java CompareHash
First Hashset  : [A, B, C, D, E]
Second HashSet : [A, B, C, D, F]
Third HashSet  : [A, B, C, D, E] 
set 1 and set 2 equal  : false
set 1 and set 3 equal  : true

*/
Verified
