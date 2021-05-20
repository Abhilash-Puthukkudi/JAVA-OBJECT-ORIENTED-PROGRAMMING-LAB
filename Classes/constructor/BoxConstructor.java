class Box { //box class
    double width;
    double height;
    double depth;
    
    Box()
    { //constructor
        System. out. println ("Constructing Box");
        width  = 1;
        height = 2;
        depth  = 3;
    }
  
    double volume() 
    {
      return width * height * depth;
    } 
}



//main class
class BoxConstructor{
    public static void main(String args[]) {    
        
        Box box = new Box(); //object creation constructor is invoked
        
        System.out.println("VOLUME : "+box.volume());
    

 
    }
}




/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/constructor$ javac BoxConstructor.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/constructor$ java BoxConstructor
Constructing Box
VOLUME : 6.0



*/
