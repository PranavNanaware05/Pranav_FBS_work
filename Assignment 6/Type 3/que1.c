#include<stdio.h>

void sum(int,int);
void main()
{   int no1,no2;
	printf("Enter two numbers=");
	scanf("%d %d",&no1,&no2);
	sum(no1,no2);
}//main ends here

void sum(int x,int y)
{
	
	int res;
	res=x+y;
	printf("sum of %d and %d is %d",x,y,res);

}//sum ends here