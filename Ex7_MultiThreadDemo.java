/*
 * =====================================================================
 * EXERCISE 7: IMPLEMENTATION OF A MULTI-THREAD PROGRAM
 * =====================================================================
 * OBJECTIVE: Demonstrate multithreading by generating a random number
 *            and creating a square or cube thread.
 * CONCEPTS:  Threads, Thread Class, run(), start(), Random
 * =====================================================================
 */

import java.util.Random;

// Thread that generates a random number
class NumberThread extends Thread {

    // Generates a number and starts the required thread
    public void run() {
        Random r = new Random();
        int n = r.nextInt(100);

        System.out.println("Generated Number: " + n);

        // If number is even, calculate square
        if (n % 2 == 0) {
            SquareThread t2 = new SquareThread(n);
            t2.start();
        } else {
            // If number is odd, calculate cube
            CubeThread t3 = new CubeThread(n);
            t3.start();
        }
    }
}

// Thread to calculate square
class SquareThread extends Thread {
    int n;

    // Constructor
    SquareThread(int n) {
        this.n = n;
    }

    // Displays square of the number
    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

// Thread to calculate cube
class CubeThread extends Thread {
    int n;

    // Constructor
    CubeThread(int n) {
        this.n = n;
    }

    // Displays cube of the number
    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

// Main class
public class Ex7_MultiThreadDemo {
    public static void main(String[] args) {

        // Create and start number thread
        NumberThread t1 = new NumberThread();
        t1.start();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Generated Number: 24
 * Square of 24 = 576
 *
 * Generated Number: 7
 * Cube of 7 = 343
 *
 * Note: The random number changes each time the program is executed.
 */
