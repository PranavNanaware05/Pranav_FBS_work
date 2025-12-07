#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	sumfl(a,5);
}
void sumfl(int *x,int n)
{
	for(int i=0;i<n;i++)
	{
		int rem,sum=0,temp=x[i];
		rem=temp%10;
		while(temp>=10)
		{
			temp=temp/10;
		}
		sum=rem+temp;
		printf("%d ",sum);
	}
}