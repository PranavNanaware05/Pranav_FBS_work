#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	armstrong(a,5);
}
void armstrong(int*x,int n)
{
	for(int i=0;i<n;i++)
	{
		int org=x[i],rem,c,sum=0;
		while(org>0)
		{
			rem=org%10;
			c=rem*rem*rem;
			sum=sum+c;
			org=org/10;
		}
		if(x[i]==sum)
		{
			printf("%d",x[i]);
		}
	}
}