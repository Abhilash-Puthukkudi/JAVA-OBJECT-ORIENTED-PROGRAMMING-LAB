class Exc2 {

public static void main(String args[]) {

    int d, a;
    try { // monitor a block of code.

        d = 0;
        a = 42 / d;
        System.out.println("This will not be printed.");

        } catch (ArithmeticException e) { // catch divide-by-zero error

            System.out.println("Exception: " + e);

        }
            System.out.println("After catch statement.");

    }

 }
 
 /*
 output
 ------
 ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ javac MultiCatch.java
 ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ java MultiCatch 3
 a = 1
 Array index oob: java.lang.ArrayIndexOutOfBoundsException: 42
 After try/catch blocks.

 */
