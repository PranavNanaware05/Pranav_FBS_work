#include<stdio.h>
#include<conio.h>
void main()
{
	int size;
	printf("enter size=");
	scanf("%d",&size);
	int arr[size];
	printf("enter array=");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	int i,j;
	for(i=0;i<size-1;i++)
	{
		for(j=0;j<size-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	printf("\n after sorting=");
	for(int i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
}