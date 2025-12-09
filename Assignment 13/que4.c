#include<stdio.h>
void main()
{
	int len;
	printf("enter length=");
	scanf("%d",&len);
	int *a=(int*)malloc(sizeof(int)*len);
	printf("\nEven elements of an array=");
	for(int i=0;i<len;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\neven elements of an array=");
	for(int i=0;i<5;i++)
	{
		if(a[i]%2==0)
		{
			printf("%d,",a[i]);
		}
	}
	
	printf("\nOdd elements of an array=");
	for(int i=0;i<5;i++)
	{
		if(a[i]%2==1)
		{
			printf("%d,",a[i]);
		}
	}
}