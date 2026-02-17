package Assignmet_3;

import java.util.Scanner;

public class Array_Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []array=new int[5];
		System.out.println("Enter Array elements");

		for(int i=0;i<array.length;i++)
		{
			  array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i+=2)
		{
			System.out.print(" "+array[i]);
		}
	}

}
