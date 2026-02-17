package Assignmet_3;

import java.util.Scanner;

public class Array_Test9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter Array of size 5");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			    arr[i]=arr[arr.length-1-i];
			    arr[arr.length-1-i]=temp;
		}
		
		System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
