#include<stdio.h>
 void sum();
 void reverse();
 void leap();
void main()
{
	sum();
	reverse();
	leap();
	
}//main is ending here
void sum()
{
	int a,b,res;
	a=10;
	b=20;
	res=a+b;
	printf("sum of %d and %d is %d\n",a,b,res);
}//sum is ending here
void reverse()
{
	int n=123;
	int q1,q2,q3,a, rev=0;
	q1=n%10;
	a=n/10;
	 
	q2=a%10;
	q3=a/10;
	rev=q1*100+q2*10+q3;
	printf("Reverse No=%d \n",rev);
	if(n==rev)
	{
		printf("no is palindrome");
	}
	else
	{
		printf("no is not palidrome");
	} //reverse is ending here
}
	void leap()
	{
	int yr=1900;
	if(yr%4==0 && yr%100!=0||yr%400==0)
	{
		printf("\nLeap Year");
	}
	else
	{
		printf("\nnot Leap year");
	}
	}//leap is ending here

