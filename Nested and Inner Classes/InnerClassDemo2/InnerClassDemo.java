class Outer {//outer class
   
  int outer_x = 100;
        
  void test() {

        Inner inner = new Inner();
        inner.display();

        }

        // this is an inner class
        class Inner {
            int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }

}

    void showy()//outer class method 
    {
          System.out.println(y);  
         /*
                 this block will cause error because y's scope is inside inner class we can access the y varibles using inner class object
        
                 ->  InnerClassDemo.java:24: error: cannot find symbol
                     System.out.println(y);
                           ^
                        symbol:   variable y
                        location: class Outer   
                        1 error 
            */
   
        }
}//end of outer class


//main class 
class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
