//1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
import java.util.Scanner;
//MULTIPLICATION THREAD CLASS
class MultiplicationThread extends Thread{

        public void run(){
        
           try{     
                    Scanner in = new Scanner(System.in);
                    
                    System.out.print("ENTER LIMIT OF MULTIPLICATION TABLE : ");                    
                    int limit = in.nextInt();
                      
                    for(int i =1; i<=limit;i++)
                    {
                        System.out.println(this+": "+i +" X 5 = "+(i*5));
                        Thread.sleep(250);
                    }
      
        
              }catch(InterruptedException E){
                System.out.println(E);
              }
              System.out.println("MULTIPLICATION TABLE THREAD COMPLETED");       
        }
}

//PRIMENUMBER THREAD CLASS
class PrimenumberThread extends Thread{

    public void run(){
    
      try{
                    Scanner in = new Scanner(System.in);
                    
                    System.out.print("ENTER LIMIT OF PRIME NUMBERS : ");                    
                    int limit = in.nextInt();
                    
                    int count = 0;
                    int num = 2;
                    
                    while(count != limit) 
                    { // while count!= number of prime numbers entered keep searching..
                         boolean prime = true;// to determine whether the number is prime or not
                         for (int i = 2; i <= Math.sqrt(num); i++) { //efficiency matters
                         
                            if (num % i == 0)
                            {
                               prime = false; // if number divides any other number its not a prime so set prime to  false and break the loop.
                               break;
                             }
                         }
                        
                        if(prime)
                        {
                            count++; //count incressing
                            System.out.println(this+": "+num);
                        }
                        num++; //incresing number 
                        Thread.sleep(250);
                    }
                    
                                      
    }catch(InterruptedException E){
        System.out.println(E);
    }
     System.out.println("PRIME NUMBER THREAD COMPLETED");       
}

}




class PrimeMultiplication{

    public static void main(String args[]){
    
    MultiplicationThread MThread = new MultiplicationThread(); // multiplication thread created
    PrimenumberThread PThread = new PrimenumberThread();  // prime number thread created
    MThread.setName("MULTIPLICATION ");
    PThread.setName("PRIME NUMBER   ");
          //starting Threads
            MThread.start();      
            PThread.start();
   
    }

}

/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 7$ javac PrimeMultiplication.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 7$ java PrimeMultiplication
ENTER LIMIT OF MULTIPLICATION TABLE : ENTER LIMIT OF PRIME NUMBERS : 10
5
Thread[PRIME NUMBER   ,5,main]: 2
Thread[MULTIPLICATION ,5,main]: 1 X 5 = 5
Thread[PRIME NUMBER   ,5,main]: 3
Thread[MULTIPLICATION ,5,main]: 2 X 5 = 10
Thread[MULTIPLICATION ,5,main]: 3 X 5 = 15
Thread[PRIME NUMBER   ,5,main]: 5
Thread[MULTIPLICATION ,5,main]: 4 X 5 = 20
Thread[MULTIPLICATION ,5,main]: 5 X 5 = 25
Thread[PRIME NUMBER   ,5,main]: 7
Thread[MULTIPLICATION ,5,main]: 6 X 5 = 30
Thread[MULTIPLICATION ,5,main]: 7 X 5 = 35
Thread[MULTIPLICATION ,5,main]: 8 X 5 = 40
Thread[MULTIPLICATION ,5,main]: 9 X 5 = 45
Thread[PRIME NUMBER   ,5,main]: 11
Thread[MULTIPLICATION ,5,main]: 10 X 5 = 50
PRIME NUMBER THREAD COMPLETED
MULTIPLICATION TABLE THREAD COMPLETED



*/


