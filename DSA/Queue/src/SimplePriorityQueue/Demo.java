package SimplePriorityQueue;

import java.util.Scanner;

import CircularQueue.Queue;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Queue");
		int size=sc.nextInt();
		Queue1 queue=new Queue1(size);
		
		
		
		while(true) {
			 System.out.println("\n1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();

	            switch(choice) {

	                case 1:
	                    System.out.print("Enter String: ");
	                    String s = sc.next();
	                    queue.insert(s);
	                    break;

	                case 2:
	                    queue.delete();
	                    System.out.println("Element deleted ");
	                    break;

	                case 3:
	                    queue.display();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                default:
	                    System.out.println("Invalid choice");
	            }
	        
		}

	}

}