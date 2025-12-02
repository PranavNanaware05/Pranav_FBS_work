#include<stdio.h>
intarmstrong(int );
void main()
{
	int n;
	printf("Enter Number=");
	scanf("%d",&n);
	if(armstrong(n)==1)
	{
		printf(" ArmStrong");
	}
	else
	{
		printf("not ArmStrong");
	}
}//end of main()

int armstrong(int n)
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
	 	return 1;
	 }
	 else
	 {
	 	return 0;
	 }
}//end of ArmStrong()