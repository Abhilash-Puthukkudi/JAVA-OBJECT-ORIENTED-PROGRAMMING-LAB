/*
4.Program to demonstrate the creation of queue object using the PriorityQueue class
*/

import java.util.*;

class PQ{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//creating object of PriorityQueue<String>
		PriorityQueue<String> queue=new PriorityQueue<String>();

		//reading no.of strings
		System.out.print("Enter number of Strings to add to Queue : ");
		int no = Integer.parseInt(sc.nextLine());
		String str;
        System.out.println("Enter Strings to add to Queue : ");
		for(int i =0;i<no; i++ ){
			str =sc.nextLine(); //reading strings
			queue.add(str);    //adding strings to queue
		}
		
		System.out.print("Queue elements : ");
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){

			System.out.print(itr.next()+" ");

		}
 
		
	}
}
/*
Output 
-------
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question4$ javac PQ.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question4$ java PQ
Enter number of Strings to add to Queue : 3
Enter Strings to add to Queue : 
a
b
c
Queue elements : a b c 

*/
Verified
