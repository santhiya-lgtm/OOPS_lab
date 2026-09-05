import java.util.Scanner;

class ElectricityBill {
    String name;
    int units;
    double bill;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter consumer name: ");
        name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
    }

    void calculateBill() {
        if (units <= 100)
            bill = units * 1.5;
        else if (units <= 200)
            bill = 100 * 1.5 + (units - 100) * 2.5;
        else if (units <= 500)
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        else
            bill = 100 * 1.5 + 100 * 2.5 + 300 * 4.0
                   + (units - 500) * 6.0;
    }

    void display() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name : " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill    : Rs." + bill);
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricityBill obj = new ElectricityBill();

        obj.getData();
        obj.calculateBill();
        obj.display();
    }
}
Enter consumer name: Santhiya
Enter units consumed: 250

--- Electricity Bill ---
Consumer Name : Santhiya
Units Consumed: 250
Total Bill    : Rs.500.0
