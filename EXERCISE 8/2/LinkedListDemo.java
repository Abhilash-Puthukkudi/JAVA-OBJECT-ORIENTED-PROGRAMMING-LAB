/* 
2. Program to remove all the elements from a linked list
*/

import java.util.*;
class LinkedListDemo
{
  public static void main(String[] args) 
  {
    //create a linked list
     LinkedList<String> list = new LinkedList<String>();
     //add elements in the linked list
          list.add("A");
          list.add("V");
          list.add("A");
          list.addLast("A");
          list.addFirst("J");
      
   System.out.println("Original contents in linked list: " +list);

  //remove all elements from the linked list using clear()
     list.clear();
 
    System.out.println("After removing elements in linked list: " +list);
  }
}

/*
output
------

ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question2$ javac LinkedListDemo.java
ablas@ablas-HP-Notebook:~/Desktop/shell tutorial/testfile/Exercise8/Question2$ java LinkedListDemo
Original contents in linked list: [J, A, V, A, A]
After removing elements in linked list: []


*/
