package Stack;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        Stack s1 = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();
                    s1.push(ele);
                    break;

                case 2:
                    s1.pop();
                    System.out.println("Element popped");
                    break;

                case 3:
                    System.out.print("Top element: ");
                    s1.peek();
                    break;

                case 4:
                    s1.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        
    }
}