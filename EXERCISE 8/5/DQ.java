//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;

public class DQ{
	public static void main(String[] args) {
		//Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();

		String string;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of strings to add :");
		int no = Integer.parseInt(sc.nextLine()); // reading number of strings
		
		System.out.println("Enter strings ");
		for(int i=0;i<no;i++){
		string =sc.nextLine();  //reading string
		deque.add(string);	// adding  string to queue
		}
		
		
		//Traversing elements
		System.out.println("Elements in dequeue : ");
		for (String str : deque) {

			System.out.print(str+" ");

		}
		deque.remove();
		System.out.println("\nAfter first element deleted :");
		for (String str : deque) {

			System.out.print(str+" ");

		}
		deque.clear();
		System.out.println("\nAfter all element deleted :");
		for (String str : deque) {

			System.out.print(str+" ");

		}
	}
}

/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question5$ javac DQ.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question5$ java DQ
Enter number of strings to add :3
Enter strings 
java
c++
python
Elements in dequeue : 
java c++ python 
After first element deleted :
c++ python 
After all element deleted :




*/
