// Create a second thread by extending Thread
class NewThread extends Thread
{
NewThread(String str) 
{
// Create a new, second thread
super(str);
System.out.println("Child thread: " + this);
}
// This is the entry point for the second thread.

public void run() { //New Thread overrides the Thread’s run method:
try 
{
for(int i = 5; i > 0; i--) {
System.out.println("Child Thread: " + i);
Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
} }

class MultiThreadDemo {
    public static void main(String args[]) {

        NewThread nt = new NewThread("   one     "); 
        NewThread nt1 = new NewThread(" two     ");
        NewThread nt2 = new NewThread(" three   ");

nt.start();
nt1.start();
nt2.start();

try 
{
for(int i = 5; i > 0; i--) {
System.out.println("Main Thread: " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}
