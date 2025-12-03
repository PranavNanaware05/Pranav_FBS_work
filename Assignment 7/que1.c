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
	
	int *a=&x;
	int *b=&y;
	int res;
	res=*a+*b;
	printf("Sum=%d",res);

}//sum ends here