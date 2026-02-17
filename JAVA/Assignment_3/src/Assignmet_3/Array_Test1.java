package Assignmet_3;

import java.util.Scanner;

public class Array_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int []array=new int[5];
      System.out.println("Enter Array elements");
      for(int i=0;i<array.length;i++)
      {
    	  array[i]=sc.nextInt();
      }
      int flg=0;
      for(int i=0;i<array.length;i++)
      {
    	  if(array[i]==30)
    	  {
    		  System.out.println("Element Found at position..."+i);
    		  flg=1;
    	  }
      }
      if(flg==0)
    	  System.out.println("element not found");
      
	}

}
