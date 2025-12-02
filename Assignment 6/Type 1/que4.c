#include<stdio.h>
void armstrong_to_n();
void prime_to_n();
void perfect_to_n();
void main()
{
	armstrong_to_n();
	prime_to_n();
	perfect_to_n();
}//end of main
void armstrong_to_n()
{
	int no;
	printf("enter number=");
	scanf("%d",&no);
	for(int j=2;j<=no;j++)
	{
	
	int n=j,rem,org=n,sum=0,a;
	for(int i=n;i>0;i=i/10)
	{
		rem=i%10;
		a=rem*rem*rem;
		sum=sum+a;
	}
	if(sum==org)
	{
		printf("%d \n",sum);
	}
  }
}//end of armstrong_to_n()

void prime_to_n()
{
	int n;
	printf("Enter number=");
	scanf("%d",&n);
	for(int j=1; j<=n; j++) {
		int no=j,flg=0;
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				flg=1;
				break;
			}
		}
		if(flg==0) {
			printf("\n %d",no);
		}

	}
}//end of  prime_to_n()

void perfect_to_n()
{
	int no;
	printf("enter no=");
	scanf("%d",&no);
	
	for(int j=1;j<=no;j++)
	{
	   	int n=j,sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		printf("\n %d",sum);
	}
}
} //end of perfect_to_n()