package Assignmet_3;

import java.util.Scanner;

public class Array_Test2 {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
int []array=new int[5];
System.out.println("Enter Array elements");

for(int i=0;i<array.length;i++)
{
	  array[i]=sc.nextInt();
}

    int max=array[0];
    int min=array[0];

     for(int i=0;i<array.length;i++)
     {
    	 if(array[i]>max)
    	 {
    		 max=array[i];
    		 
    	 }
    	 if(array[i]<min)
    	 {
    		 min=array[i];
    	 }
     }
     
     System.out.println("max element:"+max);
     System.out.println("min element:"+min);
         
	}
}
