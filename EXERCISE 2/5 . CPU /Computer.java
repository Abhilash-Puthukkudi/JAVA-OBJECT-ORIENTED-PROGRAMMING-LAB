//5. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class
//RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.

import java.util.Scanner;

class Cpu{

 
 int price;
 
  //inner class  Processor
  class Processor{  
               
               String Manufacturer, No_of_Cores;

                      //PROCESSOR data input function
                     void inputData(){ 

                        Scanner in = new Scanner(System.in);
            
                            System.out.print("ENTER PROCESSOR MANUFACTURER NAME : ");
                              Manufacturer=in.next();
 
                            System.out.print("ENTER NO.OF.CORES                 : ");
                              No_of_Cores=in.next();
                         }        

                      void display(){
        
               
                            System.out.println("PROCESSOR MANUFACTURER NAME : "+ Manufacturer);
       
                            System.out.println("NO.OF.CORES                 : "+ No_of_Cores); 
                      }

                 }


   //static class Ram
   static class Ram{
                /* A static nested class cannot access non static members of outer class. 
                  A static nested class may be instantiated without instantiating its outer class  
                */
         
              String Manufacturer;
              int memory;

                        void inputData(){ //input method for ram

                           Scanner in = new Scanner(System.in);
   
                               System.out.print("ENTER RAM MANUFACTURER NAME       : ");
                                 Manufacturer=in.next();
 
                               System.out.print("ENTER RAM MEMORY                  : ");
                                 memory=in.nextInt();                
                      }

                         void display(){//ram information displaying method
        
       
                           System.out.println("\nRAM MANUFACTURER NAME       : "+ Manufacturer);
       
                           System.out.println("RAM MEMORY                  : "+ memory);

                     
                          } 
                    }



    void inputData(){ 
   
      Scanner in = new Scanner(System.in);
  
        System.out.print("ENTER CPU PRICE                   : ");
         price=in.nextInt();
    }


   void display(){
        
        System.out.println("CPU PRICE                   : "+ price);       
   }



}


class Computer{

public static void main(String args[]){


   Cpu CPUobject = new Cpu(); // CREATING OBJECT OF Cpu
   Cpu.Ram    RAMobject        = new Cpu.Ram();   // created object of static class Ram 
   Cpu.Processor  PROCESSORobject  = CPUobject.new Processor(); //created object of Processor inner class
   
   
       System.out.println("ENTER CPU DETAILS\n");  
            //CALLING INPUT FUNCTION 
         PROCESSORobject.inputData(); 
         RAMobject.inputData();  
         CPUobject.inputData(); 
         
       System.out.println("\nCPU DETAILS");   
          // CALLING DISPLAY FUNCTION 
          RAMobject.display();
          PROCESSORobject.display();
          CPUobject.display();      
          
              
}}





/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/5 . CPU $ jc Computer.java 
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 2/5 . CPU $ jr Computer
ENTER CPU DETAILS

ENTER PROCESSOR MANUFACTURER NAME : AMD
ENTER NO.OF.CORES                 : 8
ENTER RAM MANUFACTURER NAME       : ADATA
ENTER RAM MEMORY                  : 4096
ENTER CPU PRICE                   : 36000

CPU DETAILS

RAM MANUFACTURER NAME       : ADATA
RAM MEMORY                  : 4096
PROCESSOR MANUFACTURER NAME : AMD
NO.OF.CORES                 : 8
CPU PRICE                   : 36000


*/

