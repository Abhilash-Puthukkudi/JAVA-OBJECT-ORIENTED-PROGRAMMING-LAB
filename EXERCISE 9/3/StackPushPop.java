import java.util.*;

class Stack<T>{

     ArrayList<T> elements;

         public Stack( int capacity){ // constructor
    
            elements = new ArrayList<T>(capacity);  //initialize size of arraylist    
         }
      
      public void push( T element ){ //push function
      
       elements.add(element);
      
      }
      
    public T pop(){ //pop function
    
        return elements.remove(elements.size()-1);
    }
    public void display(){
    
    System.out.println("Stack : " + elements);
    }

}

class StackPushPop{

    public static void main(String args[]){
            
            Scanner in = new Scanner(System.in);
            
  
            System.out.print("Enter initial capacity of Stack : ");
            int size = Integer.parseInt(in.nextLine()); // reading size of stack
            
            System.out.println(" 1.INTEGER STACK \n 2. STRING STACK \n ");
            System.out.print("Choose your option : ");
            int option = Integer.parseInt(in.nextLine()); // reading option
            int opt =0;
            switch(option){
                
                case 1  :   //integer stack  
                           
                            Stack<Integer> IS = new Stack<>(size);
                            
                                           while(opt!=4)
                                           {            
                                                 System.out.println(" 1. PUSH() \n 2.POP() \n 3.DISPLAY \n 4.EXIT");
                                                     System.out.print("Choose your option : ");
                                                  opt = Integer.parseInt(in.nextLine());          
                                                
                                                  switch(opt)
                                                   {
                                                     case 1: 
                                                              System.out.print("Enter Element : ");
                                                              int number = Integer.parseInt(in.nextLine());
                                                              IS.push(number);  
                                                              break;
                                                     case 2 : 
                                                                if(IS.elements.size()>0){
                                                                IS.pop();
                                                                System.out.print("item poped");
                                                                }
                                                                else
                                                                    System.out.println("Stack is empty");  
                                                                break;  
                                                     case 3 : 
                                                              IS.display();  
                                                              break;          
                                                              
                                                                        
                                                    }//end of inner switch 
                                            }//enf of inner while 
                            break;
                             
                case 2  :   //String Stack
                                    Stack<String> SS = new Stack<>(size);
                                    opt =0;
                                           while(opt!=4)
                                           {            
                                                 System.out.println(" 1. PUSH() \n 2.POP() \n 3.DISPLAY \n 4.EXIT");
                                                     System.out.print("Choose your option : ");
                                                  opt = Integer.parseInt(in.nextLine());          
                                                
                                                  switch(opt)
                                                   {
                                                     case 1: 
                                                              System.out.print("Enter Element : ");
                                                              String str = in.nextLine();
                                                              SS.push(str);  
                                                              break;
                                                     case 2 : 
                                                              if(SS.elements.size()>0){
                                                                SS.pop();
                                                                System.out.print("item poped");
                                                              }
                                                              else
                                                               System.out.println("Stack is empty");  
                                                              break;       
                                                     case 3 : 
                                                              SS.display();  
                                                              break;         
                                                                  
                                                    }//end of inner switch 
                                            }//enf of inner while 
                            break;
                                                                                 
          
                  }         
        }
}

