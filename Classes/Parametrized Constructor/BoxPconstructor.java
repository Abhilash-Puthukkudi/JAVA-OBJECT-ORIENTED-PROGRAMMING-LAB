class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) 
    {
        width = w;
        height = h; 
        depth = d; 
    }
   
    void volume()
    {
     System.out.println("VOLUME : "+(width*height*depth));
    }

}

//main class
class BoxPconstructor{
    public static void main(String args[]) {    
        
      
    Box box = new Box(2,6,8); //object creation constructor is invoked
              
    box.volume();//calling method  
    }
}




/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/ParaConstructor$ javac BoxPconstructor.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/ParaConstructor$ java BoxPconstructor
VOLUME : 96.0



*/
