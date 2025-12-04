#include<stdio.h>
void main()
{
	for(int j=10;j<=15;j++)
	{
		int a=j;
		printf("\n %d=",a);
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				printf("%d,",i);
			}
		}
	}
}