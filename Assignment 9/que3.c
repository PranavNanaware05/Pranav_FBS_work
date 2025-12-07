#include<stdio.h>
void main()
{
	int a[5],b[10];
	printf("enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("enter 10 elements=");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&b[i]);
	}
	isprime(a,5);
	isprime(b,10);
}
void isprime(int* x,int n)
{

	for(int i=0;i<n;i++)
	{
	   int flg=0;
	   int 	c=x[i];
	   for(int j=2;j<c;j++)
	   {
	   	if(c%j==0)
	   	{
	   		flg=1;
	   		break;
		   }
	   }
	   if(flg==0)
	   {
	   	
	   		printf("%d ",c);
		
	   }
	}
}