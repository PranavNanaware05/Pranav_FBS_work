package DoublyLinkedList;

import java.util.Scanner;



public class Main {
            public static void main(String args[])
            {
            	Scanner sc = new Scanner(System.in);
                DoublyLinkedList l1 = new DoublyLinkedList();
                
                int choice = 0;
                
                l1.insert(10, 1);
                l1.insert(20, 2);
                
                l1.display();
}}
