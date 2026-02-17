package Assignmet_3;

import java.util.Scanner;

public class Array_Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter Array of size 5");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=temp;
				}
				
			}
		}
		
		
			System.out.print(" "+arr[arr.length-2]);
		
	}

}
