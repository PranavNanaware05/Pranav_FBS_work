package Assignmet_3;

import java.util.Scanner;

public class Array_test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []array=new int[5];
		System.out.println("Enter Array elements");

		for(int i=0;i<array.length;i++)
		{
			  array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			int j=2, n=array[i],flg=0;
			while(j<n)
			{
				if(n%j==0)
				{
					flg=1;
					break;
				}
				j++;
			}
			if(flg==0)
			{
				System.out.println(" "+array[i]);
			}
		}
	}

}
