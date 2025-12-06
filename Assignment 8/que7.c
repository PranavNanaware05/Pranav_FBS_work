#include<stdio.h>
void main()
{
	int a[5];
	int b[5];
	int c[5];
	
	printf("\nArray 1=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("\nArray 2=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&b[i]);
	}
	
	printf("Sum=");
	for(int i=0;i<5;i++)
	{
		c[i]=a[i]+b[i];
		printf("%d ",c[i]);
	}
	
	
	
}