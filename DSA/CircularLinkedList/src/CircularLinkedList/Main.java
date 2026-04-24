package CircularLinkedList;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n===== CIRCULAR LINKED LIST MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();

                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    list.insert(ele, pos);
                    break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();

                    list.delete(delPos);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}