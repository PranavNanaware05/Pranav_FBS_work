#include<stdio.h>
void main()
{
	int len;
	printf("enter length=");
	scanf("%d",&len);
	int* a=(int*)malloc(sizeof(int)*len);
	int* b=(int*)malloc(sizeof(int)*len);
	int* c=(int*)malloc(sizeof(int)*len);
	
	
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