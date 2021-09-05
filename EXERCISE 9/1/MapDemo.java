//1. Program to demonstrate the working of Map interface by adding, changing and removing elements.


import java.util.*;
class MapDemo {

	public static void main(String args[]){
		// Create a map
		Map<Integer, String> hm = new HashMap<Integer, String>();

			// Inserting the Elements
			hm.put(new Integer(1), "REACT");
			hm.put(new Integer(2), "ANGULAR");
			hm.put(new Integer(3), "FLUTTER");
			hm.put(new Integer(4), "VUE");

			// MAP Aftrer insertion 
			System.out.println("MAP : " + hm);
			// Changing the Elements
			
			//inserting new element to the old element
			hm.put(new Integer(2), "NATIVE SCRIPT");
			
  			//Updated Map
        		System.out.println("MAP AFTER UPDATION : " + hm);
			
			//removing elements
			hm.remove(new Integer(4));

			// Final Map
			System.out.println("MAP AFTER REMOVEL : " + hm);
	}
}


/*
output
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/1$ javac MapDemo.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/1$ java MapDemo
MAP : {1=REACT, 2=ANGULAR, 3=FLUTTER, 4=VUE}
MAP AFTER UPDATION : {1=REACT, 2=NATIVE SCRIPT, 3=FLUTTER, 4=VUE}
MAP AFTER REMOVEL : {1=REACT, 2=NATIVE SCRIPT, 3=FLUTTER}


*/
Verified
