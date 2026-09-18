/*
 * =====================================================================
 * EXERCISE 1: ELECTRICITY BILL CALCULATION
 * =====================================================================
 * OBJECTIVE: Calculate an electricity bill based on units consumed and
 *            connection type.
 * CONCEPTS:  Class, Object, Methods, Scanner, Conditional Statements
 * =====================================================================
 */

import java.util.Scanner;

// Represents an electricity bill
class ElectricityBill {
    int consumerNo, previousReading, currentReading, units;
    String consumerName, type;
    double bill = 0;

    // Method: Reads consumer details
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        currentReading = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        type = sc.nextLine();

        // Calculate units consumed
        units = currentReading - previousReading;
    }

    // Method: Calculates bill according to connection type and units
    void calculateBill() {

        // Domestic connection
        if (type.equalsIgnoreCase("Domestic")) {
            if (units <= 100)
                bill = units * 1.5;
            else if (units <= 200)
                bill = (100 * 1.5) + ((units - 100) * 3);
            else if (units <= 500)
                bill = (100 * 1.5) + (100 * 3) + ((units - 200) * 4.5);
            else
                bill = (100 * 1.5) + (100 * 3) + (300 * 4.5) + ((units - 500) * 7);

        // Commercial connection
        } else if (type.equalsIgnoreCase("Commercial")) {
            if (units <= 100)
                bill = units * 2.5;
            else if (units <= 200)
                bill = (100 * 2.5) + ((units - 100) * 5);
            else if (units <= 500)
                bill = (100 * 2.5) + (100 * 5) + ((units - 200) * 6.5);
            else
                bill = (100 * 2.5) + (100 * 5) + (300 * 6.5) + ((units - 500) * 9);
        }
    }

    // Method: Displays electricity bill
    void display() {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Number : " + consumerNo);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Connection Type : " + type);
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount : Rs. " + bill);
    }

    // Main method
    public static void main(String args[]) {
        ElectricityBill obj = new ElectricityBill();

        // Read data, calculate bill and display result
        obj.getData();
        obj.calculateBill();
        obj.display();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Enter Consumer Number: 101
 * Enter Consumer Name: Kumar
 * Enter Previous Reading: 1200
 * Enter Current Reading: 1450
 * Enter Connection Type (Domestic/Commercial): Domestic
 *
 * ----- Electricity Bill -----
 * Consumer Number : 101
 * Consumer Name : Kumar
 * Connection Type : Domestic
 * Units Consumed : 250
 * Bill Amount : Rs. 675.0
 */
