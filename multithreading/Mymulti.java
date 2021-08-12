
//thread Creation using Thread class
class Mythread extends Thread{
     
    public void run(){
    
    try{
       for(int i=10;i>0;i--)
       {
          System.out.println("child thread : "+i);
          Thread.sleep(500);
       }
     
   }catch(InterruptedException E){
   
    System.out.println(E);
   }
   System.out.println("Thread #1  is finished");
   
}
}





class MyRunnable implements Runnable{

 public void run(){
 
    try{
       for(int i=0;i<10;i++)
       {
          System.out.println("child thread : "+i);
          Thread.sleep(500);
       }
     
   }catch(InterruptedException E){
   
    System.out.println(E);
   }
   System.out.println("Thread #2 is finished");
 
 
 
 }

}





class Mymulti {

    public static void main(String args[]){
    
     //using class extend
      Mythread thread1 = new Mythread();
      thread1.start();
   
      //create an instance of implemented class and then pass it to thread class to create thread beacuse in java u canot extend two classes to one class  
      MyRunnable runnableInstance = new MyRunnable();
      Thread thread2 = new Thread(runnableInstance);
        thread2.start();

        
    }
}
