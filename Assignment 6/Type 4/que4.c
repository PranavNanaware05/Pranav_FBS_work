#include<stdio.h>
float average(int,int,int,int,int);
void main()
{
	int a,b,c,d,e;
	printf("Enter marks of 5 subjects=");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	float av=average(a,b,c,d,e);
	printf("%f",av);
}//main ends here

float average(int a,int b,int c,int d,int e)
{
	float sum,avg;
	sum=a+b+c+d+e;
	avg=sum/5;
	return avg;
}//end of average