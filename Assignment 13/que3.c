#include<stdio.h>
#include<stdlib.h>
void main()
{
	int len,sum=0;
	printf("enter length=");
	scanf("%d",&len);
	int *arr=(int*)malloc(sizeof(int)*len);
	printf("enter array elements=");
	for(int i=0;i<len;i++)
	{
		scanf("%d",&arr[i]);
		sum=sum+arr[i];
	}
	printf("sum of an array elements=%d",sum);
}