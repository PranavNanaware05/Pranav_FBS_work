package April_8;

import java.util.Scanner;

public class Quick_sort {
	
	
	public int divide(int[] arr,int beg,int end)
	{
		int pivot=arr[beg];
		int i=beg+1;
	    int	j=end ;
	    while(i<j)
	    {
	    	while(i<=end && arr[i]<pivot)
	    	{
	    		i++;
	    	}//i goes forword
	    	
	    	while(j>=beg && arr[j]>pivot)
	    	{
	    		j--;
	    	}//j goes backword
	    	
	    	if(i<j)
	    	{
	    		int temp=arr[i];
	    		    arr[i]=arr[j];
	    		    arr[j]=temp;
	    	}
	    	
	    }
	    	
	    	
	    arr[beg] = arr[j];
	    arr[j] = pivot;
	    		
	    		return j;
	    	
	    	
	    
		
	}
    public void  quickSort(int []arr,int beg,int end)
     {
    	if(beg<end)
    	{
    		int d=divide(arr,beg,end);
    		quickSort(arr,beg,d-1);
    		quickSort(arr,d+1,end);
    	}
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int beg=0;
		int end=arr.length-1;
		
		Quick_sort qs = new Quick_sort();
		qs.quickSort(arr, beg, end);
		
		System.out.println("Sorted Array:");
		for(int i=0;i<arr.length;i++) {
		    System.out.print(arr[i] + " ");
		}
	}
}
