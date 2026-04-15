package StackCase_2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Equation");
		String s1=sc.next();
		Stack obj=new Stack();
		for(int i=0;i<s1.length();i++)
		{
			char x=s1.charAt(i);
			if(x=='{'||x=='['||x=='(')
			{
				obj.push(x);
			}
			else if(x=='}'||x==']'||x==')')
			{
				if(x =='}' && obj.peek()=='{')
				{
					obj.pop();
				}
				
				else if(x ==']' && obj.peek()=='[')
				{
					obj.pop();
				}
				
				else if(x ==')' && obj.peek()==')')
				{
					obj.pop();
				}
				
				else
				{
					System.out.println("imbalanced");
					break;
				}
			}
		}
		
		if(obj.isEmpty())
		{
			System.out.println("Balanced");
		}

	}

}
