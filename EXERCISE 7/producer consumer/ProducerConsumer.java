//3. Producer/Consumer using ITC

class Q {
	int n;
	
	boolean valueSet = false;

	synchronized int get() {
		while(!valueSet)
		try {
			wait();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}

		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueSet)
		try {
			wait();
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}

		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}
class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Producer");
	}
	public void run() {
		int i = 0;

		while(true) {
			q.put(i++);
		}
	}
}
class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q) {
		this.q = q;
		t = new Thread(this, "Consumer");
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
class ProducerConsumer {
	public static void main(String args[]) {
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		// Start the threads.
		p.t.start();
		c.t.start();

		System.out.println("Press Control-C to stop.");
	}
}


/*
output
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 7/producer consumer$ javac ProducerConsumer.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 7/producer consumer$ java ProducerConsumer
Press Control-C to stop.
Put: 0
Got: 0
Put: 1
Got: 1
Put: 2
Got: 2
Put: 3
Got: 3

*/

Verified
