#include<stdio.h>
void isprime(int);
void main()
{
	int a;
	printf("Enter a Numbers=");
	scanf("%d",&a);
	
	isprime(a);
}
void isprime(int a)
{

    int *n=&a;
	int i=2;
	int cnt=0;
	while(i<*n)
	{
		if(*n%i==0)
		{
			cnt=1;
			break;
		}
		i++;
	}
	if(cnt==1)
	{
		printf("not Prime no");
	}
	else
	{
		printf("Prime no");
	}
}