package StackCase_2;

public class Stack {
	
	char arr[];
	int top;
	
	public Stack()
	{
		top=-1;
		arr=new char[5];
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
	
	void push(char ele)
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
	
	public char peek()
	{
		if(isEmpty())
		{
			return '\0';
		}
		else
		{
			return arr[top];
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
