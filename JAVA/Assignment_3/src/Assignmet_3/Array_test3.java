package Assignmet_3;

import java.util.Scanner;

public class Array_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []array=new int[5];
		System.out.println("Enter Array elements");

		for(int i=0;i<array.length;i++)
		{
			  array[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum of array elements:"+sum);
	}

}
