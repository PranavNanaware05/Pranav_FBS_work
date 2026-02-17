package Assignmet_3;

import java.util.Scanner;

public class Array_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []array=new int[5];
		System.out.println("Enter Array elements");

		for(int i=0;i<array.length;i++)
		{
			  array[i]=sc.nextInt();
		}
		System.out.println("even Elements....");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
			
		}
		
		
		System.out.println("Odd Elements....");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}
			
		}
	}

}
