#include<stdio.h>
float area(int);
void main()
{
	int rad;
	printf("Enter radius=");
	scanf("%d",&rad);
	float r=area(rad);
	printf("Area of Circle=%f",r);
}//main ends here

float area(int x)
{
	float res;
	res=x*x*3.14;
	return res;
}////area ends here