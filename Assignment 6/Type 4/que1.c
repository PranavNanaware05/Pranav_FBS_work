#include<stdio.h>
int sum(int,int);
void main()
{
	int a,b;
	printf("Enter two numbers=");
	scanf("%d%d",&a,&b);
	int res=sum(a,b);
	printf("%d",res);
	
}//main ends here

int sum(int a,int b)
{
	int c=0;
	a=10;
	b=20;
	c=a+b;
	return c;
}//sum ends here