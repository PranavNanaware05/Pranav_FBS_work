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
	int*a=&x;
	float res;
	res=*a**a*3.14;
	printf("Area of cirecle is %f",res);
}