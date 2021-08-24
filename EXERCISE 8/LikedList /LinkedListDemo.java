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
