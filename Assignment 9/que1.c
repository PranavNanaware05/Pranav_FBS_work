#include<stdio.h>
void main()
{
	int a[5];
	printf("enter 5 subject marks=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	result(a,5);
}
 
 void result(int *x,int n)
 {
 	int mk, sum=0;
 	for(int i=0;i<n;i++)
 	{
 		sum=sum+x[i];
	 }
	 mk=sum/5;
	 printf("Percentage=%d",mk);
 }