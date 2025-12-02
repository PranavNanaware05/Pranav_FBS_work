#include<stdio.h>

void main()
{
	int a,b,c;
	printf("Enter Three Numbers=");
	scanf("%d%d%d",&a,&b,&c);
	
	greater(a,b,c);
}
void greater(int a,int b,int c)
{

	if(a>b && a>c)
	{
		printf("a is greater");
	}
	else if(b>a && b>c)
	{
		printf("b is greater");
	}
	else
	{
		printf("c is greater");
	}
}