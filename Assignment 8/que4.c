#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
		
	}
	printf("\nEven elements of an array=");
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