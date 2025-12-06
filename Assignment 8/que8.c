#include<stdio.h>
void main()
{
	int a[5];
	printf("Enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\nReverse Array=");
	for(int i=4;i>=0;i--)
	{
		printf("%d ",a[i]);
	}
}