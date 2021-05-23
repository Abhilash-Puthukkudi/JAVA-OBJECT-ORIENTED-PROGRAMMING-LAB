/*
1. Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.
*/

import java .util.Scanner;

// class product 
 class Product{
 
    int    PCODE,PRICE ;
    String PNAME ;
    

//constructor
  Product(int pcode , String pname , int price ){
        PCODE = pcode;
        PNAME = pname;
        PRICE = price;    
        System.out.println(" ' "+pname+" ' PRODUCT OBJECT CREATED");         
  }

//display function
 void display(){
  
   System.out.println("PRODUCT CODE  : "+PCODE);
   System.out.println("PRODUCT NAME  : "+PNAME);  
   System.out.println("PRODUCT PRICE : "+PRICE); 
   System.out.println("\n");


 }

}

 class ProductMain{

    public static void main(String args[]){
       
       // creating scanner object
     Scanner in = new Scanner(System.in);
       
      //creating varibles
       int pcode,price;
       String pname;
       

       //P1 object created
     Product P1 = new Product(001,"REDMI NOTE 9",12000);
  
     
     pcode=002;
     pname="REDMI NOTE 9 PRO";
     price=14000;
      //P2 object created
     Product P2 = new Product(pcode,pname,price);
     
    //reading 3rd product details
     
     System.out.print("\nENTER PRODUCT NAME  : ");
     pname=in.nextLine();      

     System.out.print("\nENTER PRODUCT CODE  : ");
     pcode=Integer.parseInt(in.nextLine());
 
     System.out.print("\nENTER PRODUCT PRICE : ");
     price=Integer.parseInt(in.nextLine());
     


    

     //P3 object created
     Product P3 = new Product(pcode,pname,price);

     //displaying products
      System.out.println("\n----------PRODUCTS----------");
      P1.display();
      P2.display();
      P3.display();
     
     //displaying lowset priced item
     System.out.println("\nPRODUCT HAVING LOWEST PRICE \n---------------------------------");
     if(P1.PRICE<P2.PRICE && P1.PRICE<P3.PRICE){
      P1.display();  
     }
     else if(P2.PRICE<P1.PRICE && P2.PRICE<P3.PRICE){
     P2.display();
     }
     else{
     P3.display();
     }     


       

   

}

}


/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/Untitled Folder$ javac ProductMain.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/Untitled Folder$ java ProductMain
 ' REDMI NOTE 9 ' PRODUCT OBJECT CREATED
 ' REDMI NOTE 9 PRO ' PRODUCT OBJECT CREATED

ENTER PRODUCT NAME  : REDMI NOTE 9 PRO MAX

ENTER PRODUCT CODE  : 3

ENTER PRODUCT PRICE : 17999
 ' REDMI NOTE 9 PRO MAX ' PRODUCT OBJECT CREATED

----------PRODUCTS----------
PRODUCT CODE  : 1
PRODUCT NAME  : REDMI NOTE 9
PRODUCT PRICE : 12000


PRODUCT CODE  : 2
PRODUCT NAME  : REDMI NOTE 9 PRO
PRODUCT PRICE : 14000


PRODUCT CODE  : 3
PRODUCT NAME  : REDMI NOTE 9 PRO MAX
PRODUCT PRICE : 17999



PRODUCT HAVING LOWEST PRICE 
---------------------------------
PRODUCT CODE  : 1
PRODUCT NAME  : REDMI NOTE 9
PRODUCT PRICE : 12000






*/


