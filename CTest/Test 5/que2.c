#include<stdio.h>
void main()
{
	double n,bsamt=10000;
	printf("initial amount=%lf",bsamt);
	printf("\n1.withdraw\n2.Deposite");
	printf("\nenter your choice=");
	scanf("%lf",&n);
	bank(n,bsamt);
	
}
void bank(double n,double bsamt)
{
	double aw,dp;
	if(n==1)               //withdraw
	{
		printf("enter amount to withdraw=");
		scanf("%lf",&aw);
		if(bsamt>3000)
		{
			bsamt=bsamt-aw;
			printf("%lfrupees withdraw successfully\n remaining balance %lf rupees",aw,bsamt);
		}
		else
		{
			printf("cant withdraw amount balance is not suufficient");
		}
		
	}
	
	
	else if(n==2)      //deposite
	{
		printf("enter amount to deposite=");
		scanf("%lf",&dp);
		
			bsamt=bsamt+dp;
			printf("%lf rupees deposite successfully\n total balance %lf rupees",dp,bsamt);
		
		
	}
	
}