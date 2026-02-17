package Assignmet_3;

import java.util.Scanner;

public class Array_test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  Scanner sc=new Scanner(System.in);
	  int arr1[]=new int[5];
	  int arr2[]=new int[5];
	  int arr3[]=new int[5];
	  System.out.println("Enter Array 1 elements");
	  for(int i=0;i<arr1.length;i++)
	  {
		  arr1[i]=sc.nextInt();
	  }
	  
	  System.out.println("Enter Array 2 elements");
	  for(int i=0;i<arr1.length;i++)
	  {
		  arr2[i]=sc.nextInt();
	  }
	  
	  for(int i=0;i<arr3.length;i++)
	  {
		  arr3[i]=arr1[i]+arr2[i];
	  }
	  
	  System.out.println("sum of Array elements");
	  for(int i=0;i<arr3.length;i++)
	  {
		  System.out.print(" "+arr3[i]);
	  }
	}

}
