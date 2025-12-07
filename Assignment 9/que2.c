#include<stdio.h>
void main()
{
	int a[5],b[3];
	printf("enter five numbers=");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	cube(a,5);
}
void cube(int* x,int n)
{
	int c[n];
	printf("\n cube %d elements in an array\n",n);
	for(int i=1;i<n;i++)
	{
		c[i]=i*i*i;
	
	printf("%d,",c[i]);
    }
}