#include<stdio.h>
void main()
{
	int len,n,count=-1;
	printf("enter length=");
	scanf("%d",&len);
	int *a=(int*)malloc(sizeof(int)*len);
	printf("enter array elements=");
	for(int i=0;i<len;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter element to search=");
	scanf("%d",&n);
	for(int i=0;i<len;i++)
	{
		if(a[i]==n)
		{
			count=1;
		}
	}
	if(count==1)
	{
		printf("element found");
	}
	else
	{
		printf("element not found");
	}
}