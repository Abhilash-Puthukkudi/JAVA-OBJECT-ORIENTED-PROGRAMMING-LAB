
class myClassThread extends Thread{


  myClassThread(String name){
       
        super(name);
     
  }


 public void run()
 {
   try{
          for(int i=0;i<10;i++){  
          System.out.println(this+"  :"+i);
            Thread.sleep(1000); 
        }
 }
 catch(InterruptedException E)
 {
         System.out.println(E);
  }
 
}

}



class Runnablethread implements Runnable{





  public void run(){
  
  
  
  
  
  try{
          for(int i=5;i>0;i--){  
          System.out.println(this+"  :"+i);
            Thread.sleep(1000); 
        }
 }
 catch(InterruptedException E)
 {
         System.out.println(E);
  }
 
  
  
  }




}








class Mynew {
public static void main(String args[])
{
     // class thread
        myClassThread thread1 = new myClassThread("child");
        thread1.start();
//        thread1.setName("child thread");

       // runnable interface
        Runnablethread MR = new Runnablethread();
        Thread thread2 = new Thread(MR);
        thread2.setName("child2");
        thread2.start();
        




}

}
