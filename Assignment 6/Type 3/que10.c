#include<stdio.h>
void armstrong(int );
void main()
{
	int n;
	printf("Enter Number=");
	scanf("%d",&n);
	armstrong(n);
}

void armstrong(int n)
{
	int rem,sum=0,cube,og=n;
	while(n>0)
	{
		rem=n%10;
		cube=rem*rem*rem;
		sum=sum+cube;
		n=n/10;
	}
	   
	if(og==sum)
	 {
	 	printf(" ArmStrong");
	 }
	 else
	 {
	 	printf("not ArmStrong");
	 }
}