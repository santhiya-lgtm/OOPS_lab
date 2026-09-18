/*
 * =====================================================================
 * EXERCISE 2: UNIT AND CURRENCY CONVERTER
 * =====================================================================
 * OBJECTIVE: Perform currency, distance and time conversions using a
 *            menu-driven Java program.
 * CONCEPTS:  Scanner, Switch Case, Arithmetic Operations
 * =====================================================================
 */

import java.util.Scanner;

// Main class
public class Ex11_Converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display conversion options
        System.out.println("1. Dollar to INR");
        System.out.println("2. Euro to INR");
        System.out.println("3. Yen to INR");
        System.out.println("4. Meter to KM");
        System.out.println("5. KM to Meter");
        System.out.println("6. Hours to Minutes");
        System.out.println("7. Minutes to Seconds");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        // Perform conversion according to user's choice
        switch (choice) {
            case 1:
                System.out.println("INR = " + (value * 83.5));
                break;

            case 2:
                System.out.println("INR = " + (value * 90.5));
                break;

            case 3:
                System.out.println("INR = " + (value * 0.58));
                break;

            case 4:
                System.out.println("KM = " + (value / 1000));
                break;

            case 5:
                System.out.println("Meter = " + (value * 1000));
                break;

            case 6:
                System.out.println("Minutes = " + (value * 60));
                break;

            case 7:
                System.out.println("Seconds = " + (value * 60));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * 1. Dollar to INR
 * 2. Euro to INR
 * 3. Yen to INR
 * 4. Meter to KM
 * 5. KM to Meter
 * 6. Hours to Minutes
 * 7. Minutes to Seconds
 * Enter your choice: 1
 * Enter value: 10
 * INR = 835.0
 */
