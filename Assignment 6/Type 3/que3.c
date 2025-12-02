#include<stdio.h>
void sum(int ,int);
void main()
{
	int no1,no2;
	printf("Enter two numbers=");
	scanf("%d %d",&no1,&no2);
	swap(no1,no2);
}//main ends here
void swap(int a,int b)
{
	int c;
	a=10;
	b=20;
	printf("Before Swapping\n");
	printf("A=%d",a);
	printf("B=%d",b);
	
	c=a;
	a=b;
	b=c;
	
	printf("\nAfter Swapping");
	printf("A=%d",a);
	printf("B=%d",b);
}////swap ends here