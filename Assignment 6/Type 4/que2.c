#include<stdio.h>
float area(int,int);
void main()
{
	int h,b;
	printf("enter length width=");
	scanf("%d %d",&h,&b);
	float res=area(h,b);
	printf("Area of Triangle=%f",res);
	
}//main ends here

 float area(int x,int y)
{
	float ar;
	ar=0.5*x*y;
	return ar;
}//area ends here