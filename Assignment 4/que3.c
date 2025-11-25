#include<stdio.h>
void main()
{
	int no;
	printf("enter no=");
	scanf("%d",&no);
	
	for(int j=1;j<=no;j++)
	{
	   	int n=j,sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		printf("\n %d",sum);
	}
}
}