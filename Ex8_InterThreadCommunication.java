/*
 * =====================================================================
 * EXERCISE 8: INTER-THREAD COMMUNICATION
 * =====================================================================
 * OBJECTIVE: Demonstrate communication between producer and consumer
 *            threads using wait() and notifyAll().
 * CONCEPTS:  Threads, Synchronization, wait(), notifyAll()
 * =====================================================================
 */

// Shared resource used by producer and consumer
class SharedResource {
    private int value;
    private boolean available = false;

    // Produces a value into the shared resource
    synchronized void produce(int value) {
        try {
            // Wait while a value is already available
            while (available) {
                wait();
            }

            this.value = value;
            available = true;

            System.out.println("Produced: " + value);

            // Notify waiting consumer thread
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Consumes a value from the shared resource
    synchronized void consume() {
        try {
            // Wait until a value is available
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + value);
            available = false;

            // Notify waiting producer thread
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Producer thread
class Producer extends Thread {
    SharedResource resource;

    // Constructor
    Producer(SharedResource resource) {
        this.resource = resource;
    }

    // Produces five values
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    SharedResource resource;

    // Constructor
    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    // Consumes five values
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

// Main class
public class Ex8_InterThreadCommunication {
    public static void main(String[] args) {

        // Create shared resource
        SharedResource resource = new SharedResource();

        // Create producer and consumer
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        // Start both threads
        producer.start();
        consumer.start();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Produced: 1
 * Consumed: 1
 * Produced: 2
 * Consumed: 2
 * Produced: 3
 * Consumed: 3
 * Produced: 4
 * Consumed: 4
 * Produced: 5
 * Consumed: 5
 */
