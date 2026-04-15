package april_01_2026;

import java.util.Scanner;

public class BinarySearchExample {
	public static int binarySearch(int arr[],int ele)
	{
		
		int beg=0;
		int end=arr.length-1;
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			
			if(arr[mid]==ele)
			{
				
				return mid;
			}
			else if(ele<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		return -1;
		
		
		
		
	}
    
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 boolean found;
	 System.out.println("enter array Size");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter element to search:");
	 int ele=sc.nextInt();
	 int result = binarySearch(arr, ele);
	 if(result==-1)
	 {
		 System.out.println("not found");
	 }
	 else
		 
	 {
		 System.out.println("found at index "+result);
	 }
	}
}
