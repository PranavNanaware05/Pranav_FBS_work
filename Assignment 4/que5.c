#include<stdio.h>
void main()
{
	int n,no;
	printf("Enter no=");
	scanf("%d",&no);
	printf("1.To check number is even or odd.\n2.To check number is prime or not.\n3.To check number is pallindrome or not.\n4.To check number is positive, negative or zero.\n5.To reverse a number.\n6.To find sum of digits.\n");
	printf("enter Your Choice=");
	scanf("%d",&n);
	if(n==1)
	{
		if(no%2==0)
		{
			printf("\n no is Even");
		}
		else
		{
			printf("\n no is odd");
		}
	}
	
	
	else if(n==2)
	{
		int flg=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flg=1;
				break;
			}
		}
		if(flg==0)
		{
			printf("Prime no");
		}
		else
		{
			printf("not Prime no");
		}
	}
	else if(n==3)
	{
		int rev=0,rem,org=no;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(org==rev)
		{
			printf("Palindrome no");
		}
		else
		{
			printf("not Palindrome");
		}
	}
	else if(n==4)
	{
	   if(no>0)
	   {
	   	printf("\n Positive No");
		}
		else
		{
			printf("\n Negative Number");
		}	
	}
	else if(n==5)
	{
		int rem,rev=0;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		printf("Reverse No=%d",rev);
	}
	else if(n==6)
	{
		int rem,sum=0;
		while(no>0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		printf("Sum of Digits=%d",sum);
	}
	else
	{
		printf("please enter correct no");
	}
}