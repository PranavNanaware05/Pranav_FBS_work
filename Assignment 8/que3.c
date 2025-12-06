#include<stdio.h>
void main()
{
	int a[5];
	int sum=0;
	printf("enter 5 Elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	for(int i=0;i<5;i++)
	{
		sum=sum+a[i];
	}
	printf("Sum of elements is=%d",sum);
	
}