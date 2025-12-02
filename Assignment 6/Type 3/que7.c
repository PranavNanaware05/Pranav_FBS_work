#include<stdio.h>
void triangle(int,int,int);
void main()
{
	int a1,a2,a3;
	printf("enter 3 Angle of Triangle=");
	scanf("%d%d%d",&a1,&a2,&a3);
	triangle(a1,a2,a3);
}


void triangle(int a1,int a2,int a3)
{
	
	if((a1==a2)&&(a2==a3))
	{
		printf("Equilateral Triangle");
	}
	else if((a1==a2)||(a1==a3)||(a2==a3))
	{
		printf("Isosceles Triangle");
	}
	else
	 {
	 	printf("Scalene Triangle");
	 }
}