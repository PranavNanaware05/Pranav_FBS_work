package Assignmet_3;

import java.util.Scanner;

public class Array_test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int[] brr = new int[5];
        int[] merged = new int[10];   

       
        System.out.println("Enter 5 elements of first array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("Enter 5 elements of second array:");
        for (int i = 0; i < 5; i++) {
            brr[i] = sc.nextInt();
        }

      
        for (int i = 0; i < 5; i++) {
            merged[i] = arr[i];
        }

      
        for (int i = 0; i < 5; i++) {
            merged[5 + i] = brr[i];
        }

        
        System.out.println("Merged array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(merged[i] + " ");
        }

        
    }
}