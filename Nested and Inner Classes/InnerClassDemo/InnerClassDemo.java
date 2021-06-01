class Outer {

 int outer_varible = 100;
 
 void test() 
 {

    Inner inner = new Inner(); // object of inner class
    inner.display();

    }
        // this is an inner class
        class Inner
        {
            void display() {

                System.out.println("display: outer_varible = " + outer_varible);
            }
        }

}

class InnerClassDemo
{

public static void main(String args[])
{

Outer outer = new Outer(); //outer class object
outer.test();// calling test function

}

}
