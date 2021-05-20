//box class
class Box {
    double WIDTH;
    double HEIGHT;
    double DEPTH;
}

//main class
class BoxDemo {
    public static void main(String args[]) {    
        
        Box box = new Box(); //object creation
        
        double vol;

        box.WIDTH  = 5;
        box.HEIGHT = 6;
        box.DEPTH  = 3;

        vol = box.WIDTH * box.HEIGHT * box.DEPTH;

        System.out.println ("Volume is " + vol);

    }
}




/*
OUTPUT
--------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes$ javac BoxDemo.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes$ java BoxDemo
Volume is 90.0
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes$ 



*/
