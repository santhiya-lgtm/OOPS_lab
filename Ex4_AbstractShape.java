/*
 * =====================================================================
 * EXERCISE 4: CREATE AN ABSTRACT CLASS - SHAPE CLASS
 * =====================================================================
 * OBJECTIVE: Demonstrate the use of an abstract class and abstract
 *            methods to calculate areas of different shapes.
 * CONCEPTS:  Abstract Class, Abstract Method, Inheritance, Objects
 * =====================================================================
 */

import java.util.*;

// Abstract class Shape
abstract class Shape {
    public int x, y;

    // Abstract method: implemented by child classes
    public abstract void printArea();
}

// Rectangle class inherits Shape
class Rectangle1 extends Shape {

    // Method: Calculates and displays rectangle area
    public void printArea() {
        float area;
        area = x * y;
        System.out.println("Area of Rectangle is " + area);
    }
}

// Triangle class inherits Shape
class Triangle extends Shape {

    // Method: Calculates and displays triangle area
    public void printArea() {
        float area;
        area = (x * y) / 2.0f;
        System.out.println("Area of Triangle is " + area);
    }
}

// Circle class inherits Shape
class Circle extends Shape {

    // Method: Calculates and displays circle area
    public void printArea() {
        float area;
        area = (22.0f * x * x) / 7.0f;
        System.out.println("Area of Circle is " + area);
    }
}

// Main class
public class Ex4_AbstractShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and breadth
        System.out.print("Enter Length and Breadth: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        // Create Rectangle object and calculate area
        Rectangle1 r = new Rectangle1();
        r.x = x1;
        r.y = y1;
        r.printArea();

        // Create Triangle object and calculate area
        Triangle t = new Triangle();
        t.x = x1;
        t.y = y1;
        t.printArea();

        // Create Circle object and calculate area
        Circle c = new Circle();
        c.x = x1;
        c.printArea();

        sc.close();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Enter Length and Breadth: 10
 * 5
 * Area of Rectangle is 50.0
 * Area of Triangle is 25.0
 * Area of Circle is 314.2857
 */
