/*
 * =====================================================================
 * EXERCISE 3: INHERITANCE PROGRAM FOR AN EMPLOYEE CLASS
 * =====================================================================
 * OBJECTIVE: Demonstrate inheritance by creating different employee
 *            designation classes derived from the Employee class.
 * CONCEPTS:  Inheritance, Classes, Objects, Constructors, Methods
 * =====================================================================
 */

import java.util.*;

// Represents common employee information
class Employee {
    String emp_name;
    int emp_id;
    String address;
    String mail_id;
    String mob_number;

    // Constructor: Initializes employee details
    Employee(String emp_name, int emp_id, String address, String mail_id, String mob_number) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.mail_id = mail_id;
        this.mob_number = mob_number;
    }

    // Method: Displays common employee details
    void display() {
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee ID   : " + emp_id);
        System.out.println("Address       : " + address);
        System.out.println("Mail ID       : " + mail_id);
        System.out.println("Mobile Number : " + mob_number);
    }
}

// Programmer class inherits Employee
class Programmer extends Employee {
    double basicpay, da, hra, pf, fund, grosssalary, netsalary;

    // Constructor
    Programmer(String emp_name, int emp_id, String address, String mail_id,
               String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    // Method: Calculates salary components
    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    // Method: Displays programmer pay slip
    void disp() {
        System.out.println("\n***** PROGRAMMER PAY SLIP *****");
        display();
        System.out.println("Basic Pay     : " + basicpay);
        System.out.println("Gross Salary  : " + grosssalary);
        System.out.println("Net Salary    : " + netsalary);
    }
}

// AssistantProfessor class inherits Employee
class AssistantProfessor extends Employee {
    double basicpay, da, hra, pf, fund, grosssalary, netsalary;

    // Constructor
    AssistantProfessor(String emp_name, int emp_id, String address, String mail_id,
                      String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    // Method: Calculates salary components
    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    // Method: Displays assistant professor pay slip
    void disp() {
        System.out.println("\n***** ASSISTANT PROFESSOR PAY SLIP *****");
        display();
        System.out.println("Basic Pay     : " + basicpay);
        System.out.println("Gross Salary  : " + grosssalary);
        System.out.println("Net Salary    : " + netsalary);
    }
}

// AssociateProfessor class inherits Employee
class AssociateProfessor extends Employee {
    double basicpay, da, hra, pf, fund, grosssalary, netsalary;

    // Constructor
    AssociateProfessor(String emp_name, int emp_id, String address, String mail_id,
                      String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    // Method: Calculates salary components
    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    // Method: Displays associate professor pay slip
    void disp() {
        System.out.println("\n***** ASSOCIATE PROFESSOR PAY SLIP *****");
        display();
        System.out.println("Basic Pay     : " + basicpay);
        System.out.println("Gross Salary  : " + grosssalary);
        System.out.println("Net Salary    : " + netsalary);
    }
}

// Professor class inherits Employee
class Professor extends Employee {
    double basicpay, da, hra, pf, fund, grosssalary, netsalary;

    // Constructor
    Professor(String emp_name, int emp_id, String address, String mail_id,
              String mob_number, double bp) {
        super(emp_name, emp_id, address, mail_id, mob_number);
        basicpay = bp;
    }

    // Method: Calculates salary components
    void getPaySlip() {
        da = basicpay * 97 / 100;
        hra = basicpay * 10 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;
        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    // Method: Displays professor pay slip
    void disp() {
        System.out.println("\n***** PROFESSOR PAY SLIP *****");
        display();
        System.out.println("Basic Pay     : " + basicpay);
        System.out.println("Gross Salary  : " + grosssalary);
        System.out.println("Net Salary    : " + netsalary);
    }
}

// Main class
public class Ex3_Inheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read employee details
        System.out.print("Enter Employee Name: ");
        String name = in.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = in.nextInt();
        in.nextLine();

        System.out.print("Enter Address: ");
        String add = in.nextLine();

        System.out.print("Enter Mail ID: ");
        String mail = in.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mob = in.nextLine();

        System.out.print("Enter Basic Pay: ");
        double bp = in.nextDouble();

        // Display designation menu
        System.out.println("\nChoose Designation");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.println("5. Exit");

        System.out.print("Enter Choice: ");
        int desg = in.nextInt();

        // Create object based on selected designation
        switch (desg) {
            case 1:
                Programmer p = new Programmer(name, id, add, mail, mob, bp);
                p.getPaySlip();
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(name, id, add, mail, mob, bp);
                ap.getPaySlip();
                ap.disp();
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor(name, id, add, mail, mob, bp);
                asp.getPaySlip();
                asp.disp();
                break;

            case 4:
                Professor pr = new Professor(name, id, add, mail, mob, bp);
                pr.getPaySlip();
                pr.disp();
                break;

            case 5:
                System.out.println("Program Exited.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        in.close();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Enter Employee Name: Arun
 * Enter Employee ID: 201
 * Enter Address: Chennai
 * Enter Mail ID: arun@gmail.com
 * Enter Mobile Number: 9876543210
 * Enter Basic Pay: 45000
 *
 * Choose Designation
 * 1. Programmer
 * 2. Assistant Professor
 * 3. Associate Professor
 * 4. Professor
 * 5. Exit
 * Enter Choice: 2
 *
 * ***** ASSISTANT PROFESSOR PAY SLIP *****
 *
 * Employee Name : Arun
 * Employee ID   : 201
 * Address       : Chennai
 * Mail ID       : arun@gmail.com
 * Mobile Number : 9876543210
 * Basic Pay     : 45000.0
 * Gross Salary  : 98595.0
 * Net Salary    : 93150.0
 */
