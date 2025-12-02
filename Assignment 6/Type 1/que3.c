#include<stdio.h>
void numbers();
void sum_of_digits();
void prime();
void main()
{
	numbers();
	sum_of_digits();
	prime();
}

void numbers()
{
	int i=1;
	while(i<=10)
	{
		printf("%d\n",i);
		i++;
	}
}
void sum_of_digits()
{
	int i=1,sum=0;
	printf("Sum of digits\n");
	while(i<=5)
	{
		sum=sum+i;
		i++;
	}
	printf("%d",sum);
}
void prime()
{
	int i=2;
	int n=13,cnt=0;
	while(i<n)
	{
		if(n%i==0)
		{
			cnt=1;
			break;
		}
		i++;
	}
	if(cnt==1)
	{
		printf("\nnot Prime no");
	}
	else
	{
		printf("\nPrime no");
	}
}