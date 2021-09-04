//2. Program to Convert HashMap to TreeMap

import java.util.*;

class HashToTreeMap {

public static void main(String args[])
    {
        // Create a HashMap
        Map<Integer, String> HM = new HashMap<Integer, String>();
  
        // Add entries to the HashMap
        HM.put(1, "HTML");
        HM.put(2, "CSS");
        HM.put(3, "JAVASCRIPT");
  
        // Print the HashMap
        System.out.println("HASH MAP : " + HM);
  	
	//convert the HashMap to TreeMap
        Map<Integer, String> TM = new TreeMap<Integer, String>();
        TM.putAll(HM);
        
	// Print the TreeMap
        System.out.println("TREE MAP : " + TM);
    }
}

/*
output
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/2$ javac HashToTreeMap.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/2$ java HashToTreeMap
HASH MAP : {1=HTML, 2=CSS, 3=JAVASCRIPT}
TREE MAP : {1=HTML, 2=CSS, 3=JAVASCRIPT}
*/
