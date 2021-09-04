/*
6. Program to demonstrate the creation of Set object using the
LinkedHashset class

*/

import java.util.*;

public class HashSetMain{
	public static void main(String args[]){
		//creating set object
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		Iterator<String> itr=set.iterator();
		System.out.println("The elements in the set ");
		while(itr.hasNext()){
		System.out.print(itr.next()+" ");

		}
	}
}


/*

output
------

ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question6$ javac HashSetMain.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question6$ java HashSetMain
The elements in the set 
one two three
*/
