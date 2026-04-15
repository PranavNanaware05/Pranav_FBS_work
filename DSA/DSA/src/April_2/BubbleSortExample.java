package April_2;

import java.util.Scanner;

public class BubbleSortExample {
	
	public static int[] BubbleSort(int arr[],int n)
	{
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
		return arr;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		 int[] sorted = BubbleSort(arr, n);
		 
		 for(int i=0;i<sorted.length;i++)
		 {
			 System.out.print(" "+sorted[i]);
		 }
		
	}

}
