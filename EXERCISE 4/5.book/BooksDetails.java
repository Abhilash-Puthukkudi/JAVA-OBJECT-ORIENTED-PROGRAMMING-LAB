//4. Write a program has class Publisher, Book, Literature and Fiction. Read the
//information and print the details of books from either the category, using
//inheritance.

import java.util.Scanner;
//class Publisher
class Publisher{

    String Publisher_name;
    
        Publisher(String Publisher_name){ //constructor
  
            this.Publisher_name = Publisher_name;  
        }  

}
//class book
class Book extends Publisher{

    int book_id;

        Book(int book_id ,String publisher_name ){
        
            super(publisher_name); // caliing publisher constructor
            this.book_id = book_id;     
        }
}

//class literature
class Literature extends Book{
    
     String Book_name;
     
     Literature(int book_id , String publisher_name ,  String Book_name){
       
        super( book_id , publisher_name );//calling book constructor
        this.Book_name = Book_name;  

     }
    
        void BookDetails(){ //display class

          System.out.println(" BOOK ID        : "+ book_id );
          System.out.println(" PUBLISHER NAME : "+ Publisher_name );
          System.out.println(" BOOK NAME      : "+ Book_name );
       
        }

}

//class fiction
class Fiction extends Book{

       String Book_name;
     
     Fiction(int book_id , String publisher_name ,  String Book_name){
       
        super( book_id , publisher_name );//calling book constructor
        this.Book_name = Book_name;  

     }     

        void BookDetails(){ //display class

          System.out.println(" BOOK ID        : "+ book_id );
          System.out.println(" PUBLISHER NAME : "+ Publisher_name );
          System.out.println(" BOOK NAME      : "+ Book_name );
       
        }

     

}


//main class

class BooksDetails{

    public static void main(String s[]){
      
      Scanner in = new Scanner(System.in);

      
      System.out.println("Select Book Catogory\n*-*-*-*-*-*-*-*-*");
      System.out.println(" 1.Literature\n 2.Fiction");
      System.out.print("Choose Your Option : ");
      int catogory = Integer.parseInt(in.nextLine());
      
      String publisher_name,Book_name;
      int book_id;

        switch(catogory){
        
            case 1 :  System.out.println("Enter Literature Book Deatils ");
                     //reading book details
                      System.out.print("Enter Book ID           : ");
                      book_id = Integer.parseInt(in.nextLine());
                     
                      System.out.print("Enter Publisher Name    : ");
                      publisher_name = in.nextLine();
                      
                      System.out.print("Enter Book Name         : ");
                      Book_name = in.nextLine();
                      
                      Literature lbook = new Literature( book_id ,  publisher_name ,   Book_name);// object creation

                      System.out.println("\nEnterd Literature Book Details  ");
                      lbook.BookDetails();//displaying book details
                      
                    
                      break;


            case 2 :  System.out.println("Enter Fiction Book Deatils ");
                      //reading book details
                      System.out.print("Enter Book ID           : ");
                      book_id = Integer.parseInt(in.nextLine());
                     
                      System.out.print("Enter Publisher Name    : ");
                      publisher_name = in.nextLine();
                      
                      System.out.print("Enter Book Name         : ");
                      Book_name = in.nextLine();
                      
                      Fiction fbook = new Fiction( book_id ,  publisher_name ,   Book_name);// object creation
                         
                      System.out.println("\nEnterd Fiction Book Details  ");
                      fbook.BookDetails();//displaying book details
                      
                      break;
                                      
        } 
    }
}




/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/5.book$ javac BooksDetails.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/5.book$ java BooksDetails
Select Book Catogory
*-*-*-*-*-*-*-*-*
 1.Literature
 2.Fiction
Choose Your Option : 1
Enter Literature Book Deatils 
Enter Book ID           : 1001
Enter Publisher Name    : DC BOOKS
Enter Book Name         : 3 idiots              

Enterd Literature Book Details  
 BOOK ID        : 1001
 PUBLISHER NAME : DC BOOKS
 BOOK NAME      : 3 idiots

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/5.book$ java BooksDetails

Select Book Catogory
*-*-*-*-*-*-*-*-*
 1.Literature
 2.Fiction
Choose Your Option : 2
Enter Fiction Book Deatils 
Enter Book ID           : 1003
Enter Publisher Name    : DC BOOKS
Enter Book Name         : Alchemist

Enterd Fiction Book Details  
 BOOK ID        : 1003
 PUBLISHER NAME : DC BOOKS
 BOOK NAME      : Alchemist


*/
//Verified



