/*
 * =====================================================================
 * EXERCISE 9: STRING OPERATIONS USING ARRAYLIST
 * =====================================================================
 * OBJECTIVE: Demonstrate different string operations using ArrayList.
 * CONCEPTS:  ArrayList, add(), addAll(), contains(), remove(),
 *            startsWith()
 * =====================================================================
 */

import java.util.*;

// Main class
public class Ex9_ArrayListExample {
    public static void main(String args[]) {

        // Create first ArrayList
        ArrayList<String> obj1 = new ArrayList<String>();

        // Add elements to the ArrayList
        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("Steve");
        obj1.add("Anuj");

        // Display ArrayList elements
        System.out.println("\nCurrently the array list obj1 has following elements:" + obj1);

        // Append elements at the end
        obj1.add("Babu");
        obj1.add("Kamal");

        // Create second ArrayList
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Alice");
        obj2.add("Bob");
        obj2.add("Raj");

        // Add all elements of obj2 into obj1
        obj1.addAll(obj2);
        System.out.println("\nArrayList obj1 after add All:" + obj1);

        // Add elements at specified indexes
        obj1.add(0, "Rahul");
        obj1.add(1, "Justin");
        System.out.println("\nArrayList obj1 after add element at the given index:" + obj1);

        // Search for an element
        System.out.println("\nEnter the Search element:");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();

        System.out.println("\nArrayList obj1 contains the string " + search + " :" + obj1.contains(search));

        // Remove elements by value
        obj1.remove("Chaitanya");
        obj1.remove("Harry");
        System.out.println("\nCurrent array list of obj1 after removing element is:" + obj1);

        // Remove element by index
        obj1.remove(1);
        System.out.println("\nCurrent array list of obj1 after removing element through index is:" + obj1);

        // Search for strings starting with a given letter
        System.out.println("\nEnter the letter to display all the string start with given letter:");
        search = input.nextLine();

        ArrayList<String> obj3 = new ArrayList<String>();

        for (int i = 0; i < obj1.size(); i++) {
            if (obj1.get(i).startsWith(search.toUpperCase())) {
                obj3.add(obj1.get(i));
            }
        }

        // Display matching strings
        if (obj3.size() > 0) {
            System.out.println("\nArrayList obj1 contains all the string start with given " + search + ":" + obj3);
        } else {
            System.out.println("\nNo Name start with " + search + " letter in Arraylist obj1");
        }

        input.close();
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Currently the array list obj1 has following elements:[Ajeet, Harry, Chaitanya, Steve, Anuj]
 *
 * ArrayList obj1 after add All:[Ajeet, Harry, Chaitanya, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]
 *
 * ArrayList obj1 after add element at the given index:[Rahul, Justin, Ajeet, Harry, Chaitanya, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]
 *
 * Enter the Search element:
 * Babu
 *
 * ArrayList obj1 contains the string Babu :true
 *
 * Current array list of obj1 after removing element is:[Rahul, Justin, Ajeet, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]
 *
 * Current array list of obj1 after removing element through index is:[Rahul, Ajeet, Steve, Anuj, Babu, Kamal, Alice, Bob, Raj]
 *
 * Enter the letter to display all the string start with given letter:
 * R
 *
 * ArrayList obj1 contains all the string start with given R:[Rahul]
 */
