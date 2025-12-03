#include<stdio.h>
void average();
void main()
{
	int a,b,c,d,e;
	printf("Enter marks of 5 subjects=");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	average(a,b,c,d,e);
}//main ends here

void average(int a,int b,int c,int d,int e)
{
	int*v=&a;
	int*w=&b;
	int*x=&c;
	int*y=&d;
	int*z=&e;
	int sum,avg;
	sum=*v+*w+*x+*y+*z;
	avg=sum/5;
	printf("average of 5 marks=%d",avg);
}//end of average