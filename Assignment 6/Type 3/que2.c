#include<stdio.h>
void area(int);
void main()
{
	int rad;
	printf("Enter radius=");
	scanf("%d",&rad);
	area(rad);
}//main ends here

void area(int x)
{
	float res;
	res=x*x*3.14;
	printf("Area of cirecle is %f",res);
}