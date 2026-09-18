/*
 * =====================================================================
 * EXERCISE 5: ADT STACK USING EXCEPTION HANDLING
 * =====================================================================
 * OBJECTIVE: Implement a stack using an array and exception handling.
 * CONCEPTS:  Interface, Stack, Array, Exception Handling
 * =====================================================================
 */

import java.io.*;

// Interface defining stack operations
interface Mystack {
    void push();
    void pop();
    void display();
}

// Stack implementation using an array
class Stack_array implements Mystack {
    final int n = 5;
    int stack[] = new int[n];
    int top = -1;

    // Method: Push an element into the stack
    public void push() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Check for stack overflow
            if (top == n - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            System.out.print("Enter the element: ");
            int ele = Integer.parseInt(br.readLine());
            stack[++top] = ele;
        } catch (Exception e) {
            // Handle input exceptions
            System.out.println(e);
        }
    }

    // Method: Remove the top element from the stack
    public void pop() {
        // Check for stack underflow
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped Element: " + stack[top]);
        top--;
    }

    // Method: Display stack elements
    public void display() {
        // Check whether stack is empty
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

// Main class
public class Ex5_StackException {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack_array stk = new Stack_array();
        int ch;

        // Repeat menu until the user chooses Exit
        do {
            System.out.println("\n*** STACK USING ARRAY ***");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    stk.push();
                    break;

                case 2:
                    stk.pop();
                    break;

                case 3:
                    stk.display();
                    break;

                case 4:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 4);
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * *** STACK USING ARRAY ***
 * 1. Push
 * 2. Pop
 * 3. Display
 * 4. Exit
 * Enter your choice: 1
 * Enter the element: 10
 *
 * *** STACK USING ARRAY ***
 * 1. Push
 * 2. Pop
 * 3. Display
 * 4. Exit
 * Enter your choice: 1
 * Enter the element: 20
 *
 * *** STACK USING ARRAY ***
 * 1. Push
 * 2. Pop
 * 3. Display
 * 4. Exit
 * Enter your choice: 3
 * Stack Elements:
 * 20
 * 10
 */
