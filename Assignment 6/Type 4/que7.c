#include<stdio.h>
int isprime(int);
void main()
{
	int a;
	printf("Enter a Number=");
	scanf("%d",&a);
	
    if(isprime(a)==1)
    {
    	printf("not Prime no");
	}
	else
	{
		printf("Prime no");
	}
}//end of main()
int isprime(int n)
{

	int i=2;
	int cnt=0;
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
		return 1;
	}
	else
	{
		return 0;
	}
}//end of isprime()