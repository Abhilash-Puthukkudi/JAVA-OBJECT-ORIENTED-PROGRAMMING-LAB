class MultiCatch 
    {
        public static void main(String args[]) {
        try {
        int a = args.length;
        System.out.println("a = " + a);
        int b = 42 / a;
        int c[] = { 1 };
        c[42] = 99;
    
    } catch(ArithmeticException e) {
    
        System.out.println("Divide by 0: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
    
        System.out.println("Array index oob: " + e);
    
    }
    System.out.println("After try/catch blocks.");
    }
}

/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ java MultiCatch
a = 0
Divide by 0: java.lang.ArithmeticException: / by zero
After try/catch blocks.
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ java MultiCatch 3
a = 1
Array index oob: java.lang.ArrayIndexOutOfBoundsException: 42
After try/catch blocks.

*/
