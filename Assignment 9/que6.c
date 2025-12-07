#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	sorting(a,5);
	
		for(int i=0;i<5;i++)
	{
		printf("%d ",a[i]);
	}
	
}
void sorting(int *x,int n)
{
	int j;
	for(int i=0;i<n-1;i++)
	{
		for( j=0;j<n-1-i;j++)
		{                           //bubble sort
			if(x[j]>x[j+1])
			{
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		}
		
	}
}