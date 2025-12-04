#include<stdio.h>
void main()
{
	int b,e,p=0;
	printf("enter base and exponent=");
	scanf("%d %d",&b,&e);
	for(int i=1;i<=e;i++)
	{
		p=e*i;
	}
	printf("Power=%d",p);
}