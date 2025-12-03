#include<stdio.h>

void main()
{
	int a,b,c;
	printf("Enter Three Numbers=");
	scanf("%d%d%d",&a,&b,&c);
	
	greater(a,b,c);
}
void greater(int a1,int a2,int a3)
{
    int *a=&a1;
    int *b=&a2;
    int *c=&a3;
	if(*a>*b && *a>*c)      //3 4 2
	{
		printf("a is greater");
	}
	else if(*b>*a && *b>*c)
	{
		printf("b is greater");
	}
	else
	{
		printf("c is greater");
	}
}