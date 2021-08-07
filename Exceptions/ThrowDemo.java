class ThrowDemo {
//The method demoproc throws a NullPointerException
//exception which is immediately caught in the try block and
//re-thrown:

static void demoproc() {

try {

    throw new NullPointerException("demo");

    } catch(NullPointerException e) {

    System.out.println("Caught inside demoproc.");
    throw e;

}
}

public static void main(String args[]) {
    try {

        demoproc();

    } catch(NullPointerException e) {

    System.out.println("Recaught: " + e);

        }
    }
}
