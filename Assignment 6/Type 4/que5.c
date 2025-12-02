#include<stdio.h>
int triangle(int,int,int);
void main()
{
	int a1,a2,a3;
	printf("enter 3 Angle of Triangle=");
	scanf("%d%d%d",&a1,&a2,&a3);
	int res=triangle(a1,a2,a3);
	if(res==1)
	{
		printf("Equilateral Triangle");
	}
	else if(res==0)
	{
		printf("Isosceles Triangle");
	}
	else
	{
		printf("Scalene Triangle");
	}
}//end of main()


int triangle(int a1,int a2,int a3)
{
	
	if((a1==a2)&&(a2==a3))
	{
		return 0;
	}
	else if((a1==a2)||(a1==a3)||(a2==a3))
	{
		return 1;
	}
	else
	 {
	 	return -1;
	 }
}//end of triangle()