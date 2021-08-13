//2.Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)
import java.util.Scanner;

class FibonacciThread implements Runnable{

    public void run(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Numbers for Fibonacci series :");
        int limit = sc.nextInt();
  
       try{
   
            int n1=0,n2=1,n3,i;    
            System.out.println("FIBONACCI : "+n1);   //printing 0 and 1    
            System.out.println("FIBONACCI : "+n2);
              for(i=2;i<limit;++i)//loop starts from 2 because 0 and 1 are already printed    
              {    
                   n3=n1+n2;    
                   System.out.println("FIBONACCI : "+n3);    
                   n1=n2;    
                   n2=n3;    
                   Thread.sleep(250); 
              }    
        
     }catch(InterruptedException e)
     {
            System.out.println("FIBBONACCI INTERRUPTED :"+e);       
     } 
     System.out.println("FIBBONACCI THREAD FINISHED..!");          
    }          

}


        




class EvennumbersThread implements Runnable{
 
 public void run(){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter No of Numbers for Even numbers : ");
    int limit = sc.nextInt();
  
   try{
        int num=2;
        for(int i =1;i<=limit;i++)
        {
            System.out.println("EVEN NO   : "+num);
            Thread.sleep(250);
            num=num+2;
        }
        
     }catch(InterruptedException e)
     {
            System.out.println("EVEN NO INTERRUPTED :"+e);       
     } 
   System.out.println("EVEN THREAD FINISHED..!");          
 }          

}



class FibboEven 
{
    public static void main(String args[])
    {        
            EvennumbersThread EN = new EvennumbersThread(); // instance of implemented class created
            Thread EvenThread = new Thread(EN);             // thread created    
            
            FibonacciThread FN = new FibonacciThread();  // instance of implemented class created
            Thread FibboThread = new Thread(FN);// thread created    
           
            //starting threads 
            EvenThread.start();  
            FibboThread.start();                   
    }
}


/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 7/2. runnable interface$ java FibboEven
Enter No of Numbers for Even numbers : Enter No of Numbers for Fibonacci series :10
10
FIBONACCI : 0
EVEN NO   : 2
FIBONACCI : 1
FIBONACCI : 1
EVEN NO   : 4
FIBONACCI : 2
EVEN NO   : 6
FIBONACCI : 3
EVEN NO   : 8
FIBONACCI : 5
EVEN NO   : 10
FIBONACCI : 8
EVEN NO   : 12
FIBONACCI : 13
EVEN NO   : 14
FIBONACCI : 21
FIBONACCI : 34
EVEN NO   : 16
FIBBONACCI THREAD FINISHED..!
EVEN NO   : 18
EVEN NO   : 20
EVEN THREAD FINISHED..!

*/


