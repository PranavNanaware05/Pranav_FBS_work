package QueueUsingLinkedList;

import java.util.Scanner;

public class Queuemain {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
			 LinkedListQueue queue = new LinkedListQueue();
				int choice=0;
				
				while(choice!=4) {
					System.out.println("\n1.Enqueue\n2.delete\n3.Display\n4.Exit");
					System.out.println("Enter Your Choice: ");
					choice = sc.nextInt();
					
					switch(choice) {
						case 1:{
							
							System.out.println("\nEnter a number to insert: ");
							int numToEnqueue = sc.nextInt();
							queue.enqueue(numToEnqueue);
							break;
							
						}
						case 2:{
							
							queue.delete();
							break;
							
						}
						case 3:{
							
							queue.display();
							break;
							
						}
						case 4:{
							System.out.println("Exit");
							break;
						}
					}
				}
			}

	}


