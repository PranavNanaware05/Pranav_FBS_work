package Stack;

import java.util.Arrays;

public class Stack {
	
	int arr[];
	int top;
	
	public Stack()
	{
		top=-1;
		arr=new int[5];
	}//default constructor
	
	boolean isFull()
	{
		if(arr.length-1==top)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			arr[top]=ele;
		}
		
	}
	
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is undefined");
		}
		
		else
		{
			top--;
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underFlow");
		}
		else
		{
			System.out.println(arr[top]);
		}
	}

	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow");
			
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
			   System.out.println(arr[i]+" ");
			}
		}
	}


}
