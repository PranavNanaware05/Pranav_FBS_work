#include<stdio.h>
void main()
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
}