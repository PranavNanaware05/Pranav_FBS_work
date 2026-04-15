package April_3;
import java.util.Scanner;

public class SelectionSortExample {

	public static int[] selectionsort(int arr[],int n)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
				
			//swap
			
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		return arr;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int [] selection=selectionsort(arr, n);
		
		for(int i=0;i<selection.length;i++)
		{
			System.out.print(" "+selection[i]);
		}

	}

}
