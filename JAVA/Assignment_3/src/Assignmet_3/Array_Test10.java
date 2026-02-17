package Assignmet_3;

import java.util.Scanner;

public class Array_Test10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter Array of size 5");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)//ascending order
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=temp;
				}
				
			}
		
		  System.out.println("Ascending oreder.........");
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(" "+arr[i]);
		  }
		  
		  
		  for(int i=0;i<arr.length-1;i++)//Descending order
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]<arr[j+1])
					{
						int temp=arr[j];
						   arr[j]=arr[j+1];
						   arr[j+1]=temp;
					}
					
				}
			
			  System.out.println("\nDescending oreder.........");
			  for(int i=0;i<arr.length;i++)
			  {
				  System.out.print(" "+arr[i]);
			  }
	}
}


