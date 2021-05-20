class Box { //box class
    double WIDTH, HEIGHT, DEPTH;
    
    void volume() { //method volume
        System.out.print("Volume is ");
        System.out.println(WIDTH * HEIGHT * DEPTH);
     }
}

//main class
class BoxDemo {
    public static void main(String args[]) {    
        
        Box box = new Box(); //object creation
        
        

        box.WIDTH  = 5;
        box.HEIGHT = 6;
        box.DEPTH  = 3;

        box.volume();//calling volume method

       

    }
}

/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/BoxMethod$ javac BoxDemo.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/classes/BoxMethod$ java BoxDemo
Volume is 90.0

*/
