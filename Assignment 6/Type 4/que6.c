#include<stdio.h>
int greater(int,int,int);
void main()
{
	int a,b,c;
	printf("Enter Three Numbers=");
	scanf("%d%d%d",&a,&b,&c);
	
	int res=greater(a,b,c);
	if(res==1)
	{
		printf("a is greater");
	}
	else if(res==0)
	{
		printf("b is greater");
	}
	else
	{
		printf("c is greater");
	}
}//end of main()
int greater(int a,int b,int c)
{

	if(a>b && a>c)
	{
		return 1;
	}
	else if(b>a && b>c)
	{
		return 0;
	}
	else
	{
		return -1;
	}
}//end of greater()