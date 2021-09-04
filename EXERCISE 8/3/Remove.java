/*
3. Program to remove an object from the Stack when the position is passed as parameter
*/

import java.util.*;

public class Remove{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in)
;
		Stack<String> stack = new Stack<String>();
		String str;

		System.out.print("Enter number of strings to add :");
		int no = Integer.parseInt(sc.nextLine()); // reading number of strings
		System.out.println("Enter strings to add ");
		for(int i=0;i<no;i++){
		    str =sc.nextLine();  //reading string
		    stack.push(str);	// pushing string to stack
		}
		
	
		Iterator<String> itr=stack.iterator(); // creating itrator

		System.out.print("Items in stack :");
		while(itr.hasNext()){

			System.out.print(itr.next()+" "); // printing stack elemnts

		}
		
		System.out.print("\nEnter position of an object to remove : ");
		int i=sc.nextInt();  // reading postion to remove item

		stack.removeElementAt(i); // poping element 
	
		itr=stack.iterator();
		System.out.print("Stack after an element removed : ");
		while(itr.hasNext()){

			System.out.print(itr.next()+" "); // printing after removel

		}	
	}
}


/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question3$ javac Remove.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question3$ java Remove
Enter number of strings to add :3
Enter strings to add 
python
java
c++
Items in stack : pyhton java c++ 
Enter position of an object to remove : 2
Stack after an element removed : python java 

*/
