import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
//interface to implement
interface BillGen
{
  int calculate();
}
//class to imple
class Product implements BillGen
{
  String name;
  int pid,quantity,unit_price,total;

  Product(){}
  
  Product(String name,int pid,int quantity, int unit_price)
  {
    this.name=name;
    this.pid=pid;
    this.quantity=quantity;
    this.unit_price=unit_price;
  }

public int calculate()
{
  total=quantity*unit_price;
  return total;
}
}

//main class
public class Bill{
  public static void main(String args[])
  {
    Product[][] order;

    Scanner in=new Scanner(System.in);

    System.out.print("Enter number of orders: ");
    int n=Integer.parseInt(in.nextLine());

    order=new Product[n][];

    for(int i=0;i<n;i++)
    {
     System.out.print("Enter number of products: ");
     int m=Integer.parseInt(in.nextLine());
     
     order[i]=new Product[m];
     
     for(int j=0;j<m;j++)
     {
       System.out.print("Enter product " + (j+1) +" name:");
       String a=in.nextLine();
       System.out.print("Enter product id:");
       int b=Integer.parseInt(in.nextLine());
       System.out.print("Enter product quantity:");
       int c=Integer.parseInt(in.nextLine());
       System.out.print("Enter product unit price:");
       int d=Integer.parseInt(in.nextLine());
       
       Product pb=new Product(a,b,c,d);
       order[i][j]=pb;
       order[i][j].total=order[i][j].calculate();
      }

  }
     for(int i=0;i<n;i++)
     {
       int sum=0;
       System.out.println("Order No:"+(i+1));
       //getting current time and date
       Date date=java.util.Calendar.getInstance().getTime(); 
       System.out.println(date);
       System.out.println("-----------------------------------------------------------------------------");
       System.out.printf("%5s %20s %25s %10s %10s","ProductId","Name","Quantity","Unit_Price","Total");
       System.out.println(); 
       System.out.println("-----------------------------------------------------------------------------");
       for(int j=0;j<order[i].length;j++)
       {
          System.out.printf("%5s %20s %25s %10s %10s",order[i][j].pid,order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total);
          System.out.println(); 
        }
        System.out.println("-----------------------------------------------------------------------------");
        for(int k=0;k<order[i].length;k++)
         sum=sum+order[i][k].total;
         System.out.println("Net Amount:" +sum);
         System.out.println("-----------------------------------------------------------------------------");
 }
}
}


/*

OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/2$ javac Bill.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/2$ java Bill
Enter number of orders: 1
Enter number of products: 2
Enter product 1 name: Adata SSD
Enter product id:1001
Enter product quantity:2
Enter product unit price:3129
Enter product 2 name:ssd caddy
Enter product id:2255
Enter product quantity:1
Enter product unit price:100
Order No:1
Fri Aug 06 19:29:41 IST 2021
-----------------------------------------------------------------------------
ProductId                 Name                  Quantity Unit_Price      Total
-----------------------------------------------------------------------------
 1001            Adata SSD                         2       3129       6258
 2255            ssd caddy                         1        100        100
-----------------------------------------------------------------------------
Net Amount:6358
-----------------------------------------------------------------------------



*/




